
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String userInput;
        String oldestPuppy = null;
        int oldest = 0;
        int age;
        
        while (true) {
            userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            String[] pieces = userInput.split(",");
            age = Integer.valueOf(pieces[1]);
            if (age > oldest) {
                oldest = age;
                oldestPuppy = pieces[0];
            }
        }
        System.out.println("Name of the oldest: "+oldestPuppy);
    }
}
