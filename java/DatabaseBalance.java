import java.text.*;
import java.util.*;
/**
 * Kelas DatabaseBalance merupakan kumpulan balance yang berupa list/ database balance
 *
 * @author Muhamad Fahriza Novriansyah
 * @version 1.0
 */
public class DatabaseBalance {
    // initialise instance variables
    private static ArrayList<Balance> BALANCE_DATABASE = new ArrayList<Balance>();
    private static int LAST_BALANCE_ID = 0;
    /**
     * Konstruktor untuk objek kelas DatabaseBalance
     *                      
     */
    public DatabaseBalance()
    {
        
    }
    
    /**
     * Method getBalanceDatabase ini bertujuan untuk mendapatkan balance pada database
     * 
     * @return BALANCE_DATABASE balance yang ada di dalam database
     */
    public static ArrayList<Balance> getBalanceDatabase()
    {
        return BALANCE_DATABASE;
    }
    
    /**
     * Method getLastBalanceID ini bertujuan untuk mendapatkan id balance yang paling akhir didatabase
     * 
     * @return LAST_BALANCE_ID id balance terakhir yang ada di dalam database
     */
    public static int getLastBalanceID()
    {
        return LAST_BALANCE_ID;
    }
    
    /**
     * Method addBalance ini bertujuan untuk menambahkan balance ke BALANCE_DATABASE
     * 
     * @return apakah balance sudah berhasil ditambahkan atau gagal
     */
    public static boolean addBalance(Balance balance)
    {
        for(Balance temp : BALANCE_DATABASE)
        {
            if(temp.getUser() == balance.getUser())
            {
                temp.setIncome(temp.getIncome()+balance.getIncome());
                temp.setBudgetRatio(balance.getBudgetRatio());
                return true;
            }
            
        }

        BALANCE_DATABASE.add(balance);
        LAST_BALANCE_ID = balance.getId();

        return true;
    }
    
    /**
     * Method getBalance ini bertujuan untuk mendapatkan id balance
     * 
     * @return balance yang ada didalam database dan sesuai berupa objek
     */
    public static Balance getBalance(User user)
    {
        Balance balance = null;
        for(Balance temp : BALANCE_DATABASE) 
        {
            if(temp.getUser() == user) 
            {
                balance = temp;
            }
        }
        return balance;
    }
    
    /**
     * Method removeBalance ini bertujuan untuk menghapus balance dari BALANCE_DATABASE
     * 
     * @return apakah balance sudah berhasil dihapus atau tidak
     * @throws BalanceNotFoundException jika balance id tidak ditemukan
     */
    public static boolean removeBalance(User user) throws BalanceNotFoundException
    {
        for(Balance temp : BALANCE_DATABASE) 
        {
            if(temp.getUser() == user) 
            {
                BALANCE_DATABASE.remove(temp);
                return true;
            }
        }
        
        throw new BalanceNotFoundException(user);
    }    
    
}
 