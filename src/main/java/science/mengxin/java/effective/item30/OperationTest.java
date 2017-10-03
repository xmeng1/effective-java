package science.mengxin.java.effective.item30;

/**
 * User:    mengxin
 * Date:    03/10/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item30
 * Description: OperationTest.
 *
 * @author mengxin
 * @version 1.0
 */
public class OperationTest {

    public static void main(String[] args) {
        // double x = Double.parseDouble(args[0]);
        // double y = Double.parseDouble(args[1]);
        double x = Double.parseDouble("2");
        double y = Double.parseDouble("4");
        for (Operation op : Operation.values()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }

        for (OperationBetter op : OperationBetter.values()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }

        for (OperationBetter2 op : OperationBetter2.values()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }

        Double result = OperationBetter2.MINUS.apply(4,5);
    }
}
