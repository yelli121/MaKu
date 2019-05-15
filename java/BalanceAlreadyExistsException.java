
/**
 * Mengidikasikan balance sudah ada/digunakan
 * 
 * @author Muhamad Fahriza Novriansyah
 * @version 1.0
 */
public class BalanceAlreadyExistsException extends Exception{
    private Balance balance_error;
    /**
     * Konstruktor untuk objek kelas BalanceAlreadyExistsException
     * @param balance_input balance yang sudah ada                      
     */
    public BalanceAlreadyExistsException(Balance balance_input) {super("balance : ");
        balance_error = balance_input;
    }
        
    /**
     * Untuk menampilkan pesan pemberitahuan berupa String
     * @return balance sudah ada/digunakan                    
     */
    public String getExMessage(){ return super.getMessage() + "Balance"+
           " already exist";}
}
