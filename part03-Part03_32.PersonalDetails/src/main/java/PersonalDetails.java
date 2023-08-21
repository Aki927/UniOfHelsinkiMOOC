
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        String name = null;
        int longestName = 0;
        int length;
        int birthYear;
        double avgBirthYears;
        int sum = 0;
        int count = 0;

        while (true) {
            userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            String[] pieces = userInput.split(",");
            for (String piece : pieces) {
                length = pieces[0].length();
                if (length > longestName) {
                    longestName = length;
                    name = pieces[0];
                }
            }
            for (String piece : pieces) {
                birthYear = Integer.valueOf(pieces[1]);
                sum += birthYear;
                count++;
            }
        }
        avgBirthYears = (double)(sum)/count;
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + avgBirthYears);
    }
}
