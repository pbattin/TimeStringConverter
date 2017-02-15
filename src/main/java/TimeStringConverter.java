import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by prestonbattin on 2/13/17.
 */

public class TimeStringConverter {

    String hour;
    String minute;
    String amPm;
    Matcher m;
    private static final String[] units = {

            "", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {

            "", "", "twenty", "thirty", "forty", "fifty"
    };

       TimeStringConverter(String time){

        m = Pattern.compile("\\b\\d+(?=:)").matcher(time); // hour

        if(m.find()) {
            hour = m.group();
        }

       m = Pattern.compile("(?<=:)\\w\\d+").matcher(time); //minute

       if(m.find()) {
           minute = m.group();
       }

        m = Pattern.compile("(?i)\\B([a-z]{2})").matcher(time); //AM/PM

        if(m.find()) {
            amPm = m.group();
        }

    }

    public String determineMinutes(int minutes){

        if(minutes > 20){
            return tens[minutes/10] + "-" + units[minutes%10];
        }

        else if(minutes < 10){

            return "oh " + units[minutes];
        }

        else if(minutes == 0){
            return "oh clock";
        }

        else {
            return units[minutes];
        }
    }

    public String determineIfMilitaryTime(int hour){

        if(hour > 12){

            return units[hour - 12];
        }

        else{
            return units[hour];
        }
    }

    public String displayTime(){

        int displayHour = Integer.parseInt(hour);
        int displayMinute = Integer.parseInt(minute);
        String displayAmPm = amPm;

        return "It is " + determineIfMilitaryTime(displayHour) + " " +
                determineMinutes(displayMinute) + " " +  displayAmPm.toUpperCase() + ".";
    }

    }

