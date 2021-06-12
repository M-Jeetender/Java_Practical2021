import java.util.Scanner;

class UnderAge extends Exception {
    final private int age;

    public UnderAge(int age) {
        this.age = age;
    }

    public String getMessage() {
        return "UnderAge : " + age + " is less than 18";
    }
}

class exceptionDemo {

    // Throws UnderAge exception
    static void test(int age) throws UnderAge { 
        if (age < 18)
            throw new UnderAge(age);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        try {
            test(age);
            System.out.println(age + " is a legal age");
            System.out.println("Test Successful.");
        } catch (UnderAge e) {
            System.out.println(e.getMessage());
            System.out.println("Test Unsuccessful.");
        }
    }
}
