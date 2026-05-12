public class Arrays{
    public static void main(String[] args) {
        // Store a roll no:
        int a  = 59;

        // store a name
        String name = "Tharunn";


        //store n number of roll no

        //Array is the collection of primitve data types/objects or other complex data types

        /*
        SYNTAX-declaration

        datatype[] variable_name  = new datatype[size];

        */
       int[] rno = new int[5]; //new is used to create an object
       for(int i =0;i<rno.length;i++){
        System.out.println(rno[i]);
       }
       int[] rnos2 = {12,23,34,56,67}; //all the data in an array SHOULD BE SAME
       for(int i =0;i<rnos2.length;i++){
        System.out.println(rnos2[i]);
       }
       int[] rno3; //declaration - happens at compile time
       rno3 = new int[5]; // initialization :actually here object is being created in the heap memory - created at runtime (dynamic memory allocation) 
    

       
    }
    
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays; //importing Array module for its extending wrapper functions  
public class practice {

    //Getting input from user to creat an array 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter 5 numbers :");
        for(int i = 0; i<array.length;i++){
            array[i] = input.nextInt();
        }

       System.out.println(Arrays.toString(array)); //helps us to convert the array as in string format to print instead of printing its hexaldecimal hashcode


       //appending an array :
       //ARRAYS CANT BE APPENDED ONCE THE SIZE IS FIXED ONCE DECLARED
       array2 = Arrays.copyOf(array,array.length+1);
       array2[array.length -1] = 6;
       System.out.println(Arrays.toString(array));

       //deleting element from array :

       //from last place and from any place we need from:

       // array of objects
        String[] str = new String[3];
       System.out.println("Enter the string : ");
        for(int i = 0; i<str.length;i++){
            str[i] = input.next().trim(); //the wrord taking the first word of string and with no preceding space
        }
       str2 = Arrays.copyOf(str,str.length+1); //copy  -  arrayname,length
       str2[str2.length -1]= "APPENDED";
       System.out.println("BEFORE APPENDED :" + Arrays.toString(str));
       System.out.println("APPENDED NEW : "+ Arrays.toString(str2));

    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


