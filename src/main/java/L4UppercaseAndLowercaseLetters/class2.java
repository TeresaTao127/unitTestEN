package L4UppercaseAndLowercaseLetters;

import java.util.Locale;

public class class2 implements TextFormatter{
    String Text;

    public class2(String text) {
        Text = text;
    }


    @Override
    public String getFormatText() {
        return Text.toLowerCase();
    }
}
