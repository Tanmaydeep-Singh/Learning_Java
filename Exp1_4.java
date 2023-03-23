// Largest of 3
import java.util.*;
public class Exp1_4 {
    public static void main( String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        double num1 = scan.nextDouble(), num2 = scan.nextDouble(), num3 = scan.nextDouble();

        if( num1 >= num2 && num1 >= num3)
        {
            System.out.println(num1);
        }
        else
        if( num2 >= num1 && num2 >= num3)
        {
            System.out.println(num2);
        }
        else
        {
            System.out.println(num3);
        }


    }
}
