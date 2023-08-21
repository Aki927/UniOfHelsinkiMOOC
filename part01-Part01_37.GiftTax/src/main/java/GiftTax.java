
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Value of gift
        int     first   =   5000;
        int     second  =   25000;
        int     third   =   55000;
        int     fourth  =   200000;
        int     fifth   =   1000000;
        // Tax at the lower limit
        int     tax1    =   100;
        int     tax2    =   1700;
        int     tax3    =   4700;
        int     tax4    =   22100;
        int     tax5    =   142100;
        // Tax rate(%) for exceeding part
        double  tr1     =   0.08;
        double  tr2     =   0.10;
        double  tr3     =   0.12;
        double  tr4     =   0.15;
        double  tr5     =   0.17;
        
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        
        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value >= 5000 && value < 25000) {
            System.out.println("Tax: " + (tax1 + (value - first) * tr1));
        } else if (value >= 25000 && value < 55000) {
            System.out.println("Tax: " + (tax2 + (value - second) * tr2));
        } else if (value >= 55000 && value < 200000) {
            System.out.println("Tax: " + (tax3 + (value - third) * tr3));
        } else if (value >= 200000 && value < 1000000) {
            System.out.println("Tax: " + (tax4 + (value - fourth) * tr4));
        } else {
            System.out.println("Tax: " + (tax5 + (value - fifth) * tr5));
        }
    }
}