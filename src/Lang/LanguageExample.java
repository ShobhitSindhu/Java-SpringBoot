package Lang;

import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;

public class LanguageExample {

    public void show(Locale loc) {

        ResourceBundle bundle =
                ResourceBundle.getBundle("message", loc);

        System.out.println("Date: " + LocalDate.now());
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("welcome"));
        System.out.println(bundle.getString("message1"));
        System.out.println(bundle.getString("message2"));
        System.out.println(bundle.getString("regards"));
    }
}
