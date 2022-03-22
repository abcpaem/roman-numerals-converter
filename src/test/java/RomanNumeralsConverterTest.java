import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsConverterTest {

    @Test
    // Roman numerals start to count from one and had no symbol to represent “0“, but for now we will assume that an empty string will return zero
    void checkGetNumberWhenRomanNumeralIsEmpty() {
        assertEquals(0, RomanNumeralsConverter.getNumber(""));
    }

    @ParameterizedTest
    @CsvSource(delimiterString = "=", textBlock = """
            I    = 1
            II   = 2
            III  = 3
            IV   = 4
            V    = 5
            VI   = 6
            VII  = 7
            VIII = 8
            IX   = 9
            X    = 10
    """)
    void checkGetNumberWhenRomanNumeralIsUpToTen(String romanNumeral, int expectedNumber) {
        assertEquals(expectedNumber, RomanNumeralsConverter.getNumber(romanNumeral));
    }

    @Test
    void checkGetNumberWhenRomanNumeralIsNotRecognisedOrSupported() {
        Throwable exception = assertThrows(UnsupportedOperationException.class, () -> RomanNumeralsConverter.getNumber("C"));
        assertEquals("The input provided is not recognised or supported as a roman numeral", exception.getMessage());
    }


}