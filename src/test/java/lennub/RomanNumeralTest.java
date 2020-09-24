package lennub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {
    private RomanNumeral rNumeral;

    @BeforeEach
    public void setUp() {
        rNumeral = new RomanNumeral();
    }

    @Test
    public void simpleNumberTest() {
        assertEquals(1, rNumeral.convert("I"));
        assertEquals(5, rNumeral.convert("V"));
        assertEquals(500, rNumeral.convert("D"));
    }

    @Test
    public void summationNumberTest() {
        assertEquals(12, rNumeral.convert("XII"));
        assertEquals(207, rNumeral.convert("CCVII"));
        assertEquals(1018, rNumeral.convert("MXVIII"));
        assertEquals(2678, rNumeral.convert("MMDCLXXVIII"));
    }

    @Test
    public void subtractionNumberTest() {
        assertEquals(4, rNumeral.convert("IV"));
        assertEquals(99, rNumeral.convert("XCIX"));
        assertEquals(941, rNumeral.convert("CMXLI"));
        assertEquals(494, rNumeral.convert("CDXCIV"));
    }
    
    @Test
    public void summationSubtractionNumberTest() {
        assertEquals(74, rNumeral.convert("LXXIV"));
        assertEquals(398, rNumeral.convert("CCCXCVIII"));
        assertEquals(654, rNumeral.convert("DCLIV"));
        assertEquals(3489, rNumeral.convert("MMMCDLXXXIX"));
    }
}