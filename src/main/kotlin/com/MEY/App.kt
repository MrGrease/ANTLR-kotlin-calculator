package com.MEY

import com.MEY.Calculator
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import java.io.File
import java.lang.UnsupportedOperationException

fun main(args: Array<String>)
{
    //Variable that holds the current line in case of an error
    var line = 1;

    try {
        //get both paths from the args array
         val input = File(args[0])
         val output =File(args[1])
        //Check if the input path leads to a file
        if(!input.isFile())
        {
            //If the input file is not a file then throw an illegal argument exception
            throw java.lang.IllegalArgumentException("Please provide an input file.")
        }
        //Declare two arraylists to hold the inputs and outputs
        val inputs: MutableList<String> = ArrayList()
        val outputs: MutableList<String> = ArrayList()
        //Add each input line to the input array
        File(args[0]).forEachLine { inputs.add(it) }

        //Evaluation section starts here:

        //For each input indices, use the calculate function
        for (i in inputs.indices){
            //Add to outputs array
            outputs.add(calculate(inputs[i]).toString())

        }


        //Clear the output file
        output.writeText("");
        //for each input append an output to the output file
        for(i in inputs.indices) {
            //Write results into output file line by line

            //if one of the outputs is null that means something has gone wrong so we throw an exception and trash the entire file
            if(outputs[i] == "null")
            {
                throw UnsupportedOperationException()
            }

            output.appendText(outputs[i] + System.lineSeparator())

            //Increment line for error tracking
            line++
        }
    }
    catch (e: java.lang.ArrayIndexOutOfBoundsException) {
        //In case of missing arguments print an error
        println("Please enter both the input and output file paths as arguments.")
    }catch(e :java.lang.IllegalArgumentException){
        println(e.message)
    }
    catch(e: java.lang.UnsupportedOperationException)
    {
        val output =File(args[1])
        //Clear the output file
        output.writeText("Syntax error at line " + line);

    }


}

fun calculate(source: String): Double? {
    val input = CharStreams.fromString(source)
    return compile(input)
}

 fun compile(source: CharStream): Double? {
    val lexer = arithmeticLexer(source)
    val tokenStream = CommonTokenStream(lexer)
    val parser = arithmeticParser(tokenStream)
    val tree: ParseTree = parser.start()
    val visitor = Calculator()
    return visitor.visit(tree)
}