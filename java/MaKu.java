
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
        System.out.println(gajiadel.toString());
        Income tunjanganadel = new AdditionalIncome(adel, 500000);
        DatabaseBalance.addBalance(new Balance(gajiadel, 70));
        
        System.out.println(DatabaseBalance.getBalance(adel).getIncome());
        System.out.println(DatabaseBalance.getBalance(adel).getBudget());
        System.out.println(DatabaseBalance.getBalance(adel).getBalance());
        
        System.out.println(tunjanganadel.toString());
        DatabaseBalance.addBalance(new Balance(tunjanganadel, 60));
        
        System.out.println(DatabaseBalance.getBalance(adel).getIncome());
        System.out.println(DatabaseBalance.getBalance(adel).getBudget());
        System.out.println(DatabaseBalance.getBalance(adel).getBalance());
        
        System.out.println(DatabaseBalance.getBalance(adel).toString());
        
        /*try{
                    Expense pengeluaranadel = new Expense(adel, tabunganadel, 50, 30, 20);
                    System.out.println(pengeluaranadel.getFoodExpense());
                    System.out.println(pengeluaranadel.getTransportExpense());
                    System.out.println(pengeluaranadel.getAdditionalExpense());
                }
                    
                catch(ExpensePercentageNotFulfilled coba){
                    System.out.println(coba.getExMessage());
                }*/
        
        
    }
}
