
grammar SimpleExpr;

//*: 程序由0个或多个语句(stat)构成    EOF代表文件结束符，
prog : stat* EOF ;
//stat(语句):  每个语句由 表达式（expr）+ ; 分号构成
stat : expr ';'
     | ID '=' expr ';'  //ID为词法单元  词法单元字母大写
     | 'if' expr ';'
     ;
//表达式   顺序表示优先级
expr  : expr  ('*'|'/') expr
      | expr  ('+'|'-') expr
      | ID
      | INT
      ;
//ID 代表标识符
//ID : ([a-zA-Z]|'_')([a-zA-Z0-9]|'_')*;
ID : ( LETTER | '_' ) | ( LETTER | DIGIT | '_' )* ;
//数字
INT :  [0-9]+;
//定义空白符
WS : [ \t\r\n]+ -> skip ;

// 识别单独字母不是token 单元， 语法碎片
fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;