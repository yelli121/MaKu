 


/**
 * Write a description of class income here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Income
{
    // instance variables - replace the example below with your own
    private User user;
    private int id;
    private int income;
    private IncomeType incomeType;
    
    public Income (User user,int id, int income,IncomeType incomeType){
        this.id = id;
        this.user = user;
        this.income=income;
        this.incomeType = incomeType;
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
    
    public IncomeType getIncomeType(){
        return incomeType;
    }
    
    public void setId(){
        this.id=id;
        
    }
    
    public void setUser(){
        this.user=user;
        
    }
    
    public void setIncome(){
        this.income=income;
        
    }
    
    public void setIncomeType(){
        this.incomeType=incomeType;
    }
    
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
