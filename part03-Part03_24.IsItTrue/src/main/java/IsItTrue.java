
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str.equals("true")) {
            System.out.println("You got it right!");
        } else { 
            System.out.println("Try again!");
        }
        

    }
}
