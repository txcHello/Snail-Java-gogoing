grammar CSV;

file: hdr  row+;
hdr : row;
row : field (','field)* '\r' ? '\n';  //一列由逗号分隔且由换行符终止的字段；
field : TEXT
      |STRING
      |
      ;
TEXT: ~[,\n\r"]+ ;
STRING:'"'('""'|~'"')* '"'; //两个双引号是对双引号的转义
