package Exception;

public class MyException extends Exception{
    private final int errCode;
    MyException(String msg, int errCode){
        super(msg);
        this.errCode = errCode;
    }
    MyException(String msg){
        this(msg, 100);
    }

    public int getErrCode(){
        return errCode;
    }
}
