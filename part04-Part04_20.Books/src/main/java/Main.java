import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        String userInput;
        String title;
        int pages = 0;
        int publicationYear = 0;
        
        while (true) {
            System.out.print("Title: ");
            title = scan.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            pages = Integer.parseInt(scan.nextLine());
            
            System.out.print("Publication year: ");
            publicationYear = Integer.parseInt(scan.nextLine());
            
            books.add(new Book(title, pages, publicationYear));
        }       
        
        System.out.println("What information will be printed? ");
        userInput = scan.nextLine();
        
        for (int i = 0; i < books.size(); i++) {
            if (userInput.equals("everything")) {
                System.out.println(books.get(i).toString());
            } else if (userInput.equals("name")) {
                System.out.println(books.get(i).getTitle());
            }
        }
    }
}
/*
//            } else if (userInput.equals("name")) {
//                System.out.println(books.get(i).getTitle());
//            }
*/
