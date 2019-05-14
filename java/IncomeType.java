 


/**
 * Enumeration class Day - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum IncomeType
{
    Monthly("Monthly"),Daily("Daily");
    
    String incomeType;
    
    IncomeType(String incomeType){
        this.incomeType=incomeType;
        
}
public String toString(){
    return incomeType;
}
}



    

