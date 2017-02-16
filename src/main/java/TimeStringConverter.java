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

    TimeStringConverter(String time) throws IncorrectTimeFormatException {

        m = Pattern.compile("\\b\\d+(?=:)").matcher(time); // hour

        int count = 0;

        while (m.find()) {

            hour = m.group();
                count++;
            }

            if(count > 1){
                throw new IncorrectTimeFormatException("Too many colons");
            }



        m = Pattern.compile("(?<=:)\\w\\d+").matcher(time); //minute

        if (m.find()) {
            minute = m.group();
        }

        m = Pattern.compile("(?i)([a][m])|([p][m])").matcher(time); //AM/PM

        if (m.find()) {
            amPm = m.group();

        }

        if (hour == null || minute == null || amPm == null || Integer.parseInt(hour) > 24 || Integer.parseInt(hour) < 0 || Integer.parseInt(minute) > 59 || Integer.parseInt(minute) < 0) {

            m = Pattern.compile("(\\d{2})(\\d{2})").matcher(time); //check for military

            if (m.find()) {

                hour = m.group(1);
                minute = m.group(2);
            }

            if (hour == null || Integer.parseInt(hour) > 24 || Integer.parseInt(hour) < 0) {
                throw new IncorrectTimeFormatException("Please enter a correct " +
                        "format of standard or military time.");
            }

            if (minute == null || Integer.parseInt(minute) > 59) {
                throw new IncorrectTimeFormatException("Please enter a correct " +
                        "format of standard or military time.");
            }
            displayMilitaryTime();
        }else {

            displayStandardTime();


        }

     }


    public String determineStandardMinutes(int minutes){


        if(minutes > 20){
            return tens[minutes/10] + "-" + units[minutes%10];
        }

        else if(minutes < 10 && minutes > 0){

            return "oh " + units[minutes];
        }

        else if(minutes == 0){

            return "oh clock";
        }

        else {
            return units[minutes];
        }
    }

    public String determineMilitaryMinutes(int minutes){

        if(minutes > 20){
            return tens[minutes/10] + "-" + units[minutes%10] + " hundred " +
                    "hours";
        }

        else if(minutes == 0){

            return  units[minutes] + "hundred hours";
        }

        else
            return units[minutes] + " hundred hours";
    }

    public String determineMilitaryHours(int hour){

        if(hour < 10){
            return "zero " + units[hour];
        }

        if(hour > 9 && hour < 20){

            return units[hour];
        }

        if(hour > 19){

            return tens[hour/10] + "-" + units[hour%10];

        }

        else{

            return tens[hour/10] + "-" + units[hour%10];
        }
    }

    public String determineStandardHours(int hour){

        if(hour < 13){
            return units[hour];
        }
        else
            return units[hour - 12];

    }

    public String displayStandardTime(){

        int displayHour = Integer.parseInt(hour);
        int displayMinute = Integer.parseInt(minute);
        String displayAmPm = amPm;

        return "It is " + determineStandardHours(displayHour) + " " +
                determineStandardMinutes(displayMinute) + " " +  displayAmPm.toUpperCase() + ".";
    }

    public String displayMilitaryTime(){

        int displayHour = Integer.parseInt(hour);
        int displayMinute = Integer.parseInt(minute);

        return "It is " + determineMilitaryHours(displayHour) + " " +
                determineMilitaryMinutes(displayMinute) + ".";

    }
 }

