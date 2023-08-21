import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputName;
        String inputPassword;
        String u1First = "alex";
        String u1Password = "sunshine";
        String u2First = "emma";
        String u2Password = "haskell";
        
        System.out.print("Enter username: ");
        inputName = scan.nextLine();
        System.out.print("Enter password: "); // Changed println to print
        inputPassword = scan.nextLine();
        
        if ((inputName.equals(u1First) && inputPassword.equals(u1Password)) || 
            (inputName.equals(u2First) && inputPassword.equals(u2Password))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
