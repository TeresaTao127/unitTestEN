package L4UppercaseAndLowercaseLetters;

public class Class2 implements TextFormatter {
    String text;

    public Class2(String text) {
        this.text = text;
    }

    @Override
    public String getFormatText() {
        return text.toLowerCase();
    }
}
