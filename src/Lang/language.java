package Lang;

import java.util.Locale;
import java.util.Scanner;

public class language {

    public static void main(String[] args) {

        LanguageExample t = new LanguageExample();

        Locale usLocale = new Locale("en", "US");
        Locale frLocale = Locale.FRANCE;
        Locale zhLocale = new Locale("zh", "CN");
        Locale hiLocale = new Locale("hi", "IN");
        Locale deLocale = Locale.GERMANY;
        Locale arLocale = new Locale("ar", "SA");

        Scanner sc = new Scanner(System.in);

        System.out.println("Select your language:");
        System.out.println("1: English");
        System.out.println("2: French");
        System.out.println("3: Chinese");
        System.out.println("4: Hindi");
        System.out.println("5: German");
        System.out.println("6: Exit");

        int choice = sc.nextInt();

        switch (choice) {
            case 1: t.show(usLocale); break;
            case 2: t.show(frLocale); break;
            case 3: t.show(zhLocale); break;
            case 4: t.show(hiLocale); break;
            case 5: t.show(deLocale); break;
            case 6: t.show(arLocale); break;
            default:
                System.out.println("Exiting...");
        }

        sc.close();
    }
}
