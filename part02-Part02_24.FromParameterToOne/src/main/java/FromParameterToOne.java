

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    
    public static void printFromNumberToOne(int userInput) {
        
        while(userInput > 0) {
            System.out.println(userInput);
            userInput--;
        }
    }
}
