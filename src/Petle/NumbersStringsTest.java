package Petle;

import org.junit.Test;

import static Petle.NumbersStrings.*;
import static org.junit.Assert.*;

public class NumbersStringsTest {

    @Test
    public void checkDigitsCount1234() throws Exception {
        assertEquals(howManyDigits(1234),4);
    }

    @Test
    public void reverseStringConcatenation() throws Exception {
        assertTrue(reverseString("Contatenation").equals("noitanetatnoC"));
    }

    @Test
    public void reverseStringWithSpaces() throws Exception{
        assertTrue(reverseString("bla bla").equals("alb alb"));
    }

    @Test
    public void num2toBinary() throws Exception {
        assertEquals(intToBinary(2),"10");
    }

    @Test
    public void num5toBinary() throws Exception {
        assertEquals(intToBinary(5),"101");
    }

    @Test
    public void isKajakPalindrom() throws Exception {
        assertTrue(isPalindrom("kajak"));
    }
    @Test
    public void isPajakPalindrom() throws Exception {
        assertFalse(isPalindrom("pajak"));
    }
}