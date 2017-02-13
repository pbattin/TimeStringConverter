import java.util.regex.Matcher;


/**
 * Created by prestonbattin on 2/13/17.
 */
public class Main  {

    public static void main(String[] args) {

        Regex regex = new Regex();
        String one = "oNe";
        Matcher test = regex.one.matcher(one);
        System.out.println(test.matches());
        TimeStringConverter t = new TimeStringConverter("s");
        System.out.println(t.numbers.get("ONE"));


    }
}
