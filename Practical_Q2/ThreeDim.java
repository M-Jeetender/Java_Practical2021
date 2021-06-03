package P2;
import P1.*;

// Inheritating class TwoDim 
public class ThreeDim extends TwoDim{

private int z;

// Default constructor
public ThreeDim(){
super();
z =0;
}

//Parameterized constructor
public ThreeDim(int i, int j,int k){
super(i,j);
z=k;

}

public String toString(){
return super.toString() + " Z = " + z;


}

}