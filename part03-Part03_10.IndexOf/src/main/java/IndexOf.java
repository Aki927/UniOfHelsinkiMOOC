
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput;
        int search;

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            userInput = scan.nextInt();
            if (userInput == -1) {
                break;
            }
            numbers.add(userInput);
        }
        System.out.print("Search for? ");
        search = scan.nextInt();
        for (int i = 0; i <= numbers.size() - 1; i++) {
            if (search == numbers.get(i)) {
                System.out.println(search+" is at index "+i);
            }
        }
    }
}
