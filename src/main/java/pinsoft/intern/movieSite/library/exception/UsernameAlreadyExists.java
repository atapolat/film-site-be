package pinsoft.intern.movieSite.library.exception;

public class UsernameAlreadyExists extends RuntimeException{
    public UsernameAlreadyExists(String msg){
        super(msg);
    }
}
