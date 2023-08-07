package L4UppercaseAndLowercaseLetters;

public class LettersLowerCase implements TextFormatter {
    String text;

    public LettersLowerCase(String text) {
        this.text = text;
    }

    @Override
    public String getFormatText() {
        return text.toLowerCase();
    }
}
