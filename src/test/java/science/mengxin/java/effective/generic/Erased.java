package science.mengxin.java.effective.generic;

/**
 * User:    mengxin
 * Date:    28/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.generic
 * Description: Erased.
 *
 * @author mengxin
 * @version 1.0
 */
public class Erased<T> {
    private final int SIZE = 100;
    //这段代码是错误，通过 new T() 创建对象是不行的，
    // 一是由于类型擦除，二是由于编译器不知道 T 是否有默认的构造器。

    // public static void f(Object arg) {
    //     if(arg instanceof T) {} // Error
    //     T var = new T(); // Error
    //     T[] array = new T[SIZE]; // Error
    //     T[] array = (T)new Object[SIZE]; // Unchecked warning
    // }
}

//有时候还会专门传入一个类型信息 clazz

//一种解决的办法是传递一个工厂对象并且通过它创建新的实例。
interface FactoryI<T> {
    T create();
}
class Foo2<T> {
    private T x;
    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create();
    }
    // ...
}
class IntegerFactory implements FactoryI<Integer> {
    public Integer create() {
        return new Integer(0);
    }
}
class Widget {
    public static class Factory implements FactoryI<Widget> {
        public Widget create() {
            return new Widget();
        }
    }
}
class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }
}

//另一种解决的方法是利用模板设计模式：
abstract class GenericWithCreate<T> {
    final T element;
    GenericWithCreate() { element = create(); }
    abstract T create();
}
class X {

}
class Creator extends GenericWithCreate<X> {
    X create() { return new X(); }
    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}
class CreatorGeneric {
    public static void main(String[] args) {
        Creator c = new Creator();
        c.f();
    }
}