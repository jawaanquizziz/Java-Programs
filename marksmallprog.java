import java.util.Scanner;
public class marksmallprog {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks out of 100:");
        int marks = sc.nextInt();
        if (marks<35){
            System.out.println("You have passed the exam.");
        } else {
            System.out.println("You have failed the exam.");
        }
    }
    
}
