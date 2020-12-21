package blogPackage;

public class MyExceptionList_2 extends Exception {

    public MyExceptionList_2() {
    }

    public MyExceptionList_2(String message) {
        super(message);
    }

    public MyExceptionList_2(String message, Throwable cause) {
        super(message, cause);
    }

    public MyExceptionList_2(Throwable cause) {
        super(cause);
    }

    public MyExceptionList_2(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
