
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userInput;
        String first = "";

        while (true) {
            userInput = scan.nextLine();
            if (userInput.equals("")) {
                break;
            }

            String[] pieces = userInput.split(" ");
            for (int i = 0; i < 1; i++) {
                first = pieces[0];
            }
            System.out.println(first);
        }
    }
}
