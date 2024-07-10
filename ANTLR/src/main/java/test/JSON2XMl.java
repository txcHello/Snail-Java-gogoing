package test;

import antlr.JSONBaseListener;

import antlr.JSONParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import javax.print.DocFlavor;

/**
 * @Author Administrator
 * @Date 2023/6/9 10:27
 * @Version 1.0
 * Desc:
 */
public class JSON2XMl {
    public static void main(String[] args) {

    }
}

class  XMLEmitter extends JSONBaseListener{
    private  ParseTreeProperty<String> xml ;

    public String getXml(ParseTree ctx) {
        String s = xml.get(ctx);
        return  s ;
    }

    public void setXml(ParseTree ctx ,String s ) {

            xml.put(ctx,s);
    }

    @Override
    public void exitAtom(JSONParser.AtomContext ctx) {
        String text = ctx.getText();
        xml.put(ctx,text);
    }

    @Override
    public void exitString(JSONParser.StringContext ctx) {
        xml.put(ctx,ctx.getText());
    }

    @Override
    public void exitObjectValue(JSONParser.ObjectValueContext ctx) {
        setXml(ctx, getXml(ctx.object()));
    }

    @Override
    public void exitPair(JSONParser.PairContext ctx) {
        String tag = ctx.STRING().getText();
        JSONParser.ValueContext  vctx = ctx.value();
        String x= String.format("<%s>%s<%s>\n",tag,getXml(vctx),tag);
        setXml(ctx,x);
    }

    @Override
    public void exitAnObject(JSONParser.AnObjectContext ctx) {
        StringBuilder buf = new StringBuilder();
        buf.append("\n");
        for (JSONParser.PairContext pairContext : ctx.pair()) {
            buf.append(getXml(pairContext));
        }
            setXml(ctx,buf.toString());
        }

    @Override
    public void exitEmptyObject(JSONParser.EmptyObjectContext ctx) {
        setXml(ctx,"");
    }

    @Override
    public void exitArrayOfValue(JSONParser.ArrayOfValueContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        for (JSONParser.ValueContext valueContext : ctx.value()) {
            stringBuilder.append("<element>");
            stringBuilder.append(getXml(valueContext));
            stringBuilder.append("</element>")
                    .append("\n");
        }
    }

    @Override
    public void exitEmptyArray(JSONParser.EmptyArrayContext ctx) {
        setXml(ctx,"");
    }

    @Override
    public void exitJson(JSONParser.JsonContext ctx) {
        setXml(ctx,getXml(ctx.getChild(0)));
    }
}
