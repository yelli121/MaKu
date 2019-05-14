
/**
 * Write a description of class Balance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Balance
{
    // instance variables - replace the example below with your own
    private User user;
    private int balance;
    private int budget;
    private int id;
    
    /**
     * Constructor for objects of class Balance
     */
 
   
    public Balance( int id, Income income, int budget){
        this.user = income.getUser();
        this.budget = income.getIncome()*(budget/100);
        this.balance = income.getIncome() - this.budget; 
    }
    
    
    public User getUser(){
        return user;
    }
    
    public void  setUser(){
        this.user = user;
    }
    
  
    public int getBalance(){
        return balance;
    }
    
    public void  setBalance(){
        this.balance = balance;
    }
    
    public int getId(){
        return id;
    }
    
    public void  setId(){
        this.id = id;
    }
    
    public int getBudget(){
        return budget;
    }
    
    public void  setBudget(){
        this.budget = budget;
    }
}
