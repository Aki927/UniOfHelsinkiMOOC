
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput;
        int counter = 0;

        while (true) {
            userInput = scanner.nextLine();
            if (userInput.equals("end")) {
                break;
            } else {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
