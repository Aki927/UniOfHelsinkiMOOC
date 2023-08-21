
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(1, 12);
    }
    
    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 ==0) {
                System.out.println(i);
            }
        }

    }

}
/*  
    // using a while loop:
    public static void divisibleByThreeInRange(int beginning, int end) {
        while (beginning < end) {
            if (beginning % 3 == 0) {
                System.out.println(beginning);
            }
            beginning++;
        }
*/