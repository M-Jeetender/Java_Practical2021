package P3;
import P1.*;
import java.util.Scanner;

public class Circle extends Shape{

    float radius;

    Scanner scan = new Scanner(System.in);

        protected void getData(){
        System.out.print("Enter the radius : ");
        radius = scan.nextInt();

    }

    public double Area(){
        getData();
        return 2*3.14*radius;
    }


}