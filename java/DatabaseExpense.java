import java.util.ArrayList;

/**
 * Kelas database untuk objek Expense.
 *
 * @author Adel Fahmi Karim
 * @version 15 Mei 2019
 */
public class DatabaseExpense
{
    private static ArrayList<Expense> EXPENSE_DATABASE = new ArrayList<Expense>();//inisialisasi awal array database
    private static int LAST_EXPENSE_ID = 0; // inisialisasi awal id databse
    
    /**
     * Konstruktor untuk kelas DatabaseExpense.
     */
    public DatabaseExpense()
    {
        
    }
    
    /**
     * Accessor untuk parameter EXPENSE_DATABASE.
     * @return EXPENSE_DATABASE
     */
    public static ArrayList<Expense> getExpenseDatabase()
    {
        return EXPENSE_DATABASE;
    }
    
    /**
     * Accessor untuk parameter LAST_EXPENSE_ID.
     * @return LAST_EXPENSE_ID
     */
    public static int getLastExpenseID()
    {
        return LAST_EXPENSE_ID;
    }
    
    /**
     * Method untuk memasukkan objek Expense baru ke array DatabaseExpense.
     * Ketentuan yang dibuat adalah satu User hanya dapat memiliki satu Expense dalam database.
     * 
     * @return boolean true
     */
    public static boolean addExpense(Expense expense)
    {
       
       for(Expense temp : EXPENSE_DATABASE){
           if(temp.getUser() == expense.getUser())
            {
                try{
                    removeExpense(temp.getUser());
                }
                    
                catch(ExpenseNotFoundException coba){
                    System.out.println(coba.getExMessage());
                }
                
                //Program akan mengecek array untuk memeriksa kesamaan User di database dengan 
                //User pada Expense yang akan dimasukkan.
                //Bila User sama,objek Expense yang sebelumnya ada di database akan dihapus
                //dan diganti dengan objek baru.
            }
       }
       
       expense.setIsActive(true); //penanda bahwa objek aktif di database.
       EXPENSE_DATABASE.add(expense);
       LAST_EXPENSE_ID++;
       
        
       return true;
    }
    
    /**
     * Accessor untuk objek Expense dalan DatabaseExpense.
     * Expense akan dicari berdasarkan parameter id-nya.
     * 
     * @return Expense pengeluaran
     */
    public static Expense getExpenseFromID(int id)
    {
        Expense pengeluaran = null;
        
        for(Expense temp : EXPENSE_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                pengeluaran = temp;
            }
        }
        
        return pengeluaran;
    }
    
    /**
     * Accessor untuk objek Expense dalan DatabaseExpense.
     * Expense akan dicari berdasarkan parameter user-nya.
     * 
     * @return Expense pengeluaran
     */
    public static Expense getExpenseFromUser(User user)
    {
        Expense pengeluaran = null;
        
        for(Expense temp : EXPENSE_DATABASE) 
        {
            if(temp.getUser() == user) 
            {
                pengeluaran = temp;
            }
        }
        
        return pengeluaran;
    }
    
    /**
     * Method untuk menghilangkan sebuah objek Expense dari Database.
     * Expense akan dicari berdasarkan parameter user-nya
     * 
     * throws ExpenseNotFoundException jika balance user tidak ditemukan
     */
    public static boolean removeExpense(User user) throws ExpenseNotFoundException
    {
        for(Expense temp : EXPENSE_DATABASE) 
        {
            if(temp.getUser() == user) 
            {
                if(temp.getIsActive() == true) 
                {
                    EXPENSE_DATABASE.remove(temp); //objek di-remove dari database
                    return true;
                }
            }
        }
        
        throw new ExpenseNotFoundException(user);
    }
}
