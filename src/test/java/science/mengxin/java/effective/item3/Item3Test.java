package science.mengxin.java.effective.item3;

import item3.Elvis1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.Test;

/**
 * User:    mengxin
 * Date:    14/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item3
 * Description: Item3Test.
 *
 * @author mengxin
 * @version 1.0
 */
public class Item3Test {
    @Test
    public void Elvis1Test() {
        Elvis1 elvis1 = Elvis1.INSTANCE;
        elvis1.leaveTheBuilding();
    }


    /**
     * According to this test, we implement the attack for the first method of singleton
     *  in Effective Java 2rd. (Singleton with public final field)
     *
     *  Nothing that a client does can change this, with one caveat: a privileged client can invoke the private constructor reflectively (Item 53) with the aid of the AccessibleObject.setAccessible method. If you need to defend against this attack, modify the constructor to make it throw an exception if it’s asked to create a second instance.
     */
    @Test
    public void Elvis1ReflectionTest() {
        Elvis1 elvis1 = Elvis1.INSTANCE;
        System.out.println(elvis1);

        // according to refection, we create second instance which is different.
        Constructor<Elvis1> constructor=
                (Constructor<Elvis1>) Elvis1.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        Elvis1 elvis2 = null;
        try {
            elvis2 = constructor.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(elvis2);

        assert elvis1 != elvis2;

    }
}
