import java.util.Scanner;

/**
 * Kelas Income untuk input data pemasukkan
 *
 * @author Yelli Yulfita
 * @version 15/05/2019
 */


public abstract class Income
{
    // instance variables
    private User user;
    private int id;
    private int income;
    private IncomeType incomeType;
    
    /**
     * Konstruktor untuk objek kelas Income
     * @param id            id income
     * @param income        pemasukan yang akan dimasukan ke saldo
     * @param incomeType    tipe income yang dipilih                 
     */
    
    public Income (int income){
        this.income=income;
        setId(DatabaseIncome.getLastIncomeID()+1);
    }
    
    /**
     * Method getId berfungsi untuk mendapatkan id Income
     * 
     * @return id
     */
    public int getId(){
        return id;
    }
    
    /**
     * Method getUser berfungsi untuk mendapatkan user
     * 
     * @return user yang mempunyai saldo
     */
    public User getUser(){
        return user;
    }
    
    /**
     * Method getIncome untuk mendapatkan nilai income
     * 
     * @return income untuk mengembalikan nilai income
     */
    
    public int getIncome(){
        return income;
    }
    
    /**
     * Method getIncomeType
     */
    public abstract IncomeType getIncomeType();
    
    /**
     * Method setId untuk memasukkan atau mengatur id income
     * 
     * @param id yaitu parameter id income
     */
    public void setId(int id){
        this.id=id;
        
    }
    
    /**
     * Method setUser untuk memasukkan atau mengatur user income
     * 
     * @param user yaitu parameter user income
     */
    public void setUser(User user){
        this.user=user;
        
    }
    
    /**
     * Method setIncome yaitu untuk memasukkan atau mengatur pemasukkan 
     * 
     * @param income yaitu parameter income
     */
    public void setIncome(int income){
        this.income=income;
        
    }
    
    public abstract String toString();
    
}
