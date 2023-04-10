//. Write a program to count digits in a given number
import java.util.*;
public class DigitCount{
    public static int CountDigit(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=sc.nextInt();
        System.out.println("Total Digit in "+n+" is : "+CountDigit(n));
    }
}