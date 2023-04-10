//Write a program to print the first N natural numbers in reverse order
import java.util.*;
public class NNaturalNumInReverse{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N Number: ");
        int num=sc.nextInt();
        while(num>=1){
            System.out.println(num);
            num--;
        }
    }
}