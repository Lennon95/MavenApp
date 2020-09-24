package lennub;

import java.lang.String;

public class Calculator
{
    public int evaluate(String expression)
    {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum += Integer.valueOf(summand.trim());
        return sum;
    }
}
