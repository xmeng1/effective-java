package science.mengxin.java.effective.item16.dp.decorator;

/**
 * User:    mengxin
 * Date:    23/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item16.dp.decorator
 * Description: TextField.
 *
 * @author mengxin
 * @version 1.0
 */

// 3. "Core" class with "is a" relationship
// This class is the target we need to extend.
// It means that we need to add more function to this function
public class TextField implements Widget {

    private int width, height;

    public TextField(int w, int h) {
        width = w;
        height = h;
    }

    @Override
    public void draw() {
        System.out.println("TextField: " + width + ", " + height);
    }

    @Override
    public void resize() {
        System.out.println("resize: ");
    }
}
