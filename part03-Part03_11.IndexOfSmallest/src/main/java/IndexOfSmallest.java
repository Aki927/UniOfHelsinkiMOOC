
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int smallest;
        int userInput;

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            userInput = scan.nextInt();
            if (userInput == 9999) {
                break;
            }
            numbers.add(userInput);
        }
        smallest = numbers.get(0);
        for (int i = 0; i <= numbers.size() - 1; i++) {
            if (smallest > numbers.get(i)) {
                smallest = numbers.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i <= numbers.size() - 1; i++) {
            if (smallest == numbers.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
