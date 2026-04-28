import java.util.Scanner;

public class Conditions {

   public static void main(String[] args) {
    //IF-ELSE CONDITIONS:
        /*SYNTAX:

        if(boolean expression T or F){
        body  
        }
        else if(espression 2){
        body 
        }
        else{
          body
        }
      */
    //FOR LOOP:
      /*SYNTAX:
        for (initialisation;condition;increment/decrement){
        body
        }
    */
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = input.nextInt();
    for(int i=1;i<=num;i++){
    if(i%2 == 0){
            System.out.println(i + " is EVEN");
        }
        else{
            System.out.println(i+ " is ODD");
        }
    }
     }
   } 



////////////////////////////////////////////
//WHILE LOOPS 
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
       //WHILE LOOP
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER NUMBER:");
    int num = input.nextInt();
    int i = 1;
    while (i<=num) {
        if(i%2 == 0){
            System.out.println(i +  " is even");
            
        }
        else{
            System.out.println(i +  " is odd");
            
        }
        i++;
    } 
    input.close();
    }
    
    
}

/////////////////////////////////////////////////////////
//PROBLEMS


//LARGEST OUT OF THREE
import java.util.Scanner;

public class Largest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER 3 NUMBERS A,B,C BY PRESSING (ENTER)SINGLE TIME:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a>=b && a>=c){
            System.out.println("A is largest");
        }
        else if(b>=a && b>=c){
            System.out.println("B is largest");
        }
        else{
            System.out.println("C is the largest");
        }
        input.close();
    }

}


//ALPHABET CASE CHECK
import java.util.Scanner;

public class AlphabetCheck{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //WILL BE USING .trim()  removes the extra spaces  in.next()  takes the first word   charAt(index_number) takes for the string part to be a char type
        System.out.println("Enter a word");
        
        char ch = input.next().trim().charAt(0);
        System.out.println(ch); // eg: qwert  output:q
        
    }

}

//ACTUAL CODE
import java.util.Scanner;

public class AlphabetCheck{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("ENTER THE SENTENCE:");
       
       String word = input.nextLine().trim(); //takes the string extra spaces

       for(int i=0;i<word.length();i++){
        char ch = word.charAt(i);
        if(Character.isUpperCase(ch)){
            System.out.println(ch+ " IS UPPERCASE");

        }
        else if(Character.isLowerCase(ch)){
            System.out.println(ch+ " IS LOWERCASE");
            
        }
        else{
            System.out.println("Non-charectizable charecter"); //for the whitespaces inbetween 
            
        }
       }
       input.close();
    }

}

//Fibonacci number
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of fibonacci limit:");
    Integer fib = input.nextInt();
    int fib1= 0;
    int fib2=1;
    int fib3;
    if(fib==1){
        System.out.println(fib1);
    }
    else if(fib==2){
        System.out.println(fib1);
        System.out.println(fib2);
    }
    else{
        System.out.println(fib1);
        System.out.println(fib2);
        for(int i=1;i<=fib-2;i++){
            fib3 = fib1 + fib2;
            System.out.println(fib3);
            fib1=fib2;
            fib2=fib3;
        }

    }
    input.close();

}
} 

//number occurance



