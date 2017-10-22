package science.mengxin.java.effective.item34;

/**
 * User:    mengxin
 * Date:    22/10/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item34
 * Description: Operation.
 *
 * @author mengxin
 * @version 1.0
 */

// Emulated extensible enum using an interface
public interface Operation {
    double apply(double x, double y);
}
