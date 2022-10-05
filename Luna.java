import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер: ");
        String value = scan.next();
        int sum1 = 0; int sum2=0;
        final  int nDigits = value.length();
        for (int i = nDigits; i> 0; i--){
            int digit = Character.getNumericValue(value.charAt(i-1));
            int z=digit;int y=digit;
            if (i % 2 != 0){
                z *= 2;
                if (z > 9) {
                    z -= 9;
                }
                sum1 += z;
            }
            else  sum2 += y;           
        }
        int sum=sum1+sum2;
        System.out.println(sum);
        if (sum%10 == 0){
        System.out.println ("Номер действителен");
        } else {
        System.out.println("Номер не действителен");
    }        
    }
       
}
