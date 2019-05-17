import java.util.*;

/**
 * Kelas Expense dibuat untuk melakukan perencanaan biaya untuk tiga macam tipe pengeluaran,
 * yang dihitung berdasarkan budget pada kelas Expense.
 *
 * @author Adel Fahmi Karim
 * @version 15 Mei 2019
 */
public class Expense
{
    private int id; //int id sebagai pembeda antar objek
    private int foodExpense, transportExpense, additionalExpense; //int untuk macam tipe pengeluaran
    private User user; //penghubung dengan user
    private Balance balance; //penghubung dengan balance
    private boolean isActive = false; //boolean untuk menentukan objek telah aktif di database
    
    /**
     * Konstruktor untuk kelas Expense.
     * @param user              Objek User yang akan dibuhungkan dengan objek expense.
     * @param balance           Objek Balance yang akan dihubungkan dengan objek expense.
     * @param food              Integer yang akan menjadi acuan pengeluaran biaya makanan.
     * @param transport         Integer yang akan menjadi acuan pengeluaran biaya transportasi.
     * @param additional        Integer yang akan menjadi acuan pengeluaran biaya lainnya.
     */
    public Expense (User user, Balance balance, int food, int transport, int additional) throws ExpensePercentageNotFulfilled{
        int total = food + transport + additional;
        if(total != 100){
            throw new ExpensePercentageNotFulfilled();
        }
        //int food, transport, dan additional diasumsikan sebagai persenan yang akan
        //diambil dari budget, sehingga jumlah ketiga parameter ini harus 100 persen
        
        setId(DatabaseExpense.getLastExpenseID()+1); //id akan disamakan dengan database
        this.user = user;
        this.balance = balance;
        this.foodExpense = (balance.getBudget()*food)/100; //pembagian budget
        this.transportExpense = (balance.getBudget()*transport)/100;
        this.additionalExpense = (balance.getBudget()*additional)/100;
        
    }
    
    /**
     * Accessor untuk parameter id.
     * @return id
     */
    public int getId(){
        return id;
    }
    
    /**
     * Accessor untuk parameter foodExpense.
     * @return foodExpense
     */
    public int getFoodExpense(){
        return foodExpense;
    }
    
    /**
     * Accessor untuk parameter transportExpense.
     * @return transportExpense
     */
    public int getTransportExpense(){
        return transportExpense;
    }
    
    /**
     * Accessor untuk parameter additionalExpense.
     * @return additionalExpense
     */
    public int getAdditionalExpense(){
        return additionalExpense;
    }
    
    /**
     * Accessor untuk parameter user.
     * @return user
     */
    public User getUser(){
        return user;
    }
    
    /**
     * Accessor untuk parameter balance.
     * @return balance
     */
    public Balance getBalance(){
        return balance;
    }
    
    /**
     * Accessor untuk parameter isActive.
     * @return isActive
     */
    public boolean getIsActive() 
    { 
        return isActive; 
    }
    
    /**
     * Mutator untuk parameter id.
     * @param id
     */
    public void setId(int id){
        this.id=id;
    }
    
    /**
     * Mutator untuk parameter user.
     * @param user
     */
    public void setUser(User user){
        this.user=user;
    }
    
    /**
     * Mutator untuk parameter balance.
     * @param balance
     */
    public void setBalance(Balance balance){
        this.balance=balance;
    }
    
    /**
     * Mutator untuk parameter isActive.
     * @param isActive
     */
    public void setIsActive(boolean isActive) 
    { 
        this.isActive = isActive; 
    }
    
    /**
     * Method untuk mengembalikan string untuk dicetak.
     */
    public String toString(){
        return "\nInformasi Pengeluaran User" 
        + "\nNama User          :   "+ getUser().getName() 
        + "\nBudget total       :   "+ getBalance().getBudget() + " rupiah"
        + "\nBudget makanan     :   "+ getFoodExpense() + " rupiah"
        + "\nBudget tranportasi :   "+ getTransportExpense() + " rupiah"
        + "\nBudget lainnya     :   "+ getAdditionalExpense() + " rupiah";
    }
}
