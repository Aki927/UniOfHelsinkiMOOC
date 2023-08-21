
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        int x;

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }

            numbers.add(number);
            
            for (int i = 0; i <= numbers.size()-1; i++) {
                x = numbers.get(i);
            }
        }
        for (int i = 0; i <= numbers.size()-1; i++) {
            x = numbers.get(i);
            System.out.println(x);
        }
    }
}
