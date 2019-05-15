import java.util.ArrayList;

/**
 * Class DatabaseCustomer merupakan database Customer barang.
 * Terdiri dari array listCustomer untuk menyimpan daftar Customer dan objek Supply
 *
 * @author Bagaskara Ghanyvian Istiqlal
 * @version 1.0 28/02/2019
 */
public class DatabaseUser {
    // instance variables - replace the example below with your own
    private static ArrayList<User> USER_DATABASE = new ArrayList<>();
    private static int LAST_USER_ID = 0;

    public static int getLastUserId() {
        return LAST_USER_ID;
    }

    /**
     * Method addCustomer
     * digunakan untuk menambahkan objek Customer baru kedalam list
     *
     * @param customer
     * @return boolean true sebagai status telah berhasil memasukan
     * objek
     */
    public static boolean addUser(User user) throws UserAlreadyExistException {
        // put your code here
        for (User temp : USER_DATABASE) {
            if (temp.getUsername() == user.getUsername()) {
                throw new UserAlreadyExistException(temp);
            }
        }
        USER_DATABASE.add(user);
        LAST_USER_ID = user.getId();
        return true;
    }

    /**
     * Method removeItem
     * digunakan untuk menghapus objek item dari dalam list
     *
     * @param id
     * @return boolean true sebagai status telah berhasil menghapus
     * objek
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
     * Method getListCustomer
     * digunakan untuk mendapatkan list Customer
     *
     * @param
     * @return String[] listCustomer
     */
    public static ArrayList<User> getCustomerDatabase() {
        // put your code here
        return USER_DATABASE;
    }

    /**
     * Method getItem
     * digunakan untuk mendapatkan item
     *
     * @param
     * @return objek Customer
     */
    public static User getUser(int id) {
        //put your code here
        for (User user : USER_DATABASE) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public static User getUserLogin(String username, String password) {

        for (User user : USER_DATABASE) {
            if (user.getUsername() == username && user.getPassword() == password) {
                return user;
            }
        }
        return null;
    }
}