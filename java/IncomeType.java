/**
 * Enum class dari Income
 *
 * @author Yelli Yulfita
 * @version 15/05/2019
 */
public enum IncomeType
{
    Monthly("Monthly"),Additional("Additional");
        
    String incomeType;
        
    IncomeType(String incomeType){
        this.incomeType=incomeType;
    }
    
    public String toString(){
        return incomeType;
    }
    
}



    

