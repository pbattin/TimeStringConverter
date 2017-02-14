import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by prestonbattin on 2/13/17.
 */
public class Main  {

    public static void main(String[] args) {
        String x = "";

        Matcher m = Pattern.compile("(\\B[a-z]{2})").matcher("9:39pm"); //am/pm
        if(m.find()) {
            x = m.group();
        }
        System.out.println(x);

        m = Pattern.compile("\\w\\d+").matcher("9:39pm");
        if(m.find()){
            x = m.group();
        }
        System.out.println(x);

        m = Pattern.compile("\\b\\d+(?=:)").matcher("9:39pm");
        if(m.find()){
            x = m.group();
        }
        System.out.println(x);

        m =Pattern.compile("\\B([a-z]{2})").matcher("9:39pm"); //AM/PM

        if(m.find()) {
            x = m.group();
            System.out.println(x);
        }
    }
}
