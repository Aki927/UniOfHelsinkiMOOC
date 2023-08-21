
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int userInput;

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            userInput = scan.nextInt();
            if (userInput == -1) {
                break;
            }
            numbers.add(userInput);
        }
        for (int i = 0; i <= numbers.size() - 1; i++) {
            sum += numbers.get(i);
        }
        System.out.println("Sum: " + sum);
    }
}
