package lennub;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    public void setUp()
    {
        calc = new Calculator();
    }

    @ParameterizedTest(name = "Teste com soma de positivos: {0} = {1}")
    @CsvSource({
        "17, 17",
        "1 + 27 + 33 + 20, 81",
        "3 + 1 + 17 + 5 + 900, 926"
    })
    public void positiveNumberTest(String exp, int expectedResult)
    {
        assertEquals(
            expectedResult,
            calc.evaluate(exp),
            "O somatório de números positivos '" + exp + "' deve resultar: " + expectedResult
        );
    }

    @ParameterizedTest(name = "Teste com soma de negativos: {0} = {1}")
    @CsvSource({
        "-12, -12",
        "-1 + -9 + -224, -234",
        "-3 + -2 + -1 + 10, 4"
    })
    public void negativeNumberTest(String exp, int expectedResult)
    {
        assertEquals(
            expectedResult,
            calc.evaluate(exp),
            "O somatório de números negativos '" + exp + "' deve resultar: " + expectedResult
        );
    }

    @ParameterizedTest(name = "Teste com soma de negativos e positivos: {0} = {1}")
    @CsvSource({
        "8 + 27 + -51 + 7 + -6 + 15, 0",
        "0 + 66 + -117 + 29 + -13 + 0 + 25, -10",
        "-1 + -2 + -4 + 8 + -9, -8"
    })
    public void negativeAndPositiveNumberTest(String exp, int expectedResult)
    {
        assertEquals(
            expectedResult,
            calc.evaluate(exp),
            "O somatório de números positivos e negativos '" + exp + "' deve resultar: " + expectedResult
        );
    }

    @ParameterizedTest(name = "Teste com input inválido: {0}")
    @CsvSource({
        "1a",
        "abc",
        "12 + acd  + 87"
    })
    public void invalidInputTest(String exp)
    {
        assertThrows(
            NumberFormatException.class,
            () -> calc.evaluate(exp),
            "Calculator.evaluate em string vazia ou que possuir alguma letra deve jogar exceção"
        );
    }    
}
