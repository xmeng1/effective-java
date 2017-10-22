package science.mengxin.java.effective.item34;

/**
 * User:    mengxin
 * Date:    22/10/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item34
 * Description: BasicOperation.
 *
 * @author mengxin
 * @version 1.0
 */
public enum BasicOperation implements Operation {
    PLUS("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;
    BasicOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public double apply(double x, double y) {
        return 0;
    }


    @Override
    public String toString() {
        return symbol;
    }
}
