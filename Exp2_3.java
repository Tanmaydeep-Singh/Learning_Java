// Call the mothod of classes

import java.util.*;
class Student_2_3{
    public void print(){
        System.out.println("Hi! I a Student");
    }
    public void print(String name){
        System.out.println("My name is" + name);
    }
}
public class Exp2_3  {
    public static void main( String args[])
    {
        Student_2_3 student = new Student_2_3();

        student.print();
        student.print("Tanmaydeep");
    }
    
}
