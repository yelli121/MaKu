public class UserAlreadyExistException extends Exception {
    private User user_error;

    public UserAlreadyExistException(User user_input){
        super("User ID : ");
        this.user_error = user_input;
    }
    public String getExMessage(){
        return super.getMessage() + user_error.getUsername() + " already exist.";
    }
}