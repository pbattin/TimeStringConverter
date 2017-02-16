import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prestonbattin on 2/13/17.
 */
public class TimeStringConverterTest {

    TimeStringConverter convert;


    @Before
    public void setup(){
       try {
           convert = new TimeStringConverter("1:06PM");
       }catch (IncorrectTimeFormatException e){
           e.getMessage();
       }
    }

    @Test
    public void determineStandardMinutesTest(){

        String expected = "forty-three";
        String actual = convert.determineStandardMinutes(43);
        Assert.assertEquals("Testing minute converter method", expected, actual);
    }

    @Test
    public void convertedStandardTimeTest(){

        String expected = "It is one oh six PM.";
        String actual = convert.displayStandardTime();
        Assert.assertEquals("Testing string output", expected, actual);
    }

    @Test
    public void determineStandardHoursTest(){

        String expected = "nine";
        String actual = convert.determineStandardHours(21);
        Assert.assertEquals("Testing the method that converts 24 hr format", expected, actual);
    }

    @Test
    public void determineIfMilitaryTimeTest(){

        String expected = "twenty-one";
        String actual = convert.determineMilitaryHours(21);
        Assert.assertEquals("Testing converting military time", expected, actual);
    }

    @Test
    public void convertedMilitaryTimeTest() throws IncorrectTimeFormatException{

        convert = new TimeStringConverter("2100");
        String expected = "It is twenty-one hundred hours.";
        String actual = convert.displayMilitaryTime();
        Assert.assertEquals("Testing military time output", expected, actual);
    }

    @Test(expected = IncorrectTimeFormatException.class)
    public void IncorrectTimeFormatExceptionTest() throws IncorrectTimeFormatException{

        convert = new TimeStringConverter("");

    }
}
