import java.text.*;
import java.util.*;
/**
 * Write a description of class Monthly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MonthlyIncome extends Income
{
    private static final IncomeType INCOME_TYPE=IncomeType.Monthly;
    SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MM yyyy");
    private User user;
    private Date date;
    private boolean isActive = false;
    
    public MonthlyIncome(User user, int income)
    {
        super(income);
        this.user=user;
        Date date = new Date();
        this.date = date;
    }
    
    public IncomeType getIncomeType(){
        return INCOME_TYPE;
    }
    
    public User getUser(){
        return user;
    }
    
    public void setUser(User user){
        this.user=user;
    }
    
    public String toString(){
        return "belum ditentukan";
    }
}

