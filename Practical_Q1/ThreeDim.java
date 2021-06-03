package P2;
import P1.*;

public class ThreeDim extends TwoDim{

private int z;

public ThreeDim(){
super();
z =0;
}

public ThreeDim(int i, int j, int k){
super(i,j);
z=k;

}

public String toString(){
return super.toString() + " Z : " + z;


}

}