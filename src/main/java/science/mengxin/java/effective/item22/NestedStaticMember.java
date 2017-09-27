package science.mengxin.java.effective.item22;

/**
 * User:    mengxin
 * Date:    26/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item22
 * Description: NestedStaticMember.
 *
 * @author mengxin
 * @version 1.0
 */
public class NestedStaticMember {

    static enum Operation {
        PLUS,
        MINUS
    }

    static Double operatior(Operation operation, Double a, Double b) {
        switch (operation) {
            case PLUS:
                return a + b;
            case MINUS:
                return a - b;
            default:
                return 0D;
        }
    }
}
