
/**
 * Write a description of class IncomeNotFoundException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IncomeNotFoundException extends Exception
{
    private int income_error;
    
    public IncomeNotFoundException(int income_error) {
        super("User ID : ");
        this.income_error = income_error;
    }

    public String getExMessage() {
        return super.getMessage() + income_error + " not found.";
    }
}
   