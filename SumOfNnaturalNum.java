//Write a program to calculate sum of first N natural numbers
import java.util.*;
public class SumOfNnaturalNum{
    public static int Sum(int n){
        int sum=0 , i;
        for(i=1;i<=n;i++){
             sum=sum+i;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N:" );
        int n=sc.nextInt();
        System.out.println("Sum of "+n+" Natural number  is : "+ Sum(n));
    }
}