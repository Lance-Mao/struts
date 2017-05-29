package globalization;

import java.util.Locale;

public class ji {
    public static void main(String[] args) {
        Locale defaultLocale = Locale.getDefault();
        System.out.println("country=" + defaultLocale.getCountry());
        System.out.println("language=" + defaultLocale.getLanguage());
    }
}
