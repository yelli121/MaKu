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
    private int balance;
    private int budget;
    private int id;
     
    /**
     * Konstruktor untuk objek kelas Balance
     * @param id            id balance (pembeda) yang akan dibuat
     * @param income        pemasukan yang akan dimasukan ke saldo
     * @param budget        pengeluaran yang didapat dari pemasukan                     
     */
    
<<<<<<< HEAD
    public Balance(Income income, int budget){
=======
    public Balance( int id, Income income, int budget){
>>>>>>> 95fbe00fef4b7a33659c33a1704d9130ead8b269
        this.user = income.getUser();
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
}
