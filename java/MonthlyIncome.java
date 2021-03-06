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
     * Method getData ini bertujuan untuk mendapatkan tanggal pemasukan
     * 
     * @return date tanggal pemasukan
     */
    public Date getDate(){
        return date;
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
     * Method getData ini bertujuan untuk mengatur atau memasukkan tanggal pemasukan
     * 
     * @param date tanggal pemasukan
     */
    public void setDate(Date date){
        this.date=date;
    }
    
    /**
     * Method toString
     * 
     * @return string "belum ditentukan".\
     */
    public String toString(){
        return "\nPemasukan bulanan " + user.getName() 
        +" sebesar " + getIncome()+ " rupiah.";
    }
}