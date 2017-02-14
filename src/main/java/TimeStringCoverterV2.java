import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by prestonbattin on 2/13/17.
 */

public class TimeStringCoverterV2 {

    String hour;
    String minute;
    String amPm;
    Matcher m;

    TimeStringCoverterV2(String time){

        m = Pattern.compile("\\b\\d+(?=:)").matcher(time); // hour

        if(m.find()) {
            hour = m.group();
        }

       m = Pattern.compile("\\w\\d+").matcher(time); //minute

       if(m.find()) {
           minute = m.group();
       }

        m =Pattern.compile("\\B([a-z]{2})").matcher(time); //AM/PM

        if(m.find()) {
            amPm = m.group().toUpperCase();
        }


    }
}
