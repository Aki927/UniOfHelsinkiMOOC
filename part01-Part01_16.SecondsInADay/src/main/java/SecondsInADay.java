
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int first = 60;
        int second = 60;
        int third = 24;
        
        System.out.println("How many days would you like to convert to seconds?");
        // int value = Integer.valueOf(scanner.nextLine());
        int SecondsInADay = Integer.valueOf(scanner.nextLine());
        System.out.println((first * second * third) * SecondsInADay);
    }
}