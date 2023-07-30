package L4UppercaseAndLowercaseLetters;

import java.util.Locale;

public class class1 implements TextFormatter{

    String Text;

    public class1(String text) {
        Text = text;
    }

    @Override
    public String getFormatText() {
        return Text.toUpperCase();
    }
}
