
/**
 * Kelas ekstensi Exception untuk error handling saat sebuah 
 * objek Expense tidak ditemukan di database.
 * 
 * @author Adel Fahmi Karim
 * @version 15 Mei 2019
 */
public class ExpenseNotFoundException extends Exception
{
    private User user_expense;

    /**
     * Konstruktor untuk kelas ExpenseNotFoundException.
     */
    public ExpenseNotFoundException(User user_input){
        super("Expense plan user ");
        user_expense = user_input;
    }

    /**
     * Method untuk mengembalikan pesan saat error terjadi.
     */
    public String getExMessage(){
        return super.getMessage() + user_expense.getName() + "not found.";
    }
}
