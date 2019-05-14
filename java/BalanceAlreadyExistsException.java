
/**
 * Write a description of class BalanceAlreadyExistsException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BalanceAlreadyExistsException extends Exception{
    private Balance balance_error;

    public BalanceAlreadyExistsException(Balance balance_input) {super("balance : ");
        balance_error = balance_input;}

    public String getExMessage(){ return super.getMessage() + "Balance"+
           " already exist";}
}
