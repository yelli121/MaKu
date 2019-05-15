
/**
 * Kelas ekstensi Exception untuk error handling saat nilai
 * total persenan food, transport, dan additional expense tidak 100.
 * 
 * @author Adel Fahmi Karim
 * @version 15 Mei 2019
 */
public class ExpensePercentageNotFulfilled extends Exception
{
    
    public ExpensePercentageNotFulfilled(){
        super("Total integer input of Food, Transport, and Additional expenses have to be exactly 100.");
    }

    public String getExMessage(){
        return super.getMessage();
    }
}
