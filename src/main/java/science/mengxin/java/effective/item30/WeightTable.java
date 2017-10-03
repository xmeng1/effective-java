package science.mengxin.java.effective.item30;

/**
 * User:    mengxin
 * Date:    03/10/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item30
 * Description: WeightTable.
 *
 * @author mengxin
 * @version 1.0
 */
public class WeightTable {
    public static void main(String[] args) {
        //double earthWeight = Double.parseDouble(args[0]);
        double earthWeight = Double.parseDouble("175.0000");
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values()) {
            System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
        }
    }
}
