//Write a program to print Prince Kumar N times on the screen
import java.util.*;
public class PrintPrinceNtimes{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N Number: ");
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            System.out.println("Prince Kumar");
            i++;
        }
    }
}