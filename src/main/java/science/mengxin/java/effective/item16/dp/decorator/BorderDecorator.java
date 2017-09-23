package science.mengxin.java.effective.item16.dp.decorator;

/**
 * User:    mengxin
 * Date:    23/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item16.dp.decorator
 * Description: BorderDecorator.
 *
 * @author mengxin
 * @version 1.0
 */

// 6. Optional embellishment
public class BorderDecorator extends Decorator {
    //we can extend more property for the concrete decorator
    private Integer borderWidth;

    public BorderDecorator( Widget w, Integer borderWidth ) {
        super( w );
        this.borderWidth = borderWidth;
    }
    public void draw() {
        super.draw(); // 7. Delegate to base class and add extra stuff
        this.drawBorder(this.borderWidth);
        System.out.println("  BorderDecorator");
    }

    private void drawBorder(Integer borderWidth) {
        System.out.println("  drawBorder width: " + borderWidth);
    }
}
