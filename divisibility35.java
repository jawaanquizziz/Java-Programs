import java.util.Scanner;

public class divisibility35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(num + " is divisible by both 3 and 5.");
            } else if (num % 3 == 0) {
                System.out.println(num + " is divisible by 3.");
            } else if (num % 5 == 0) {
                System.out.println(num + " is divisible by 5.");
            } else {
                System.out.println(num + " is not divisible by 3 or 5.");
            }

            System.out.println("Do you want to continue with another number? (Y/N)");
            char choice = sc.next().charAt(0);
            if (choice == 'N' || choice == 'n') {
                System.out.println("Exiting the program.");
                break;
            }
        }

        sc.close();
    }
}
