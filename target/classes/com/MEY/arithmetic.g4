grammar arithmetic;


start: operation;

operation
    : NUMBER                                        # Num
    |'(' inner=operation ')'                        # Par
    | left=operation operator='^' right=operation   # Pow
    | left=operation operator='e' right=operation   # Sce
    | left=operation operator='*' right=operation   # Mulp
    | left=operation operator='/' right=operation   # Div
    | left=operation operator='+' right=operation   # Add
    | left=operation operator='-' right=operation   # Sub



;



NUMBER
   : ('0' .. '9') + ('.' ('0' .. '9') +)?
   ;

WS : (' ' | '\t')+ -> channel(HIDDEN);