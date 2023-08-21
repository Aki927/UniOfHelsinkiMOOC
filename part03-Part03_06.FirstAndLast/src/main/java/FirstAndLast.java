
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str;

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
            
            for (int i = 0; i <= list.size() - 1; i++) {
                str = list.get(i);
            }
        }
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
    }
}
