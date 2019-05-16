/**
 * Class UserAlreadyExistException akan memberitahu ketika terjadi error 
 * karena user yang ingin ditambahkan sudah terdapat di database
 * 
 *
 * @author Bagaskara Ghanyvian Istiqlal
 * @version 15-05-2019
 */

public class UserAlreadyExistException extends Exception {
    private User user_error;
    
    /**
     * Konstruktor untuk UserAlreadyExistException 
     */
    public UserAlreadyExistException(User user_input){
        super("User ID : ");
        this.user_error = user_input;
    }
    
    
    /**
     * Method ini mengembalikan pesan error
     */
    public String getExMessage(){
        return super.getMessage() + user_error.getUsername() + " already exist.";
    }
}