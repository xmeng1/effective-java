package science.mengxin.java.effective.item34;

import java.util.Arrays;
import java.util.Collection;

/**
 * User:    mengxin
 * Date:    22/10/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item34
 * Description: Client.
 *
 * @author mengxin
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // double x = Double.parseDouble(args[0]);
        // double y = Double.parseDouble(args[1]);
        double x = Double.parseDouble("2");
        double y = Double.parseDouble("4");
        test(Arrays.asList(ExtendedOperation.values()), x, y);
    }

    private static void test(Collection<? extends Operation> opSet, double x, double y) {
        for (Operation op : opSet) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }
}
