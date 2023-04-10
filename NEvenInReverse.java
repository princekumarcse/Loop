//Write a program to print the first N even natural numbers in reverse order
import java.util.*;
public class NEvenInReverse{
public static void PrintEvenReverse(int n){
    for(int i=n;i>=1;i--){
        System.out.print(2*i+" ");
    }
}

public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter N : ");
 int n=sc.nextInt();
 PrintEvenReverse(n);
}
}