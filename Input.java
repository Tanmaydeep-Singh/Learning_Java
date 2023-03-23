import java.util.*;

public class Input {
public static void main(String args[])
{
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = scan.nextInt();
    int c1 = 2;
    int sum = 0;
    a=a*2;
    while(a>0)
    {
        if( a % 6 == 0)
        {
            sum += a;
        }
    a--;
    }

    System.out.println(sum);
}
}
