package science.mengxin.java.effective.generic;

import java.util.ArrayList;

/**
 * User:    mengxin
 * Date:    28/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.generic
 * Description: ErasedTypeEquivalence.
 *
 * @author mengxin
 * @version 1.0
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        //because the type of generic will be erased in runtime, so the c1 is equal to c2
        System.out.println(c1 == c2);
    }
}
