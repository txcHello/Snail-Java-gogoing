grammar Calculator; //表示文件是一个词法，语法混合的文件。名称必须和文件名字相同


//语法单元以小写字母开发

line: expr EOF;
expr: '(' expr ')'         # parenExpr  //# 是产生式标签，起到标记不同规则
    | expr ('*'|'/') expr  # multOrDiv
    | expr ('+'|'-') expr  # addOrSubtract
    | FLOAT                # float;

//词法单元以大写字母开头
WS: [ \t\n\r]+ ->skip ;    //词法规则  ->skip 是antlr4的特殊命令，表示跳过不做任何处理
FLOAT:DIGIT + '.' DIGIT*EXPONENT?
     |'.' DIGIT+EXPONENT?
     | DIGIT+EXPONENT? ;
fragment DIGIT : '0'..'9';   // '0'..'9'  表示0~9的字符
fragment EXPONENT :('e'+'E') ('+'+'-')? DIGIT+;  //fragment 词片段的问题 不会生成对应的token


