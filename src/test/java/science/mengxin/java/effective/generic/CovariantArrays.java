package science.mengxin.java.effective.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User:    mengxin
 * Date:    01/10/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.generic
 * Description: CovariantArrays.
 * <p>数组的协变</p>
 *
 * @author mengxin
 * @version 1.0
 */

class Fruit {}
class Apple extends Fruit {}
class Jonathan extends Apple {}
class Orange extends Fruit {}

public class CovariantArrays {
    public static void main(String[] args) {     
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple(); // OK
        fruit[1] = new Jonathan(); // OK
        // Runtime type is Apple[], not Fruit[] or Orange[]:
        try {
            // Compiler allows you to add Fruit:
            fruit[0] = new Fruit(); // ArrayStoreException
        } catch(Exception e) { System.out.println(e); }
        try {
            // Compiler allows you to add Oranges:
            fruit[0] = new Orange(); // ArrayStoreException
        } catch(Exception e) { System.out.println(e); }

        // 泛型不支持协变。
        // Compile Error: incompatible types:
        // ArrayList<Fruit> flist = new ArrayList<Apple>();


        // Wildcards allow covariance:
        List<? extends Fruit> flist = new ArrayList<Apple>();
    }
}

class GenericsAndCovariance {
    public static void main(String[] args) {
        // Wildcards allow covariance:
        List<? extends Fruit> flist = new ArrayList<Apple>();
        // Compile Error: can’t add any type of object:
        // flist.add(new Apple());
        // flist.add(new Fruit());
        // flist.add(new Object());
        flist.add(null); // Legal but uninteresting
        // We know that it returns at least Fruit:
        Fruit f = flist.get(0);
    }
}

class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple a = (Apple)flist.get(0); // No warning
        flist.contains(new Apple()); // Argument is ‘Object’
        flist.indexOf(new Apple()); // Argument is ‘Object’

        //flist.add(new Apple());  无法编译

    }
}

class Holder<T> {
    private T value;
    public Holder() {}
    public Holder(T val) { value = val; }
    public void set(T val) { value = val; }
    public T get() { return value; }
    public boolean equals(Object obj) {
        return value.equals(obj);
    }
    public static void main(String[] args) {
        Holder<Apple> Apple = new Holder<Apple>(new Apple());
        Apple d = Apple.get();
        Apple.set(d);
        // Holder<Fruit> Fruit = Apple; // Cannot upcast
        Holder<? extends Fruit> fruit = Apple; // OK
        Fruit p = fruit.get();
        d = (Apple)fruit.get(); // Returns ‘Object’
        try {
            Orange c = (Orange)fruit.get(); // No warning
        } catch(Exception e) { System.out.println(e); }
        // fruit.set(new Apple()); // Cannot call set()
        // fruit.set(new Fruit()); // Cannot call set()
        System.out.println(fruit.equals(d)); // OK
    }
} /* Output: (Sample)
java.lang.ClassCastException: Apple cannot be cast to Orange
true
*///:~

class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
        //apples.add(new Fruit()); // Error
    }
}

class Collections {
    public static <T> void copy(List<? super T> dest, List<? extends T> src)
    {
        for (int i=0; i<src.size(); i++)
            dest.set(i,src.get(i));
    }
}
