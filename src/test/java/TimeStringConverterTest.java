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
        convert = new TimeStringConverter("1:06PM");
    }

    @Test
    public void determineMinutesTest(){

        String expected = "forty-three";
        String actual = convert.determineMinutes(43);
        Assert.assertEquals("Testing minute converter method", expected, actual);
    }

    @Test
    public void convertedTimeTest(){

        String expected = "It is one oh six PM.";
        String actual = convert.displayTime();
        Assert.assertEquals("Testing string output", expected, actual);
    }

    @Test
    public void determineIfMilitaryTimeTest(){

        String expected = "nine";
        String actual = convert.determineIfMilitaryTime(21);
        Assert.assertEquals("Testing converting military time", expected, actual);

    }
}
