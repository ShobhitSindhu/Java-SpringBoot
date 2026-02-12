package project;
import java.util.Scanner;

class BankSystem {


    private static String username = "Shobhit";
    private static String password = "1234";

    private static double balance = 1000.0;
    private static String fullName = "Shobhit Sindhu";
    private static String email = "shobhit@email.com";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.print("Enter Username: ");
        String inputUser = sc.nextLine();

        System.out.print("Enter Password: ");
        String inputPass = sc.nextLine();

        if (!inputUser.equals(username) || !inputPass.equals(password)) {
            System.out.println("Invalid credentials! Access Denied.");
            return;
        }



        int choice;

        do {
            System.out.println(" MENU ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Check Balance");
            System.out.println("4. Edit Profile");
            System.out.println("5. Change Password");
            System.out.println("6. Exit");
            System.out.print("Select Option: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit done");
                    } else {
                        System.out.println("Invalid amt");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Insufficient balance ");
                    }
                    break;
                case 3:
                    System.out.println("Current Balance: ₹" + balance);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Enter new full name: ");
                    fullName = sc.nextLine();
                    System.out.print("Enter new email: ");
                    email = sc.nextLine();
                    System.out.println("Profile updated ");
                    break;
                case 5:
                    sc.nextLine(); 
                    System.out.print("Enter current password: ");
                    String currentPass = sc.nextLine();
                    if (currentPass.equals(password)) {
                        System.out.print("Enter new password: ");
                        password = sc.nextLine();
                        System.out.println("Password changed ");
                    } else {
                        System.out.println("Incorrect ");
                    }
                    break;
                case 6:
                    System.out.println("Thank you for using our banking system!");
                    break;

                default:
                    System.out.println("Invalid option");
            }
        } while (choice != 6);
        sc.close();
    }
}