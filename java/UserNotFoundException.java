/**
 * Class UserNotFoundException akan memberitahu ketika terjadi error 
 * karena user yang ingin dicari tidak terdapat di database
 * 
 *
 * @author Bagaskara Ghanyvian Istiqlal
 * @version 15-05-2019
 */
public class UserNotFoundException extends Exception {
    private int user_error;
    /**
     * Konstruktor untuk UserAlreadyExistException 
     */
    public UserNotFoundException(int user_error) {
        super("User ID : ");
        this.user_error = user_error;
    }
    /**
     * Method ini mengembalikan pesan error
     */
    public String getExMessage() {
        return super.getMessage() + user_error + " not found.";
    }
}
