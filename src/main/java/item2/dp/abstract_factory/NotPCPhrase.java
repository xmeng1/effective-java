package item2.dp.abstract_factory;

/**
 * User:    mengxin
 * Date:    13/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item2.dp.abstract_factory
 * Description: NotPCPhrase.
 *
 * @author mengxin
 * @version 1.0
 */
public class NotPCPhrase extends Expression
{
    private static String[] list =
            {
                    "\"pet\"", "\"short\"", "\"lie\"", "\"old\""
            };
    private static int next = 0;
    public NotPCPhrase()
    {
        super(list[next]);
        next = (next + 1) % list.length;
    }
    public Expression cloan()
    {
        return new NotPCPhrase();
    }
}
