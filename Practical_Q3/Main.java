import P1.*;
import P2.*;
import P3.*;

import java.util.Scanner;

class Main{

    public static void main(String args[]){

        System.out.println("\n *** Select one of the Shape to find it's area ***  \n");
        System.out.println("1.Rectangel" + "\n2.Circle");
        int choice;
        System.out.print("Enter your choice : ");
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        System.out.println();

        P1.Shape ref;          // Using member selection operator to run in CMD. Remove if running in IDE
        boolean flag = false;

        while(!flag){

            switch(choice){

                case 1 :
                    flag = true;
                    ref = new P2.Rectangle(); // Using member selection operator to run in CMD. Remove if running in IDE
                    System.out.println("Area : " + ref.Area() + " Sq. units");
                    break;

                case 2 :
                    flag = true;
                    ref = new P3.Circle(); // Using member selection operator to run in CMD. Remove if running in IDE
                    System.out.println("Area : " + ref.Area() + " Sq. units");
                    break;

                default :
                    System.out.println("Invalid selection.Try again!!!");
                    System.out.print("Enter your choice : ");
                    choice = scan.nextInt();
                    break;
            }


        }


    }

}