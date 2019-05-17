import java.text.*;
import java.util.*;

/**
 * Class DatabaseUser merupakan database user .
 * Terdiri dari Arraylist User untuk menyimpan daftar user
 *
 * @author Bagaskara Ghanyvian Istiqlal
 * @version 15/05/2019
 */
public class DatabaseUser {
    // instance variables - replace the example below with your own
    private static ArrayList<User> USER_DATABASE = new ArrayList<User>();
    private static int LAST_USER_ID = 0;

    
    /**
     * Method getLastUserId
     * digunakan untuk mendapatkan Id terakhir yang dipakai pada database
     */
    public static int getLastUserId() {
        return LAST_USER_ID;
    }

    /**
     * Method addUser
     * digunakan untuk menambahkan objek User baru kedalam list
     *
     * @param user
     * @return true sebagai status telah berhasil memasukan objek
     * @exception UserAlreadyExistException ketika user yang ingin 
     * ditambahkan sudah terdapat pada database
     */
    public static boolean addUser(User user) throws UserAlreadyExistException {
        // put your code here
        for (User temp : USER_DATABASE) {
            if (temp.getUsername() == user.getUsername()) {
                throw new UserAlreadyExistException(temp);
            }
        }
        USER_DATABASE.add(user);
        LAST_USER_ID++;
        return true;
    }

    /**
     * Method removeUser
     * digunakan untuk menghapus objek item dari dalam list
     *
     * @param id
     * @return true sebagai status telah berhasil menghapus user
     * @exception UserNotFoundException ketika user tidak ditemukan
     */
    public static boolean removeUser(int id) throws UserNotFoundException {
        // put your code here
        for (User user : USER_DATABASE) {
            if (user.getId() == id) {
                USER_DATABASE.remove(user);
                return true;
            }
        }
        throw new UserNotFoundException(id);
    }

    /**
     * Method getListCustomer digunakan untuk mendapatkan list Customer
     *
     * @return USER_DATABASE
     */
    public static ArrayList<User> getUserDatabase() {
        // put your code here
        return USER_DATABASE;
    }

    /**
     * Method getUser
     * digunakan untuk mendapatkan item
     *
     * @param username
     * @return user
     */
    public static User getUser(String username) {
        User pengguna = null;
        for (User temp : USER_DATABASE) {
            if (temp.getUsername() == username) {
                pengguna = temp;
            }
        }
        return pengguna;
    }

    /**
     * Method getUserLogin digunakan untuk melakukan login
     *
     * @param username
     * @param password
     * @return user
     */
    public static User getUserLogin(String username, String password) {

        for (User user : USER_DATABASE) {
            if (user.getUsername() == username && user.getPassword() == password) {
                return user;
            }
        }
        return null;
    }
}