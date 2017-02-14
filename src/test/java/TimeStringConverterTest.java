import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by prestonbattin on 2/13/17.
 */
public class TimeStringConverterTest {

    TimeStringConverter converter;

    @Before
    public void setup(){

        converter = new TimeStringConverter("one thirty-eight");
    }


    @Test
    public void splitSentenceTest(){

        String expected = "[one, thirty-eight]";
        String actual = Arrays.toString(converter.getHoursMinutes());
        Assert.assertEquals("Testing method that divides sentence", expected, actual);
    }

    @Test
    public void convertWordstoTimeTest(){

        String expected = "It is 1:39";
        String actual = converter.convertWordsToTime();
        Assert.assertEquals("Checking output string", expected, actual);
    }






}
