package P1;

public class TwoDim{

private int x;
private int y;


// Default constructor
public TwoDim(){       
x=0;
y=0;
}

// Parameterized constructor
public TwoDim(int x, int y){
this.x = x;
this.y=y;
}


public String toString(){
return "X = " + x + " Y = " + y ;
}

}