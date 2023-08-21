import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String userInput;
        String last = null;
        
        while (true) {
            userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            String[] pieces = userInput.split(" ");
            for (int i = 0; i < pieces.length; i++) {
                last = pieces[pieces.length-1];
            }
            System.out.println(last);
        }
    }
}