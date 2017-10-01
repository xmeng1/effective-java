package science.mengxin.java.effective.item27;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * User:    mengxin
 * Date:    29/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item27
 * Description: GenericMethod.
 *
 * @author mengxin
 * @version 1.0
 */
public class GenericMethod {

    // If don't use generic method, just could use the raw type
    // Uses raw types - unacceptable! (Item 23)
    // get warning:
    // warning: [unchecked] unchecked call to
    // HashSet(Collection<? extends E>) as a member of raw type HashSet
    public static Set unionRayType(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    // Generic method
    // Still has some limitations: 3 set type need same.
    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {

        Set<E> result = new HashSet<E>(s1);

        result.addAll(s2);

        return result;
    }

    // Generic static factory method
    public static <K,V> HashMap<K,V> newHashMap() { return new HashMap<K,V>(); }



    // Simple program to exercise generic method
    public static void main(String[] args) {
        Set<String> guys = new HashSet<String>(Arrays.asList("Tom", "Dick", "Harry"));
        Set<String> stooges = new HashSet<String>(Arrays.asList("Larry", "Moe", "Curly"));
        Set<String> aflCio = union(guys, stooges);
        System.out.println(aflCio);
        // type inference
        Set guys2 = new HashSet<>(Arrays.asList("Tom2", "Dick2", "Harry2"));
        Set stooges2 = new HashSet<>(Arrays.asList("Larry2", "Moe2", "Curly2"));
        Set aflCio2 = union(guys2, stooges2);
        System.out.println(aflCio2);


        // Parameterized type instance creation with static factory
        Map<String, List<String>> anagrams = newHashMap();
    }
}
