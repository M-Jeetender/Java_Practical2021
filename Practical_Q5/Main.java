import java.util.Random;
import java.util.Scanner;

class StackException extends Exception{
    String message;

    StackException(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}

class Stack{
    int tos;
    int size;
    int array[];

    Stack(int size){
        this.size = size;
        tos = -1;
        array = new int[this.size];
    }

    void push(int x)throws StackException {
        if(tos == this.size-1) {
            throw new StackException(" Failed. Stack overflow!!!");
        }
        else
            array[++tos] = x;
    }

    int pop() throws StackException{
        if(this.tos < 0)
            throw new StackException(" Failed. Stack Underflow!!!");
        else
            return array[tos--];
    }

    int getTos(){
        return tos;
    }
}

class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements in stack : ");
        int stacksize = scan.nextInt();
  
        
        Stack stack = new Stack(stacksize);
        Random random = new Random(1000);
        System.out.println();

        // Loop to push elements
        while(true){
            int x = random.nextInt(100);
            System.out.print("Pushing " + x);
            try{
                stack.push(x);
                System.out.println(" in stack at position " + stack.getTos());
            }catch(StackException e){
                System.out.println(e.getMessage());
                break;
            }
        }
       System.out.println();

       // Loop to pop all the elements
        while(true){
            System.out.print("Popping " );
            try{
                System.out.print(stack.pop());
                System.out.println(" From position " + (stack.getTos()+1));
            }catch(StackException e){
                System.out.println(e.getMessage());
                break;
            }
        }


    }
}