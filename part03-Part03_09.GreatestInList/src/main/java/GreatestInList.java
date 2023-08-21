
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput;
        int value;
        int greatest = 0;

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            userInput = scan.nextInt();
            if (userInput == -1) {
                break;
            }
            numbers.add(userInput);
        }
        for (int i = 0; i <= numbers.size() - 1; i++) {
            if (greatest < numbers.get(i)) {
                greatest = numbers.get(i);
            }
        }
        System.out.println("The greatest number: " + greatest);
    }
}