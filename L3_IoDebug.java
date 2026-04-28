//If the file name is IoBug then the class name is also to be named WILL BE SEEN IN OOPS

public class IoDebug{ //This public means this class IoDebug can be accessed from any packages,files or other classes

//ANY FUNCTION UNDER A CLASS IS CALLED METHOD

//when public static is given ---this is considered as the starting point of the code...whatver objects we create are not considered
    public static void main(String[] args) {
         //public in the method makes it accessible to execute it anywhere ,if we make private then the the main() function cant run anywhere and thus the class also wont run
         //if the main function we have to execute  without creating a object of  the IoDebug class... static variables and functions dont depend on the objects of the classes
         //void is the return type of function...so in this time of our code we dont need to get any return type so we put
        // String[] args is commandline arguements where String is a array of string named args...every arguements is stored as in array...will be learnt more 
        System.out.println("Helloo");
/*
What is system.out.println(); ?
memorise for now until oops
 */
        
    }

}
//package-folder in which java file lies in
//package  pkg.subpkg

////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class IoDebug {

    public static void main(String[] args) {
        System.out.println("Hello how you doing?");// currently by default out is null.will be talking abt it later
        Scanner input = new Scanner(System.in); // making object input from the "new" keyword and the type of input we get from System.in --that is the input object from out keyboard
        //System.in is a constuctor initializing an object called "input"
        System.out.println(input.nextInt() );

        //RUNTIME
            //Hello hwo you doing?
            //INPUT:
            //369
            //OUTPUT:
            //369
    }
}

////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("What is your age?");
        Integer age = input.nextInt();
        System.out.println("What is your cgpa?");
        Float gpa = input.nextFloat();
        System.out.println("What is the decimal value of pi?");
        Double pi = input.nextDouble();
        System.out.println("Your name: "+ name );
        System.out.println("Your age: "+ age);
        System.out.println("Your cgpa :" + gpa);
        System.out.println("Your pi value: " + pi);
        

    }
}
/////////////////////////////////////////////////////////////////////////////////
//TYPE CASTING




