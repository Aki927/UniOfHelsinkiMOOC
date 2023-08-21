
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput > 0) {
                count++;
                sum+=userInput;

            } else if (userInput == 0 && count != 0) {
                double avg = (double) sum / count;
                System.out.println(avg);
                break;

            } else if (userInput == 0 && count == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }

        }

    }

}
//         System.out.println(sum / count);
