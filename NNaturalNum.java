//Write a program to print the first N natural numbers.
import java.util.*;
public class NNaturalNum{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N Number: ");
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            System.out.println(i);
            i++;
        }
    }
}