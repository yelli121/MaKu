
/**
 * Write a description of class BalanceNotFoundException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BalanceNotFoundException extends Exception{
    private int balance_error;

    public BalanceNotFoundException(int balance_input) {super("balance ID : ");
        balance_error = balance_input;}

    public String getExMessage(){ return super.getMessage() + balance_error + "not found.";}
}
