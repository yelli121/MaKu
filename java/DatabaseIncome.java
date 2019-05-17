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
     * Konstruktor kelas DatabaseIncome
     */
    public DatabaseIncome()
    {
        
    }

    /**
     * Method getBalanceDatabase untuk memanggil database INCOME_DATABASE
     * 
     * @return INCOME_DATABASE
     */
    public static ArrayList<Income> getIncomeDatabase()
    {
        return INCOME_DATABASE;
    }
    
    /**
     * Method getLastIncomeID untuk memanggil id database
     * 
     * @return LAST_INCOME_ID
     */
    public static int getLastIncomeID()
    {
        return LAST_INCOME_ID;
    }
    
    /**
     * Method addIncome untuk memasukkan income baru ke database
     * 
     * @param Income income
     * @return boolean true
     */
    public static boolean addIncome(Income income)
    {
        INCOME_DATABASE.add(income);
        LAST_INCOME_ID++;

        return true;
    }
    
    /**
     * Method addIncome untuk mendapatkan data Income user dari database
     * 
     * @param User user
     * @return Income income
     */
    public static Income getIncome(User user)
    {
        Income income = null;
        
        for(Income temp : INCOME_DATABASE) 
        {
            if(temp.getUser() == user) 
            {
                income = temp;
            }
        }
        
        return income;
    }
    
    /**
     * Method addIncome untuk menghilangkan income dari database
     * Exception akan aktif jika income yang ingin dihilangkan tidak ada di database
     * 
     * @param int id
     * @return boolean true
     * @throws IncomeNotFoundException jika id tidak ditemukan
     */
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
