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







