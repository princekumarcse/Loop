//Write a program to print the first N even natural numbers
import java.util.*;
public class NEven{
    public static void PrintEvenNumber(int n){
        for(int i=1;i<=n;i++){
            System.out.print((2*i)+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=sc.nextInt();
        PrintEvenNumber(n);
    }
}