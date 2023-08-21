

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
        

    } // end of main method
    
                                     //(int userInput) -> parameters
    public static void printUntilNumber(int userInput) { 
        for (int i = 1; i <= userInput; i++) {
            System.out.println(i);
        }
        
    } // end of printUntilNumber method

} // end of class
