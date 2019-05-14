
/**
 * Write a description of class DatabaseBalance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class DatabaseBalance {

    private static ArrayList<Balance> BALANCE_DATABASE = new ArrayList<Balance>();
    private static int LAST_BALANCE_ID = 0;
    
    public DatabaseBalance()
    {
        // initialise instance variables
    }
    public static ArrayList<Balance> getBalanceDatabase()
    {
        return BALANCE_DATABASE;
    }
    public static int getLastBalanceID()
    {
        return LAST_BALANCE_ID;
    }
    
    public static boolean addBalance(Balance Balance) throws BalanceAlreadyExistsException
    {
        boolean found = true;
        for(Balance temp : BALANCE_DATABASE)
        {
            if(temp.getId() == Balance.getId())
            {
                throw new BalanceAlreadyExistsException(Balance);
            }
        }
        
        if (BALANCE_DATABASE.add(Balance)){
            LAST_BALANCE_ID++;
            found=true;
        }
        
        return found;
    }
    public static Balance getBalance(int id)
    {
        Balance pelanggan = null;
        for(Balance temp : BALANCE_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                pelanggan = temp;
            }
        }
        return pelanggan;
    }
    public static boolean removeBalance(int id) throws BalanceNotFoundException
    {
        for(Balance temp : BALANCE_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                BALANCE_DATABASE.remove(temp);
                return true;
            }
        }
        
        throw new BalanceNotFoundException(id);
    } 
    
    
}
