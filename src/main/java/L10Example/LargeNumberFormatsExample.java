package L10Example;

import java.text.NumberFormat;
import java.util.Locale;

public class LargeNumberFormatsExample {
    public static void main(String[] args) {
        NumberFormat format=NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.SHORT);
        System.out.println(format.format(1000));
        System.out.println(format.format(1000000));
        System.out.println(format.format(100000000));

        NumberFormat format1=NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.LONG);
        System.out.println(format1.format(1000));
        System.out.println(format1.format(1000000));
        System.out.println(format1.format(100000000));

        NumberFormat format2=NumberFormat.getCompactNumberInstance(Locale.CHINA, NumberFormat.Style.SHORT);
        System.out.println(format2.format(1000));
        System.out.println(format2.format(1000000));
        System.out.println(format2.format(100000000));

    }
}
