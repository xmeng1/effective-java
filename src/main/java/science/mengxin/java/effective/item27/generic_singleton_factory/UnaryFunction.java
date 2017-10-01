package science.mengxin.java.effective.item27.generic_singleton_factory;

/**
 * User:    mengxin
 * Date:    29/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item27.generic_singleton_factory
 * Description: UnaryFunction.
 *
 * @author mengxin
 * @version 1.0
 */
public interface UnaryFunction<T> {

    T apply(T arg);
}

class Test {

    // Generic singleton factory pattern
    private static UnaryFunction<Object> IDENTITY_FUNCTION = new UnaryFunction<Object>() {
        public Object apply(Object arg) {
            return arg;
        }
    };


    // IDENTITY_FUNCTION is stateless and its type parameter is
    // unbounded so it's safe to share one instance across all types.
    //@SuppressWarnings("unchecked")
    public static <T> UnaryFunction<T> identityFunction() {
        return (UnaryFunction<T>) IDENTITY_FUNCTION;
    }

    // Sample program to exercise generic singleton
    public static void main(String[] args) {

        String[] strings = {"jute", "hemp", "nylon"};
        UnaryFunction<String> sameString = identityFunction();
        for (String s : strings) {
            System.out.println(sameString.apply(s));
        }

        Number[] numbers = {1, 2.0, 3L};
        UnaryFunction<Number> sameNumber = identityFunction();
        for (Number n : numbers) {
            System.out.println(sameNumber.apply(n));
        }

    }
}