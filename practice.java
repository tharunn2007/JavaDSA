import java.util.Scanner;

public class practice {

    static boolean LeapYearOrNot(int year){
        if(year%4 == 0){
            if(year%100==0){
                if (year%400 == 0) {
                    return true;
                    
                }
                return false;
            }
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year : ");
        Integer year = input.nextInt();
        System.out.println(LeapYearOrNot(year));
        input.close();
    }
    
}
/*
A YEAR IS LEAP YEAR IF  : 
    DIVISIBLE BY 4 BUT NOT BY 100
    DIVISIBLE BY 4,100 AND 400
A YEAR IS NOT LEAP YEAR IF:
    DIVISIBLE BY 4 AND BY 100
    DIVISIBLE BY 4 AND BY 100 BUT NOT BY 400
 */

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class practice {
    static int Sum(int a,int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        Integer a = input.nextInt();
        System.out.println("Enter number 2 :");
        Integer b = input.nextInt();

        System.out.println("The sum of a and b is : "+ Sum(a,b));
    }
    
    
}
/*TAKE INPUT FROM USER AND USE A SUM METHOD */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class practice {
    static void MultiplicationTable(int number,int tonumber) { 
        for(int i = 1 ; i<=tonumber;i++){
           
            System.out.println(number+ " * " + tonumber + " = "+ (number*i));
        } //need not write return cuz void doesnt return anything

    }
    public static void main(String[] args) { //while writing void we dont need to return and also return type (int,boolean,etc) need not be mentioned
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to be multiplied : ");
        Integer number = input.nextInt();
        System.out.println("Enter the number to which to be multiplied ; ");
        Integer tonumber = input.nextInt();
        
        MultiplicationTable(number, tonumber); //need not print when we are calling for void based method
    }
    
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class practice {
    public static int HCF(int a ,int b){
        if(b== 0){
            return a;
        }
        else{
            return HCF(b,a%b); //Euclidean algo  --  first a is getting divided and then b is devisor (gives a%b)....next b is getting devided and a%b becomes divisor
        }
            
    }
    public static int LCM(int a,int b){
        return Math.abs(a*b)/HCF(a, b); //Absolute function used
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a :");
        Integer a  = input.nextInt();
        System.out.println("Enter b :");
        Integer b  = input.nextInt();
        System.out.println("HCF : "+ HCF(a,b) + " LCM : "+ LCM(a, b));

    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////







