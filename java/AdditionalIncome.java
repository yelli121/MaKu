
/**
 * AdditionalIncome yaitu child class dari Income
 *
 * @author Yelli Yulfita
 * @version 15/05/2019
 */
public class AdditionalIncome extends Income
{
    private static final IncomeType INCOME_TYPE=IncomeType.Additional;
    private User user;
    private boolean isActive = false;
    
    /**
     * Konstruktor kelas AdditionalIncome
     * @param user yaitu yang mempunyai saldo
     * @param income yaitu pemasukkan yang akan dimasukkan ke saldo
     */
    public AdditionalIncome(User user, int income)
    {
        super(income);
        this.user=user;
    }
    
    /**
     * Method getIncomeType untuk memanggil income type
     * 
     * @return INCOME_TYPE
     */
    public IncomeType getIncomeType(){
        return INCOME_TYPE;
    }
    
    /**
     * Method getUser ini bertujuan untuk mendapatkan user
     * 
     * @return user yang mempunyai balance/saldo
     */
    public User getUser(){
        return user;
    }
    
    /**
     * Method setUser untuk mengatur user income
     * 
     * @return user yang mempunyai saldo
     */
    public void setUser(User user){
        this.user=user;
    }
    
    /**
     * Method toString
     * 
     * @return string .
     */
    public String toString(){
        return "\nUser " + user.getName() +" mendapatkan pemasukan " + getIncome()+ " rupiah.";
    }
}
