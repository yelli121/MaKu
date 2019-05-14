
/**
 * Write a description of class UserNotFoundException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserNotFoundException extends Exception {
    private int user_error;

    public UserNotFoundException(int user_error) {
        super("User ID : ");
        this.user_error = user_error;
    }

    public String getExMessage() {
        return super.getMessage() + user_error + " not found.";
    }
}
