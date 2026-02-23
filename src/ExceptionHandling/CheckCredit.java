package ExceptionHandling;

import java.util.Scanner;

import static java.lang.System.*;

public class CheckCredit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String input = sc.nextLine();
            input = input.replace(" ", "");

            if (input.length() < 16) {
                throw new InvalidSize("Invalid credit card size");
            }

            out.println("Correct credit");
        }
        catch (InvalidSize e) {
            out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
