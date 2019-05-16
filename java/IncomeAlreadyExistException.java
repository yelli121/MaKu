
/**
 * Mengindikasikan income sudah ada
 *
 * @author Yelli Yulfita
 * @version 15/05/2019
 */
public class IncomeAlreadyExistException extends Exception
{
    //Instancevariables
   private Income income_error;
   
   /**
     * Konstruktor untuk objek kelas IncomeAlreadyExistsException
     * @param income_input income yang sudah ada                      
     */

    public IncomeAlreadyExistException(Income income_input){
        super("Income ID : ");
        this.income_error = income_input;
    }
    
    /**
     * Untuk menampilkan pesan dalam bentuk string
     * @return balance sudah ada                   
     */
    public String getExMessage(){
        return super.getMessage() + income_error.getId() + " already exist.";
    }
}