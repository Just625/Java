import com.codegym.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    void FizzBuzzTest(){
        int numb = 1;
        String expected = "";
        String actual = fizzBuzz.check(numb);
        assertEquals(expected,actual);
    }
    @Test
    void FizzBuzzTest2(){
        int numb = 3;
        String expected = "Fizz";
        String actual = fizzBuzz.check(numb);
        assertEquals(expected,actual);
    }
    @Test
    void FizzBuzzTest3(){
        int numb = 5;
        String expected = "Buzz";
        String actual = fizzBuzz.check(numb);
        assertEquals(expected,actual);
    }@Test
    void FizzBuzzTest4(){
        int numb = 15;
        String expected = "FizzBuzz";
        String actual = fizzBuzz.check(numb);
        assertEquals(expected,actual);
    }
}
