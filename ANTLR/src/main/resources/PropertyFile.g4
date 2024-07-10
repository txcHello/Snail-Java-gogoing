grammar PropertyFile;
file : prop+;
prop : ID '=' STRING '\n';
ID : [a-zA-Z]+ ;
STRING :'"'  .*?  '"';
WS:[ \t\t\n]->skip; //忽略 空格 \t \r \