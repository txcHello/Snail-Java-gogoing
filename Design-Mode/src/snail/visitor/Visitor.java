package snail.visitor;

/**
 * @Author Administrator
 * @Date 2023/5/13 12:44
 * @Version 1.0
 * Desc:
 */
public interface Visitor {
    public  void  visit(Beijing beijing );
    public  void  visit(Shanghai shanghai );
    public  void  visit(Shenzhen shenzhen );

}
