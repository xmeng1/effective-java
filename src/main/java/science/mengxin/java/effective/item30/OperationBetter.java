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

// Enum type with constant-specific method implementations
public enum OperationBetter {
    PLUS {
        double apply(double x, double y) {
            return x + y;
        }
    }, MINUS {
        double apply(double x, double y) {
            return x - y;
        }
    }, TIMES {
        double apply(double x, double y) {
            return x * y;
        }
    }, DIVIDE {
        double apply(double x, double y) {
            return x / y;
        }
    };

    abstract double apply(double x, double y);

}