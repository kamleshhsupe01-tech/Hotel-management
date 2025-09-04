import java.util.Scanner;

public class hotel_management {
    static String[] guests = new String[10];
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Guest");
            System.out.println("2. View Guests");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                if (count < guests.length) {
                    System.out.print("Enter guest name: ");
                    guests[count] = scanner.nextLine();
                    count++;
                    System.out.println("Guest added.");
                } else {
                    System.out.println("Hotel full!");
                }
            } else if (choice == 2) {
                if (count == 0) {
                    System.out.println("No guests.");
                } else {
                    System.out.println("Guest list:");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + guests[i]);
                    }
                }
            } else if (choice == 3) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
