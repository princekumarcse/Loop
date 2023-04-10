//Write a program to print squares of the first N natural numbers
import java.util.*;
public class SquareOfNnum{
    public static void PrintSquare(int n){
        for(int i=1;i<=n;i++){
            System.out.print(i*i+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=sc.nextInt();
        PrintSquare(n);
    }
}