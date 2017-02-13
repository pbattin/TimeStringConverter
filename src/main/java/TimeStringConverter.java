import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * Created by prestonbattin on 2/13/17.
 */
public class TimeStringConverter {

    BiMap<String, Integer> numbers =  HashBiMap.create();

    TimeStringConverter(String input){

        numbers.put("one", 1);      numbers.put("thirteen", 13);        numbers.put("twenty-five", 25);     numbers.put("thirty-seven", 37);    numbers.put("forty-nine", 49);
        numbers.put("two", 2);      numbers.put("fourteen", 14);        numbers.put("twenty-six", 26);      numbers.put("thirty-eight", 38);    numbers.put("fifty", 50);
        numbers.put("three", 3);    numbers.put("fifteen", 15);         numbers.put("twenty-seven", 27);    numbers.put("thirty-nine", 39);     numbers.put("fifty-one", 51);
        numbers.put("four", 4);     numbers.put("sixteen", 16);         numbers.put("twenty-eight", 28);    numbers.put("forty", 40);           numbers.put("fifty-two", 52);
        numbers.put("five", 5);     numbers.put("seventeen", 17);       numbers.put("twenty-nine", 29);     numbers.put("forty-one", 41);       numbers.put("fifty-three", 53);
        numbers.put("six", 6);      numbers.put("eighteen", 18);        numbers.put("thirty", 30);          numbers.put("forty-two", 42);       numbers.put("fifty-four", 54);
        numbers.put("seven", 7);    numbers.put("nineteen", 19);        numbers.put("thirty-one", 31);      numbers.put("forty-three", 43);     numbers.put("fifty-five", 55);
        numbers.put("eight", 8);    numbers.put("twenty", 20);          numbers.put("thirty-two", 32);      numbers.put("forty-four", 44);      numbers.put("fifty-six", 56);
        numbers.put("nine", 9);     numbers.put("twenty-one", 21);      numbers.put("thirty-three", 33);    numbers.put("forty-five", 45);      numbers.put("fifty-seven", 57);
        numbers.put("ten", 10);     numbers.put("twenty-two", 22);      numbers.put("thirty-four", 34);     numbers.put("forty-six", 46);       numbers.put("fifty-eight", 58);
        numbers.put("eleven", 11);  numbers.put("twenty-three", 23);    numbers.put("thirty-five", 35);     numbers.put("forty-seven", 47);     numbers.put("fifty-nine", 59);
        numbers.put("twelve", 12);  numbers.put("twenty-four", 24);     numbers.put("thirty-six", 36);      numbers.put("forty-eight", 48);

    }



}
