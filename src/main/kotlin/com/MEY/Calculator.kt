package com.MEY
import com.MEY.arithmeticBaseVisitor
import com.MEY.arithmeticParser

class Calculator : arithmeticBaseVisitor<Double>() {

    //This class uses the visitor pattern to recursively evaluate every single DEFINED operation
    //Each overridden function is provided with the appropriate context which is used to extract the variables of the operation

    override fun visitNum(ctx: arithmeticParser.NumContext): Double {
        return ctx.NUMBER().getText().toDouble()
    }

    override fun visitPar(ctx: arithmeticParser.ParContext): Double {
        return visit(ctx.inner)
    }

    override fun visitPow(ctx: arithmeticParser.PowContext): Double {
        return Math.pow(visit(ctx.left), visit(ctx.right))
    }

    override fun visitMulp(ctx: arithmeticParser.MulpContext): Double {
        return visit(ctx.left) * visit(ctx.right)
    }

    override fun visitDiv(ctx: arithmeticParser.DivContext): Double {
        return visit(ctx.left) / visit(ctx.right)
    }

    override fun visitAdd(ctx: arithmeticParser.AddContext): Double {
        return visit(ctx.left) + visit(ctx.right)
    }

    override fun visitSub(ctx: arithmeticParser.SubContext): Double {
        return visit(ctx.left) - visit(ctx.right)
    }

    override fun visitSce(ctx: arithmeticParser.SceContext): Double {
        return visit(ctx.left) * Math.pow(10.0,visit(ctx.right))
    }
}