
public class YourFirstAccount {

    public static void main(String[] args) {
//        String Ro = "Ro";
        double balance = 100.0;
        
        Account Aki = new Account("Aki", 100.0);
        
        Aki.deposit(20.0);
        System.out.println(Aki);
    }
}
