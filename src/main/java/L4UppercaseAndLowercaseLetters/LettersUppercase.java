package L4UppercaseAndLowercaseLetters;

public class LettersUppercase implements TextFormatter {

    String text;

    public LettersUppercase(String text) {
        this.text = text;
    }

    @Override
    public String getFormatText() {
        return text.toUpperCase();
    }
}
