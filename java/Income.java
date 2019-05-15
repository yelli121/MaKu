import java.util.Scanner;

/**
 * Write a description of class income here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public abstract class Income
{
    // instance variables - replace the example below with your own
    private User user;
    private int id;
    private int income;
    private IncomeType incomeType;
    
    public Income (int income){
        this.income=income;
        setId(DatabaseIncome.getLastIncomeID()+1);
    }
    
    public int getId(){
        return id;
    }
    
    public User getUser(){
        return user;
    }
    
    public int getIncome(){
        return income;
    }
    
    public abstract IncomeType getIncomeType();
    
    public void setId(int id){
        this.id=id;
        
    }
    
    public void setUser(User user){
        this.user=user;
        
    }
    
    public void setIncome(int income){
        this.income=income;
        
    }
    
    public abstract String toString();
    
    /*public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double income=input.nextDouble();
        double uang=0;
        
        if (income > 500000)
        uang = income;
        if (income >500000)
        System.out.println("uang yang dimasukkan");
        
    }*/
}
