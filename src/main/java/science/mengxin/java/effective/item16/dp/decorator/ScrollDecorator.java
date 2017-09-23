package science.mengxin.java.effective.item16.dp.decorator;

/**
 * User:    mengxin
 * Date:    23/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item16.dp.decorator
 * Description: ScrollDecorator.
 *
 * @author mengxin
 * @version 1.0
 */
// 6. Optional embellishment
class ScrollDecorator extends Decorator {
    public ScrollDecorator( Widget w ) {
        super( w );
    }
    public void draw() {
        super.draw(); // 7. Delegate to base class and add extra stuff
        System.out.println( "  ScrollDecorator" );
    }
}
