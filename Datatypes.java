package Queues;
import java.util.*;
public class Datatypes {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your weight ");
        float weight = sc.nextFloat();
        System.out.println("Enter your grade");
        char grade = 'A';
        System.out.println("Enter your Number");
        double number = sc.nextDouble();
        boolean istrue = sc.nextBoolean();

        System.out.println(name+" "+age+" "+weight+" "+grade+" "+number+" "+istrue);

    }
}
