
/**
 * Kelas yang mengindikasikan tidak terdapat Income
 *
 * @author Yelli Yulfita
 * @version 15/05/2019
 */
public class IncomeNotFoundException extends Exception
{
    //instance variable
    private int income_error;
    
    /**
     * Konstruktor untuk objek kelas IncomeeNotFoundException
     * @param income_input income yang tidak ditemukan                      
     */
    public IncomeNotFoundException(int income_error) {
        super("User ID : ");
        this.income_error = income_error;
    }

    /**
     * Untuk menampilkan pesan dalam bentuk String
     * @return income yang tidak ada                     
     */
    public String getExMessage() {
        return super.getMessage() + income_error + " not found.";
    }
}
   