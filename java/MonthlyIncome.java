import java.text.*;
import java.util.*;
/**
 * Kelas MonthlyIncome yaitu child class dari Income
 *
 * @author Yelli Yulfita
 * @version 15/05/2019
 */
public class MonthlyIncome extends Income
{
    //instance Variables
    private static final IncomeType INCOME_TYPE=IncomeType.Monthly;
    SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MM yyyy");
    private User user;
    private Date date;
    private boolean isActive = false;
    
    /**
     * Konstruktor kelas MonthlyIncome
     * @param user yaitu yang mempunyai saldo
     * @param income yaitu pemasukkan yang akan dimasukkan ke saldo
     */
    public MonthlyIncome(User user, int income)
    {
        super(income);
        this.user=user;
        Date date = new Date();
        this.date = date;
    }
    
    /**
<<<<<<< HEAD
     * Method getIncomeType untuk memanggil income type
=======
     * Method getIincomeType untuk memanggil income type
>>>>>>> 834d39af9c434bc7b5af1dbd03dff18e002542d6
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
<<<<<<< HEAD
     * @return string .
=======
     * @return string "belum ditentukan".
>>>>>>> 834d39af9c434bc7b5af1dbd03dff18e002542d6
     */
    public String toString(){
        return "Pemasukan bulanan " + user.getName() 
        +" adalah " + getIncome()+ " rupiah.";
    }
}