// Call the mothod of classes
import java.util.*;
class Student{
    public void print(){
        System.out.println("Hi! I am Student Class");
    }
}
class School{
    public void print(){
        System.out.println("Hi! I am School Class");
    }
}
public class Exp2_2  {
    public static void main( String args[])
    {
        Student student = new Student();
        School school = new School();

        student.print();
        school.print();
    }
    
}
