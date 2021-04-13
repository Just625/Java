package com.codegym;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void testFindAbsolute0() {
        int numb = 0;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(numb);
        assertEquals(expected, result);
    }
    @Test
    void testFindAbsolute1(){
        int numb  = 1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(numb);
        assertEquals(result, expected);
    }
    @Test
    void testFindAbsoluteNegative1(){
        int numb = -1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(numb);
        assertEquals(expected, result);
    }
}