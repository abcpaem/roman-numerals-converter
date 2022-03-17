import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsConverterTest {

    @Test
    void checkGetNumberWhenRomanNumeralIsOne() {
        assertEquals(1, RomanNumeralsConverter.getNumber("I"));
    }

    @Test
    void checkGetNumberWhenRomanNumeralIsTwo() {
        assertEquals(2, RomanNumeralsConverter.getNumber("II"));
    }

    @Test
    void checkGetNumberWhenRomanNumeralIsThree() {
        assertEquals(3, RomanNumeralsConverter.getNumber("III"));
    }

    @Test
    void checkGetNumberWhenRomanNumeralIsFour() {
        assertEquals(4, RomanNumeralsConverter.getNumber("IV"));
    }

    @Test
    void checkGetNumberWhenRomanNumeralIsFive() {
        assertEquals(5, RomanNumeralsConverter.getNumber("V"));
    }

    @Test
    void checkGetNumberWhenRomanNumeralIsSix() {
        assertEquals(6, RomanNumeralsConverter.getNumber("VI"));
    }

    @Test
    void checkGetNumberWhenRomanNumeralIsSeven() {
        assertEquals(7, RomanNumeralsConverter.getNumber("VII"));
    }

    @Test
    void checkGetNumberWhenRomanNumeralIsEight() {
        assertEquals(8, RomanNumeralsConverter.getNumber("VIII"));
    }

    @Test
    void checkGetNumberWhenRomanNumeralIsNine() {
        assertEquals(9, RomanNumeralsConverter.getNumber("IX"));
    }

    @Test
    void checkGetNumberWhenRomanNumeralIsTen() {
        assertEquals(10, RomanNumeralsConverter.getNumber("X"));
    }

    @Test
    void checkGetNumberWhenRomanNumeralIsNotRecognisedOrSupported() {
        Throwable exception = assertThrows(UnsupportedOperationException.class, () -> RomanNumeralsConverter.getNumber("C"));
        assertEquals("The input provided is not recognised or supported as a roman numeral", exception.getMessage());
    }


}