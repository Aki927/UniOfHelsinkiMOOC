
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average;
        int userInput;

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            userInput = scanner.nextInt();
            if (userInput == -1) {
                break;
            }
            numbers.add(userInput);
        }
        for (int i = 0; i <= numbers.size()-1; i++) {
            sum += numbers.get(i);
        }
        average = (double) (sum)/numbers.size(); 
        System.out.println("Average: "+average);

    }
}
