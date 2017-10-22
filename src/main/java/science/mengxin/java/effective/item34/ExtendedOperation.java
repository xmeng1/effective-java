package science.mengxin.java.effective.item34;

/**
 * User:    mengxin
 * Date:    22/10/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item34
 * Description: ExtendedOperation.
 *
 * @author mengxin
 * @version 1.0
 */
public enum  ExtendedOperation implements Operation {

    EXP("^") {
        public double apply ( double x, double y){
            return Math.pow(x, y);
        }
    },

    REMAINDER("%") {
        public double apply ( double x, double y){
            return x % y;
        }
    }

    ;

    private final String symbol;

    ExtendedOperation(String symbol) {

        this.symbol = symbol;
    }

    @Override
    public String toString() {

        return symbol;
    }

}

