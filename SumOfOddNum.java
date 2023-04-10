//Write a program to calculate sum of first N odd natural numbers
import java.util.*;
public class SumOfOddNum{
    public static int SumofOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=(2*i-1);
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=sc.nextInt();
        System.out.println("Sum of " +n+" Odd natural number is: "+SumofOdd(n));
    }
}