import java.util.ArrayList;

/**
 * DatabaseIncome yaitu child class dari Income
 *
 * @author Yelli Yulfita
 * @version 15/05/2019
 */
public class DatabaseIncome
{
    private static ArrayList<Income> INCOME_DATABASE = new ArrayList<Income>();
    private static int LAST_INCOME_ID = 0;
    
    /**
     * Constructor for objects of class DatabaseIncome
     */
    public DatabaseIncome()
    {
        
    }

    public static ArrayList<Income> getBalanceDatabase()
    {
        return INCOME_DATABASE;
    }
    
    public static int getLastIncomeID()
    {
        return LAST_INCOME_ID;
    }
    
    public static boolean addIncome(Income income)throws IncomeAlreadyExistException
    {
        for(Income temp : INCOME_DATABASE)
        {
            if(temp.getId() == income.getId())
            {
                throw new IncomeAlreadyExistException(income);
            }
        }

        INCOME_DATABASE.add(income);
        LAST_INCOME_ID++;

        return true;
    }
    
    public static Income getIncome(int id)
    {
        Income income = null;
        
        for(Income temp : INCOME_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                income = temp;
            }
        }
        
        return income;
    }
    
    public static boolean removeIncome(int id) throws IncomeNotFoundException
    {
        for(Income temp : INCOME_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                INCOME_DATABASE.remove(temp);
                return true;
            }
        }
        
        throw new IncomeNotFoundException(id);
    }    
}
