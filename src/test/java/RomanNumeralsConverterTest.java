import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsConverterTest {

    @Test
    void checkGetNumberWhenRomanNumeralIsOne() {
        assertEquals(1, RomanNumeralsConverter.getNumber("I"));
    }
}