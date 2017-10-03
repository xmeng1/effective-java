package science.mengxin.java.effective.item30;

import java.util.HashMap;
import java.util.Map;

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

// Enum type with constant-specific class bodies and data
public enum OperationBetter2 {

    PLUS("+") {
        double apply(double x, double y) {
            return x + y;
        }
    }, MINUS("-") {
        double apply(double x, double y) {
            return x - y;
        }
    }, TIMES("*") {
        double apply(double x, double y) {
            return x * y;
        }
    }, DIVIDE("/") {
        double apply(double x, double y) {
            return x / y;
        }
    };
    private final String symbol;

    OperationBetter2(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }


    abstract double apply(double x, double y);

    // Implementing a fromString method on an enum type
    private static final Map<String, OperationBetter2> stringToEnum
            = new HashMap<String, OperationBetter2>();

    static { // Initialize map from constant name to enum constant
        for (OperationBetter2 op : values()) {
            stringToEnum.put(op.toString(), op);
        }
    }

    // Returns Operation for string, or null if string is invalid
    public static OperationBetter2 fromString(String symbol) {

        return stringToEnum.get(symbol);
    }
}