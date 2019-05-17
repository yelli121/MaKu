import java.util.Scanner;

/**
 * Kelas utama dari program Manajemen Keuangan (MaKu)
 *
 * @author Adel Fahmi Karim
 * @version 16 Mei 2019
 */
public class MaKu
{
  
    /**
     * Konstruktor untuk kelas MaKu
     */
    public MaKu()
    {
        
    }

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("##### Registrasi User #####");
        System.out.println("Nama            : ");
        String nama = keyboard.nextLine();
        System.out.println("Username        : ");
        String username = keyboard.nextLine();
        System.out.println("Password        : ");
        String password = keyboard.nextLine();
        System.out.println("Tahun lahir (dalam angka)   : ");
        int tahun = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Bulan lahir (1-12)          : ");
        int bulan = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Tanggal lahir (dalam angka) : ");
        int tanggal = keyboard.nextInt();
        keyboard.nextLine();
        
        try
        {
            DatabaseUser.addUser(new User(nama, username, password,tahun, bulan, tanggal));
            System.out.println(DatabaseUser.getUser(username).toString());
        }
        catch(UserAlreadyExistException coba)
        {
            System.out.println(coba.getExMessage());
        }
        
        System.out.println("\nJumlah pemasukkan bulanan user       : ");
        int gaji = keyboard.nextInt();
        keyboard.nextLine();
        DatabaseIncome.addIncome(new MonthlyIncome(DatabaseUser.getUser(username), gaji));
        System.out.println("\nRasio Budget yang diinginkan (1-100) : ");
        int rasio = keyboard.nextInt();
        keyboard.nextLine();
        DatabaseBalance.addBalance(new Balance(DatabaseIncome.getIncome(DatabaseUser.getUser(username)), rasio));
        System.out.println(DatabaseBalance.getBalance((DatabaseUser.getUser(username))).toString());
        
        System.out.println("\nPembagian rasio pengeluaran untuk makanan, transportasi, dan pengeluaran lainnya");
        System.out.println("\nJumlah rasio untuk tiga rasio pengeluaran harus 100");
        System.out.println("\nRasio Budget pengeluaran makanan      : ");
        int makanan = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("\nRasio Budget pengeluaran transportasi : ");
        int transportasi = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("\nRasio Budget pengeluaran lainnya      : ");
        int lainlain = keyboard.nextInt();
        keyboard.nextLine();
        
        try
        {
            DatabaseExpense.addExpense(new Expense(DatabaseUser.getUser(username), 
            DatabaseBalance.getBalance(DatabaseUser.getUser(username)), makanan, transportasi, lainlain));
            
            System.out.println(DatabaseExpense.getExpenseFromUser(DatabaseUser.getUser(username)).toString());
        }
        catch(ExpensePercentageNotFulfilled coba)
        {
            System.out.println(coba.getExMessage());
        }
        
        /*
         * 
         * Testrun lainnya
         *  
        User adel = new User("adel", "ardelt", "18273645",1996, 12, 17)
        Income gajiadel = new MonthlyIncome(adel, 4000000);
        System.out.println(gajiadel.toString());
        Income tunjanganadel = new AdditionalIncome(adel, 500000);
        DatabaseBalance.addBalance(new Balance(gajiadel, 70));
        
        System.out.println(DatabaseBalance.getBalance(adel).toString());
        
        System.out.println(tunjanganadel.toString());
        DatabaseBalance.addBalance(new Balance(tunjanganadel, 60));
        
        System.out.println(DatabaseBalance.getBalance(adel).toString());
        
        try
        {
            Expense pengeluaranadel = new Expense(adel, DatabaseBalance.getBalance(adel), 25, 25, 50);
            System.out.println(pengeluaranadel.toString());
        }
        catch(ExpensePercentageNotFulfilled coba)
        {
            System.out.println(coba.getExMessage());
        }*/
        
    }
}
