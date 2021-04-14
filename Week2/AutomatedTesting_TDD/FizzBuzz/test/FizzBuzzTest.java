import com.codegym.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    void FizzBuzzTest(){
        int numb = 1;
        String expected = "1";
        String actual = fizzBuzz.check(numb);
        assertEquals(expected,actual);
    }
    @Test
    void FizzBuzzTest2(){
        int numb = 3;
        String expected = FIZZ;
        String actual = fizzBuzz.check(numb);
        assertEquals(expected,actual);
    }
    @Test
    void FizzBuzzTest3(){
        int numb = 5;
        String expected = BUZZ;
        String actual = fizzBuzz.check(numb);
        assertEquals(expected,actual);
    }
    @Test
    void FizzBuzzTest4(){
        int numb = 15;
        String expected = FIZZ_BUZZ;
        String actual = fizzBuzz.check(numb);
        assertEquals(expected,actual);
    }
    @Test
    void FizzBuzzTest5(){
        int numb = 45;
        String expected = FIZZ_BUZZ;
        String actual = fizzBuzz.check(numb);
        assertEquals(expected,actual);
    }
    @Test
    void FizzBuzzTest6(){
        int numb = Integer.MAX_VALUE;
        String expected = numb+"";
        String actual = fizzBuzz.check(numb);
        assertEquals(expected,actual);
    }

}
