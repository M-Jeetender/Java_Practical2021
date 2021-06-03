package P;
import P1.*;
import P2.*;

class Main{

public static void main(String args[]){

TwoDim ref;
 ref = new TwoDim(3, 6);
 System.out.println("Two Dimenension");
 System.out.println(ref);      // calls toString() from class TwoDim

 System.out.println("Three Dimension");
 ref = new ThreeDim(3, 6, 9);
 System.out.println(ref);    //  calls toString() from class ThreeDim


}

}