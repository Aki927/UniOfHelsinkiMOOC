
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        String row;
        String[] parts;
        String name;
        int age;

        try ( Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                row = fileScan.nextLine();
                parts = row.split(",");
                name = parts[0];
                age = Integer.valueOf(parts[1]);
                System.out.println(name + ",age: " + age + " years"); 
            }          
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
    }
}
