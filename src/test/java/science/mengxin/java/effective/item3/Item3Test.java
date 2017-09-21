package science.mengxin.java.effective.item3;

import static junit.framework.TestCase.assertTrue;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.Assert;
import org.junit.Test;

/**
 * User:    mengxin
 * Date:    14/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.science.mengxin.java.effective.item3
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

    //@Test(expected = Elvis1ImproveException.class)
    @Test
    public void Elvis1ImproveReflectionTest() {
        Elvis1Improve elvis1 = Elvis1Improve.INSTANCE;
        System.out.println(elvis1);

        // according to refection, we create second instance which is different.
        Constructor<Elvis1Improve> constructor=
                (Constructor<Elvis1Improve>) Elvis1Improve.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        Elvis1Improve elvis2 = null;
        try {
            //throw the Elvis1ImproveException
            elvis2 = constructor.newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            assertTrue(e instanceof InvocationTargetException);
            //the exception is throw in the private constructor
            assertTrue(e.getCause() instanceof Elvis1ImproveException);
        }
        // System.out.println(elvis2);

        // assert elvis2 == null;

    }

    @Test
    public void Elvis2Deserializable() throws Exception{

        //serializable
        serializable(Elvis2.getInstance(), "test");

        //deserializable
        Elvis2 singleton = deserializable("test");

        //the instance change!!!
        Assert.assertNotEquals(singleton, Elvis2.getInstance());
    }

    @Test
    public void Elvis2ImprovedDeserializable() throws Exception{

        //serializable
        serializable(Elvis2Improve.getInstance(), "test");

        //deserializable
        Elvis2Improve singleton = deserializable("test");

        //the instance is same!!!
        Assert.assertEquals(singleton, Elvis2Improve.getInstance());
    }


    @Test
    public void Elvis3ReflectionTest() {
        Elvis3 elvis3_1 = Elvis3.INSTANCE;
        System.out.println(elvis3_1);
        // according to refection, we create second instance which is different.
        try {
            Constructor<Elvis3> constructor =
                    (Constructor<Elvis3>) Elvis3.class.getDeclaredConstructors()[0];
            constructor.setAccessible(true);
        } catch (IllegalArgumentException e){
            //cannot
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void Elvis3Deserializable() throws Exception{

        //serializable
        serializable(Elvis3.INSTANCE, "test");

        //deserializable
        Elvis3 singleton = deserializable("test");

        //the instance is same!!!
        Assert.assertEquals(singleton, Elvis3.INSTANCE);
    }

    private <T> void serializable (T singleton, String filename) throws IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(singleton);
        oos.flush();
    }

    @SuppressWarnings("unchecked")
    private <T> T deserializable(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        return (T) ois.readObject();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExpected()
    {
        throw new IllegalArgumentException();
    }
}
