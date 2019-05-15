
/**
 * Write a description of class AdditionalIncome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdditionalIncome extends Income
{
    private static final IncomeType INCOME_TYPE=IncomeType.Additional;
    private User user;
    private boolean isActive = false;
    
    public AdditionalIncome(User user, int income)
    {
        super(income);
        this.user=user;
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
