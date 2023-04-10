// Write a program to print the first N odd natural numbers in reverse order.
import java.util.*;
public class NOddInReverse{
    public static void PrintOdd(int n){
        for(int i=n;i>=1;i--){
            System.out.print((2*i-1)+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        PrintOdd(n);
    }
}