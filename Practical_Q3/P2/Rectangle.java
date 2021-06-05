package P2;
import P1.*;
import java.util.Scanner;

public class Rectangle extends Shape{

    int l;
    int b;

    Scanner scan = new Scanner(System.in);

    protected void getData(){
        System.out.print("Enter the length : ");
        l = scan.nextInt();
        System.out.print("Enter the breadth : " );
        b = scan.nextInt();

    }

    public double Area(){
        getData();
        return l*b;
    }


}