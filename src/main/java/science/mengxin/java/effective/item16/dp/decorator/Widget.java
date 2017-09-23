package science.mengxin.java.effective.item16.dp.decorator;

/**
 * User:    mengxin
 * Date:    23/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item16.dp.decorator
 * Description: Widget.
 *
 * @author mengxin
 * @version 1.0
 */

// 1. "lowest common denominator"
// in order to implement the decorator, we need to abstract the interface from the class need to extend.
public interface Widget {

    void draw();
}
