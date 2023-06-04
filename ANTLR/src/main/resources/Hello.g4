grammar Hello; //定义一个语法
r : 'hello' ID; //匹配一个关键字hello 和一个紧随其后的 标识符；
//assgom: ID  '=' expr  ';' ;

ID: [a-z]+;  //匹配小写字母组成的标识符
WS:[ \t\t\n]->skip; //忽略 空格 \t \r \n
