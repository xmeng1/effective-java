package science.mengxin.java.effective.item16.dp.decorator;

/**
 * User:    mengxin
 * Date:    23/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item16.dp.decorator
 * Description: Decorator.
 *
 * @author mengxin
 * @version 1.0
 */

// 2. Second level base class with "isa" relationship
// this is the decorator class which also can be called forwarding class
// which implement the same interface with the target need to extend
public class Decorator implements Widget {

    // this is the forwarding target, an implement of interface.
    private Widget wid; // 4. "has a" relationship

    public Decorator(Widget w) {
        wid = w;
    }

    // 5. Delegation.
    // even the decorator implement the interface,
    // but the real method that is invoked is the corresponding method of forwarding object.
    public void draw() {
        wid.draw();
    }
}
