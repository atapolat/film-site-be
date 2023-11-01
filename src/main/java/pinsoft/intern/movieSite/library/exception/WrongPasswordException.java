package pinsoft.intern.movieSite.library.exception;

public class WrongPasswordException extends RuntimeException{

    public WrongPasswordException(String message) {
        super(message);
    }
}
