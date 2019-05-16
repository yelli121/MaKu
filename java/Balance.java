/**
 * Kelas Balance ini bertujuan untuk mengetahui saldo.
 *
 * @author Muhamad Fahriza Novriansyah
 * @version 1.0
 */
public class Balance
{
    // instance variables
    private User user;
    private int income;
    private int balance;
    private int budgetratio;
    private int budget;
    private int id;
     
    /**
     * Konstruktor untuk objek kelas Balance
     * @param id            id balance (pembeda) yang akan dibuat
     * @param income        pemasukan yang akan dimasukan ke saldo
     * @param budget        pengeluaran yang didapat dari pemasukan                     
     */
    
    public Balance(Income income, int budget){
        this.income = income.getIncome();
        this.user = income.getUser();
        this.budgetratio = budget;
        this.budget = (income.getIncome()*budget)/100;
        this.balance = income.getIncome()-getBudget(); 
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
     * Method setUser ini bertujuan untuk memasukan/mengatur User yang mempunyai balance/saldo
     * 
     * @param   user     parameter User yang mempunyai saldo
     */
    public void  setUser(User user){
        this.user = user;
    }
    
    public int getIncome(){
        return income;
    }
    
    public void  setIncome(int income){
        this.income = income;
    }
    
    /**
     * Method getBalance ini bertujuan untuk mendapatkan Saldo User
     * 
     * @return balance yang ada
     */
    public int getBalance(){
        return balance;
    }
    
    /**
     * Method setBalance ini bertujuan untuk memasukan/mengatur balance/saldo User
     * 
     * @param   balance     parameter balance yang dipunyai user
     */
    public void  setBalance(int balance){
        this.balance = balance;
    }
    
    /**
     * Method getId ini bertujuan untuk mendapatkan id balance
     * 
     * @return id balance sebagai pembeda dengan balance lainya 
     */
    public int getId(){
        return id;
    }
    
    /**
     * Method setId ini bertujuan untuk memasukan/mengatur id balance   
     *
     * @param   id     parameter id balance
     */
    public void  setId(int id){
        this.id = id;
    }
    
    /**
     * Method getBudget ini bertujuan untuk mendapatkan nilai budget 
     * 
     * @return budget yang akan menjadi pengeluaran yang didapat dari pemasukan untuk balance
     */
    public int getBudget(){
        return budget;
    }
    
    /**
     * Method setBudget ini bertujuan untuk memasukan/mengatur pengeluaran yang digunakan
     *
     * @param   budget   parameter budget yang akan mengurangi pemasukan
     */
    public void  setBudget(int budget){
        this.budget = budget;
    }
    
    public int getBudgetRatio(){
        return budgetratio;
    }
    
    public void  setBudgetRatio(int budget){
        this.budgetratio = budget;
        this.budget = (getIncome()*budget)/100;
        this.balance = getIncome()-getBudget(); 
    }
    
    public String toString(){
        return "Informasi User" 
        + "\nNama User          :   "+ getUser().getName() 
        + "\nJumlah Pemasukkan  :   "+ getIncome() 
        + "\nAlokasi Budget     :   "+ getBudget() 
        + "\nJumlah Tabungan    :   "+ getBalance();
        
    }
}