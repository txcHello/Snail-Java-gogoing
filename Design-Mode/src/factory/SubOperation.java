package factory;

/**
 * @Author Administrator
 * @Date 2023/2/2 15:34
 * @Version 1.0
 * Desc:
 */
public class SubOperation extends Operation{
    @Override
    public Double operate(double a, double b) {
        return a-b;
    }
}
