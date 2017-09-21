package science.mengxin.java.effective.item2.dp.abstract_factory;

/**
 * User:    mengxin
 * Date:    13/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.science.mengxin.java.effective.item2.dp.abstract_factory
 * Description: Expression.
 *
 * @author mengxin
 * @version 1.0
 */
public class Expression {
    protected String str;
    public Expression(String s) {
        str = s;
    }
    public Expression cloan() {
        return null;
    }
    public String toString() {
        return str;
    }
}
