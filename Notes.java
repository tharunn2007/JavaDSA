
////////////////////////PRIMITIVE DATATYPES///////////////////////

public class Primitive {
public static void main(String[] args) {
    int rollno = 59;
    //Primitive datatypes contain classes as well
    //Primitive dataype - any data type that we cant break any further eg:int,double,char,boolean
    //string is not a primitive since it can be broken into charecters and therefore char cant be broken further so it primive
    char letter='r';
    double largeDecimalNumbers = 1242134.1241241;
    float marks= 98.13f; 
    long largeInteger = 1241242435124L;
    boolean check = true;
//why f and L in these datatypes?
// All decimal are defult under double and adding f gives you in float  and same case as in long
//why integer and long can be same just like the same for float and double...why assigning different?


//so the same variables can act as classes (aka. wrapper classes ) where addtional features can be done as in --- Integer rno = 23 ; rno.*
}
}


//////////////////////////TAKING INPUT////////////////////////////



import java.util.Scanner;

public class IoDebug{
    public static void main(String[] args) {
        System.out.println("Hey how are you doing? ");
        //out - in printstream its value is Null as a commandline ; if we assign out=someFile then it outputs from a file

        Scanner input= new Scanner(System.in);
        System.out.println(input.nextInt());
        
        //INPUT: I am doing good!
        //OUTPUT: InputMistmatchException!!!      
        //EXPLANATION: Only Integers allowed for nextint()
      

    }
}



import java.util.Scanner;

public class IoDebug{
    public static void main(String[] args) {
        System.out.println("Hey how are you doing? ");
        //out - in printstream its value is Null as a commandline ; if we assign out=someFile then it outputs from a file

        Scanner input= new Scanner(System.in);
        System.out.println(input.nextInt());
        System.out.println(input.nextLine());
        
        //INPUT: I am doing good!
        //OUTPUT: I am doing good!       
        //EXPLANATION: Entire line is printed
    }
}

import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name:");
        String inp1 = input.nextLine();
        System.out.println("Hello"+inp1+".What is your grade ?");
        String inp2 = input.nextLine();
        System.out.println(inp2+" is actually a good grade!");
        input.close();
    }
}










