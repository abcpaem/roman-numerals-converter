import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsConverterTest {

    @Test
    // Roman numerals start to count from one and had no symbol to represent “0“, but for now we will assume that an empty string will return zero
    void checkGetNumberWhenRomanNumeralIsEmpty() {
        assertEquals(0, RomanNumeralsConverter.getNumber(""));
    }

    @ParameterizedTest
    @ValueSource(strings = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"})
    void checkGetNumberWhenRomanNumeralIsUpToTen() {
        assertEquals(10, RomanNumeralsConverter.getNumber("X"));
    }

    @Test
    void checkGetNumberWhenRomanNumeralIsNotRecognisedOrSupported() {
        Throwable exception = assertThrows(UnsupportedOperationException.class, () -> RomanNumeralsConverter.getNumber("C"));
        assertEquals("The input provided is not recognised or supported as a roman numeral", exception.getMessage());
    }


}