
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String name;
        int duration;
        int maximumDuration;

        while (true) {
            System.out.print("Name: ");
            name = scan.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            duration = Integer.parseInt(scan.nextLine());

            programs.add(new TelevisionProgram(name, duration));
            System.out.println();
        }
        System.out.print("Program's maximum duration? ");
        maximumDuration = scan.nextInt();

        for (int i = 0; i < programs.size(); i++) {
            if (programs.get(i).getDuration() <= maximumDuration) {
                System.out.println(programs.get(i).toString());
            }
        }
    }
}
