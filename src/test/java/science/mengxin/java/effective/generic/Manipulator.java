package science.mengxin.java.effective.generic;

/**
 * User:    mengxin
 * Date:    28/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.generic
 * Description: Manipulator.
 *
 * @author mengxin
 * @version 1.0
 */
class HasF {

    public void f() {
        System.out.println("HasF.f()");
    }
}

public class Manipulator<T extends HasF> {

    private T obj;

    public Manipulator(T obj) {
        this.obj = obj;
    }

    public void manipulate() {
        // we need add T extends HasF, the statement will be compiled.
        obj.f(); //无法编译 找不到符号 f()
    }

    public static void main(String[] args) {
        HasF hasF = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<>(hasF);
        manipulator.manipulate();

    }
}

class Manipulator2<T extends HasF> {
    private HasF obj;
    public Manipulator2(HasF x) { obj = x; }
    public void manipulate() { obj.f(); }

    public static void main(String[] args) {
        HasF hasF = new HasF();
        Manipulator2<HasF> manipulator2 = new Manipulator2<>(hasF);
        manipulator2.manipulate();

    }
}