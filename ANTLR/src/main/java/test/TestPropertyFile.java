package test;

import antlr.PropertyFileBaseListener;
import antlr.PropertyFileLexer;
import antlr.PropertyFileParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.OrderedHashSet;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;

/**
 * @Author Administrator
 * @Date 2023/6/8 16:28
 * @Version 1.0
 * Desc:
 */
public  class TestPropertyFile {
    public static void main(String[] args) {
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();//新建一个标准的ANTLR语法分析树遍历器
        //新建一个监听器，将其传递给遍历器
        PropertyFileLoader loader = new PropertyFileLoader();
        String  arr ="user=\"parrt\"\n" +
                "machine=\"maniac\"\n";
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(arr);
        //新建词法分析器 处理输入的charStream
        PropertyFileLexer propertyFileLexer = new PropertyFileLexer(antlrInputStream);

        //新建词法符号缓冲区，用于存储词法分析器将生成的词法符号
        CommonTokenStream commonTokenStream = new CommonTokenStream(propertyFileLexer);

        PropertyFileParser propertyFileParser = new PropertyFileParser(commonTokenStream);
        PropertyFileParser.PropContext prop = propertyFileParser.prop();
        parseTreeWalker.walk(loader,prop);
    }
}
class  PropertyFileLoader extends PropertyFileBaseListener {
    @Override
    public void exitProp(PropertyFileParser.PropContext ctx) {
        HashMap<String, String> prop = new HashMap<>();
        String string = ctx.STRING().getText();
        String id = ctx.ID().getText();
        prop.put(id,string);

        System.out.println(prop.get("user"));
    }
}
