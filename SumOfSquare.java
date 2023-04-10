//Write a program to calculate sum of squares of first N natural numbers
import java.util.*;
public class SumOfSquare{
    public static int Sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=(i*i);
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=sc.nextInt();
        System.out.println("Sum of "+n+" Square Natural Number is : "+Sum(n));
    }
}