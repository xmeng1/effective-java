package science.mengxin.java.effective.item29;


import java.util.HashMap;
import java.util.Map;

/**
 * User:    mengxin
 * Date:    01/10/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item29
 * Description: Favorites.
 *
 * @author mengxin
 * @version 1.0
 */

// Typesafe heterogeneous container pattern - API
public class Favorites {

    private Map<Class<?>, Object> favorites = new HashMap<Class<?>, Object>();

    public <T> void putFavorite(Class<T> type, T instance) {
        if (type == null) {
            throw new NullPointerException("Type is null");
        }
        favorites.put(type, instance);
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }

    // Achieving runtime type safety with a dynamic cast
    public <T> void putFavorite2(Class<T> type, T instance) {
        favorites.put(type, type.cast(instance));
    }

    // Typesafe heterogeneous container pattern - client
    public static void main(String[] args) {
        Favorites f = new Favorites();

        f.putFavorite(String.class, "Java");
        // because we define the instance should be same type of class generic,
        //  so you cannot put the Integer with String.class
        // f.putFavorite(String.class, 11);

        f.putFavorite(Integer.class, 0xcafebabe);

        f.putFavorite(Class.class, Favorites.class);
        String favoriteString = f.getFavorite(String.class);
        int favoriteInteger = f.getFavorite(Integer.class);
        Class<?> favoriteClass = f.getFavorite(Class.class);
        System.out.printf("%s %x %s%n", favoriteString,
                favoriteInteger, favoriteClass.getName());

        // if use raw type of class, the favorites will be broken
        /*Favorites f2 = new Favorites();
        Class x = Double.class;
        f2.putFavorite(x,"xxxxxx");
        try {
            System.out.printf("%s", f2.getFavorite(x) );
        }catch (Exception e) {
            System.out.printf(e.getMessage());
        }*/

        Favorites f2 = new Favorites();
        Class x2 = Double.class;
        try {
            f2.putFavorite2(x2,"xxxxxx");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println( f2.getFavorite(x2) );
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //java.lang.ClassCastException: Cannot cast java.lang.String to java.lang.Double
    }

}

