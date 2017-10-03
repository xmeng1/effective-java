package science.mengxin.java.effective.item30;

/**
 * User:    mengxin
 * Date:    03/10/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item30
 * Description: Operation.
 *
 * @author mengxin
 * @version 1.0
 */

// Enum type that switches on its own value - questionable
// 1. the throw statement should not be executed
// 2. if add more constant, cannot forget to statement to process in switch, because every constant should implement the abstract method.
public enum Operation {
    PLUS, MINUS, TIMES, DIVIDE;

    // Do the arithmetic op represented by this constant
    double apply(double x, double y) {
        switch (this) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            // default:
            //     return 0;
        }
        throw new AssertionError("Unknown op: " + this);

    }

}