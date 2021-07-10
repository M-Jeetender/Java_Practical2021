
import java.util.*;

class Complex{

    static int x = 1;
    Scanner sc = new Scanner(System.in);
    int real;
    int img;

    Complex(int real, int img){
        this.real = real;
        this.img = img;

        System.out.print("The Complex number is ");
        display();
    }

    Complex(){


        System.out.println("For Complex Number " + x++);
        System.out.print("Enter the real part : ");
        real = sc.nextInt();
        System.out.print("Enter the imaginary part : ");
        img = sc.nextInt();
        System.out.print("The Complex number is ");
        display();

        System.out.println();
    }

    void display(){
        System.out.println(real + " + " + img + "i");
    }

    Complex add(Complex c){
        this.real += c.real;
        this.img += c.img;

        return this;
    }

    Complex multiply(Complex c){
        this.real = (this.real*c.real) - (this.img*c.img);
        this.img = (this.real*c.img) + (this.img*c.real);

        return this;
    }
}

class ComplexDriver{

    public static void main(String args[]){
        Complex c1 = new Complex();
        Complex c2 = new Complex();

        System.out.println();

        Complex c3 = c1.add(c2);
        System.out.print("After adding : ");
        c3.display();

        Complex c4 = c1.multiply(c2);
        System.out.print("After multiplying : ");
        c4.display();;

    }
}
