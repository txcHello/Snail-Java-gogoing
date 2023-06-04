grammar demo;

stat: expr ';'
    | ID '(' ')' ';'
    ;
expr: ID '(' ')'
    |INT
    ;

ID: [a-z]+;  //匹配小写字母组成的标识符
WS:[ \t\t\n]->skip; //忽略 空格 \t \r \n
