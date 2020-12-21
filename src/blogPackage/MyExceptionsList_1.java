package blogPackage;

public class MyExceptionsList_1 extends Exception {

    public MyExceptionsList_1() {
    }

    public MyExceptionsList_1(String message) {
        super(message);
    }

    public MyExceptionsList_1(String message, Throwable cause) {
        super(message, cause);
    }

    public MyExceptionsList_1(Throwable cause) {
        super(cause);
    }

    public MyExceptionsList_1(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
