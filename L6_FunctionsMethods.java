public class Method{
    public static void main(String[] args) {
        /*
        access modifier(in oops be covered) return_type name() {
        //body
        return statment;
        }
        */
    }
}

//////////////////////////////////////////////

//return type is the what is the value that is goign tot be when a functions are called
//SUM of 2 numbers
import java.util.Scanner;

public class Method{
    public static void main(String[] args) {
        sum();//static error will say "non static method sum cant accessed from static context  "
    }
    static void sum(){ //void is the return type here,sum is the method name,writing here static has a reason to do with oops
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = input.nextInt();
        System.out.println("Enter b");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("THE SUM IS :"+ sum);
        //ANYTHING THAT WE WANT TO USE TO CALL BE IN STATIC FOR THE METHOD CALL in the main method (here main is the Method)
    }
}

//Greeting

