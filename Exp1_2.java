// AREA & PARAMETER;
import java.util.*;

public class Exp1_2 {
public static void main(String args[])
{
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number");
    double radius = scan.nextDouble();
    double area = 1, parimeter = 1;
    if( radius == 0)
    {
        System.out.println("Radius cannot be zero");
    }
    else
    {
        area = Math.PI*radius*radius;
        parimeter = 2*Math.PI*radius;
    }
    System.out.println(area);
    System.out.println(parimeter);
    
 
}
}
