import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.*;
import java.util.regex.*;

/**
 * User Class mengggambarkan user yang memakai aplikasi 
 * managemen keuangan ini.
 *
 * @author Bagaskara Ghanyvian Istiqlal
 * @version 15-05-2019
 */

public class User {
    // instance variables - replace the example below with your own
    private String name;
    private String username;
    private String password;
    private int id;
    private Calendar birthDate;

    /**
     * Constructor for objects of class Customer
     * @param name Ini merupakan nama dari user
     * @param username Ini merupakan username yang digunakan oleh user
     * @param password Ini merupakan password yang dimiliki oleh user
     * @param birthDate Ini merupakan tanggal lahir dari user
     * 
     */
    public User(String name, String username, String password, Calendar birthDate) {
        // initialise instance variables
        this.name = name;
        this.username = username;
        this.password = password;
        this.id = DatabaseUser.getLastUserId() + 1;
        this.birthDate = birthDate;
    }

    /**
     * Alternative constructor for objects of class Customer
     * @param name Ini merupakan nama dari user
     * @param username Ini merupakan username yang digunakan oleh user
     * @param password Ini merupakan password yang dimiliki oleh user
     * @param year Ini merupakan tahun kelahiran dari user
     * @param month Ini merupakan bulan kelahiran dari user
     * @param dayOfMonth Ini merupakan tanggal kelahiran dari user
     * 
     */
    public User(String name, String username, String password, int year, int month, int dayOfMonth) {
        // initialise instance variables
        this.name = name;
        this.username = username;
        this.password = password;
        this.id = DatabaseUser.getLastUserId() + 1;
        this.birthDate = new GregorianCalendar(year, month - 1, dayOfMonth);
    }

    /**
     * Metode ini mengembalikan nama pengguna
     *
     * @return name
     */
    public String getName() {
        // put your code here
        return this.name;
    }
    
    /**
     * Metode ini mengembalikan username pengguna
     *
     * @return username
     */
    public String getUsername() {
        // put your code here
        return this.username;
    }

    
    /**
     * Metode ini mengembalikan kata sandi pengguna
     *
     * @return password
     */
    public String getPassword() {
        // put your code here
        return this.password;
    }

    /**
     * Metode ini mengembalikan id pengguna
     *
     * @return id
     */
    public int getId() {
        // put your code here
        return this.id;
    }
    
    /**
     * Metode ini mengembalikan tanggal lahir pengguna
     *
     * @return id
     */
    public Calendar getBirthDate() {
        // put your code here
        Date tempDate = this.birthDate.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
        String strDate = formatter.format(tempDate);
        //System.out.printf("Tanggal lahir : %s ", strDate);
        //System.out.println("Tanggal lahir : " + strDate);

        return birthDate;
    }

    /**
     * Metode ini mengatur nama pengguna dari parameter yang diberikan
     *
     * @param name
     */
    public void setName(String name) {
        // put your code here
        this.name = name;
    }

    /**
     * Metode ini mengatur username dari parameter yang diberikan 
     *
     * @param username
     */
    public void setUsername(String username) {
        // put your code here
        this.username = username;
    }
    
    /**
     * Metode ini mengatur kata sandi pengguna dari parameter yang diberikan.
     * Persyaratan kata sandi adalah:
     * (1) 6 karakter minimal,
     * (2) Setidaknya harus ada 1 huruf kapital, 1 huruf kecil, dan 1 angka
     *
     * @param password
     */
    public void setPassword(String password) {
        // put your code here
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(password);
        if (m.find()) {
            this.password = password;
        } else {
            this.password = "NULL";
        }

    }
    
    /**
     * Metode ini mengatur id pengguna dari parameter yang diberikan
     *
     * @param id
     */
    public void setID(int id) {
        // put your code here
        this.id = id;
    }

    /**
     * Metode ini mengatur tanggal lahir pengguna dari parameter yang diberikan 
     *
     * @param birthDate Ini dalam format class Calendar
     */
    public void setBirthDate(Calendar birthDate) {
        // put your code here
        this.birthDate = birthDate;

    }

    /**
     * Metode alternatif untuk mengatur tanggal lahir pengguna dari parameter yang diberikan 
     *
     * @param year Ini merupakan tahun kelahiran dari user
     * @param month Ini merupakan bulan kelahiran dari user
     * @param dayOfMonth Ini merupakan tanggal kelahiran dari user
     */
    public void setBirthDate(int year, int month, int dayOfMonth) {
        // put your code here
        this.birthDate.set(year, month, dayOfMonth);
    }
    
    /**
     * Metode ini mengembalikan semua informasi tentang Pengguna dalam String 
     *
     * @param temp
     */
    public String toString() {
        // put your code here
        String temp = "Customer ID = " + this.id + "\n" +
                "Name = " + this.name + "\n" +
                "Username = " + this.username + "\n" +
                "Password = " + this.password + "\n"
                ;
        temp += "Tanggal lahir = " + this.getBirthDate().getTime();
        return temp;
    }


}