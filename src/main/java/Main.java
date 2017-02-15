/**
 * Created by prestonbattin on 2/13/17.
 */
public class Main  {

    public static void main(String[] args) {

        TimeStringConverter convert = new TimeStringConverter("20:58PM");
        System.out.println(convert.displayTime());
    }
}
