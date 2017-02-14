import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prestonbattin on 2/13/17.
 */
public class TimeStringConverV2Test {

    TimeStringConverterV2 convert;


    @Before
    public void setup(){
        convert = new TimeStringConverterV2("1:06PM");
    }

    @Test
    public void determineMinutesTest(){

        String expected = "forty-three";
        String actual = convert.determineMinutes(43);
        Assert.assertEquals("Testing minute converter method", expected, actual);
    }

    @Test
    public void convertedTimeTest(){

        String expected = "It is nine thirty-two PM.";
        String actual = convert.displayTime();
        Assert.assertEquals("Testing string output", expected, actual);
    }
}
