package science.mengxin.java.effective.item16.dp.decorator;

/**
 * User:    mengxin
 * Date:    23/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item16.dp.decorator
 * Description: DecoratorDemo.
 *
 * @author mengxin
 * @version 1.0
 */
public class DecoratorDemo {
    public static void main( String[] args ) {
        // 8. Client has the responsibility to compose desired configurations
        Widget aWidget = new BorderDecorator(
                new BorderDecorator(
                        new ScrollDecorator(
                                new TextField( 80, 24 ))));
        aWidget.draw();
    }
}