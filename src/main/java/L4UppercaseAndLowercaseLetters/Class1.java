package L4UppercaseAndLowercaseLetters;

public class Class1 implements TextFormatter {

    String text;

    public Class1(String text) {
        this.text = text;
    }

    @Override
    public String getFormatText() {
        return text.toUpperCase();
    }
}
