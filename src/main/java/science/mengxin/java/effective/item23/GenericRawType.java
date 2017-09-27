package science.mengxin.java.effective.item23;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * User:    mengxin
 * Date:    27/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item23
 * Description: GenericRawType.
 *
 * @author mengxin
 * @version 1.0
 */
public class GenericRawType {

    // Uses raw type (List) - fails at runtime!
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        unsafeAdd(strings, 42);
        //safeAdd(strings, "42");
        String s = strings.get(0); // Compiler-generated cast
        System.out.println(s);
    }

    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

    private static void safeAdd(List<String> list, String o) {
        list.add(o);
    }

    // can not compile successfully
    // private static void unsafeAdd(List<Object> list, Object o) {
    //     list.add(o);
    // }

    // Use of raw type for unknown element type - don't do this!
    static int numElementsInCommon(Set s1, Set s2) {
        int result = 0;
        for (Object o1 : s1)
            if (s2.contains(o1))
                result++;
        return result;
    }

    // Unbounded wildcard type - typesafe and flexible
    static int numElementsInCommon2(Set<?> s1, Set<?> s2) {
        int result = 0;
        for (Object o1 : s1)
            if (s2.contains(o1))
                result++;
        return result;
    }
}
