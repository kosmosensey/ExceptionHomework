package pro.sky.secondcourse.hw.exceprion;

public class WrongLoginException extends Exception {
    public WrongLoginException (String message) {
        super(message);
    }
}
