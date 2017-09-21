package science.mengxin.java.effective.item2.dp.abstract_factory;

/**
 * User:    mengxin
 * Date:    13/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.science.mengxin.java.effective.item2.dp.abstract_factory
 * Description: PCPhrase.
 *
 * @author mengxin
 * @version 1.0
 */
public class PCPhrase extends Expression
{
    static String[] list =
            {
                    "\"animal companion\"", "\"vertically challenged\"",
                    "\"factually inaccurate\"", "\"chronologically gifted\""
            };
    private static int next = 0;
    public PCPhrase()
    {
        super(list[next]);
        next = (next + 1) % list.length;
    }
    public Expression cloan()
    {
        return new PCPhrase();
    }
}
