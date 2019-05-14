
/**
 * Write a description of class IncomeAlreadyExistException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IncomeAlreadyExistException extends Exception
{
   private Income income_error;

    public IncomeAlreadyExistException(Income income_input){
        super("Income ID : ");
        this.income_error = income_input;
    }
    public String getExMessage(){
        return super.getMessage() + income_error.getId() + " already exist.";
    }
}