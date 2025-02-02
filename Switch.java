package localrepo;
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in the range:(1-3)");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You selected Option 1: Hello, World!");
                break;
            case 2:
                System.out.println("You selected Option 2: Welcome to Java!");
                break;
            case 3:
                System.out.println("You selected Option 3: Keep Learning!");
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 3.");
        }
        
        sc.close();

    }}