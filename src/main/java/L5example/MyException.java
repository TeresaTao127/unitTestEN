package L5example;

public class MyException extends Exception{

    @Override
    public String getMessage() {
        return "This is my exception by Lei";
    }
}
