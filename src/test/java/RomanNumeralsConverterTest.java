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
}