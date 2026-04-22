import java.util.Scanner;

public class BookMyStayApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("   Welcome to Book My Stay App     ");
        System.out.println("===================================");

        System.out.println("\n1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");

        System.out.print("\nPlease select an option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nRedirecting to Login...");
                // TODO: Call login functionality
                break;

            case 2:
                System.out.println("\nRedirecting to Registration...");
                // TODO: Call registration functionality
                break;

            case 3:
                System.out.println("\nThank you for using Book My Stay App!");
                break;

            default:
                System.out.println("\nInvalid choice. Please try again.");
        }

        scanner.close();
    }
}
