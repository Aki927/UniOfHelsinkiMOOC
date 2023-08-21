
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("First name: ");
            String firstName = scan.nextLine();
            if (firstName.isEmpty()) {
                break;
            }
            System.out.print("Last name: ");
            String lastName = scan.nextLine();
            
            System.out.println("Identification number: ");
            String identificationNumber = scan.nextLine();
        
            infoCollection.add(new PersonalInformation(
                    firstName, lastName, identificationNumber));
        }
        System.out.println();
        
        for (PersonalInformation info : infoCollection) {
            System.out.println(info.getFirstName()+" "+info.getLastName());
        }
    }
}