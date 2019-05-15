
/**
 * Write a description of class MaKu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MaKu
{
  
    /**
     * Constructor for objects of class MaKu
     */
    public MaKu()
    {
        
    }

    public static void main(String[] args){
        User adel = new User("adel", "ardelt", "18273645",1996, 17, 12);
        Income gajiadel = new MonthlyIncome(adel, 4000000);
        Balance tabunganadel = new Balance(gajiadel, 70);
        
        System.out.println(tabunganadel.getBudget());
        System.out.println(tabunganadel.getBalance());
        
        try{
                    Expense pengeluaranadel = new Expense(adel, tabunganadel, 50, 30, 20);
                    System.out.println(pengeluaranadel.getFoodExpense());
                    System.out.println(pengeluaranadel.getTransportExpense());
                    System.out.println(pengeluaranadel.getAdditionalExpense());
                }
                    
                catch(ExpensePercentageNotFulfilled coba){
                    System.out.println(coba.getExMessage());
                }
        
        
    }
}
