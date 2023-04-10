//Write a program to reverse a given number
import java.util.*;
public class ReverseNumber{
    public static int Reverse(int n){
        int result=0;
        while(n!=0){
            int rem=n%10;
            result=result*10+rem;
            n=n/10;
        }
        return result;
    } 
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int num=sc.nextInt();
        System.out.println(num+" In Reveresed: "+Reverse(num));
    }
}