package science.mengxin.java.effective.generic;

/**
 * User:    mengxin
 * Date:    28/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.generic
 * Description: GenericMethod.
 *
 * @author mengxin
 * @version 1.0
 */
public class GenericMethod {
    public <K,V> void f(K k,V v) {
        System.out.println(k.getClass().getSimpleName());
        System.out.println(v.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        //使用了类型推导
        gm.f(0, "generic");
    }
}

