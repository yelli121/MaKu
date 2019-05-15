import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.*;
import java.util.regex.*;

/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
     * Constructor for objects of class Customer
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
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
     */
    public String getName() {
        // put your code here
        return this.name;
    }
    public String getUsername() {
        // put your code here
        return this.username;
    }

    public String getPassword() {
        // put your code here
        return this.password;
    }

    public int getId() {
        // put your code here
        return this.id;
    }

    public Calendar getBirthDate() {
        // put your code here
        Date tempDate = this.birthDate.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
        String strDate = formatter.format(tempDate);
        //System.out.printf("Tanggal lahir : %s ", strDate);
        //System.out.println("Tanggal lahir : " + strDate);

        return birthDate;
    }



    public void setName(String name) {
        // put your code here
        this.name = name;
    }

    public void setUsername(String username) {
        // put your code here
        this.username = username;
    }

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

    public void setID(int Id) {
        // put your code here
        this.id = id;
    }

    public void setBirthDate(Calendar birthDate) {
        // put your code here
        this.birthDate = birthDate;

    }

    public void setBirthDate(int year, int month, int dayOfMonth) {
        // put your code here
        this.birthDate.set(year, month, dayOfMonth);
    }

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