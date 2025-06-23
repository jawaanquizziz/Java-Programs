import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cgpa_m = 0.0;

        System.out.println("Enter your Name:");
        String name = sc.nextLine();

        double marks;

        while (true) {
            System.out.println("Enter your total marks out of 800:");
            marks = sc.nextDouble();
            if (marks > 800 || marks < 0) {
                System.out.println("Invalid marks entered. Try again.");
            } else {
                cgpa_m = (marks / 800) * 10;
                break; 
            }
        }

        System.out.println("Enter department:");
        String department = sc.next();

        System.out.println("Enter semester:");
        int semester = sc.nextInt();

        System.out.println("\nStudent Result");
        System.out.println("Name: " + name);
        System.out.println("Score: " + marks + "/800");
        System.out.println("Department: " + department);
        System.out.println("Semester: " + semester);
        System.out.println("CGPA: " + cgpa_m);

        if (cgpa_m >= 9.0) {
            System.out.println("Grade: A+");
        } else if (cgpa_m >= 8.0) {
            System.out.println("Grade: A");
        } else if (cgpa_m >= 7.0) {
            System.out.println("Grade: B+");
        } else if (cgpa_m >= 6.0) {
            System.out.println("Grade: B");
        } else if (cgpa_m >= 5.0) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }
}
