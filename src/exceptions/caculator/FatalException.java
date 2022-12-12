package exceptions.caculator;

public class FatalException extends RuntimeException{
    public FatalException(){
        super("Fatal Exception");
    }
}
