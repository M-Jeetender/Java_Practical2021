package P1;

public class TwoDim{

private float x;
private float y;

public TwoDim(){       // Default constructor
x=0;
y=0;
}

public TwoDim(float i, float j){
x = i;
y=j;
}

public String toString(){
return " X : " + x + " Y : " + y;
}

}