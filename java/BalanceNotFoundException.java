/**
 * Mengindikasikan Tidak Adanya Balance yang digunakan.
 * 
 * @author Muhamad Fahriza Novriansyah
 * @version 1.0
 */
public class BalanceNotFoundException extends Exception{
    private User balance_error;
    /**
     * Konstruktor untuk objek kelas BalanceNotFoundException
     * @param balance_input balance yang tidak ditemukan                      
     */
    public BalanceNotFoundException(User balance_input) {
        super("balance for account named ");
        balance_error = balance_input;
    }
        
    /**
     * Untuk menampilkan pemberitahuan berupa String
     * @return balance yang tidak ada                     
     */
    public String getExMessage(){ return super.getMessage() + balance_error.getName() + " not found.";}
}
