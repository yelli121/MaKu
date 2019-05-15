
/**
 * Enumeration class ExpenseType - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum ExpenseType
{
    Food("Food"), Transport("Transport"), Additional("Additional");
    String expenseType;
    
    ExpenseType(String expenseType){
        this.expenseType = expenseType;
    }
    
    public String toString(){
        return expenseType;
    }
}
