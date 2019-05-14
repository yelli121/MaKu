import java.text.*;
import java.util.*;
/**
 * Write a description of class Monthly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Monthly 
{
    private static final IncomeType INCOME_TYPE=IncomeType.Monthly;
    SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MMM yyy");
    public IncomeType getIncomeType()
    {
        return INCOME_TYPE;
    }
}

