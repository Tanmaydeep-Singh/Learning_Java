// ARMSTRONG NUMBER
import java.util.*;

public class Exp1_3 {
public static void main( String args[])
{
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = scan.nextInt();
    int check = number;
    int sum = 0;
    int pow = (int)Math.log10(number) + 1;
    while(number > 0)
    {
       int temp =  number % 10;
       sum +=Math.pow(temp,pow);
       number /= 10;
    }
    if( sum == check )
    {
        System.out.println("yes");
    }
    else
    {
        System.out.println("No");
    }

}    
}
