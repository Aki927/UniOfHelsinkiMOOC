
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input;

        while (true) {
            input = scan.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(" ");
            for (int i = 0; i < pieces.length; i++) {
                if (pieces[i].contains("av")) {
                    System.out.println(pieces[i]);
                }
            }
        }

    }
}
