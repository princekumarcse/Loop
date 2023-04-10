//Write a program to print the first N odd natural numbers
import java.util.*;
public class NOddNaturalNum{
    public static void OddNaturalnumber(int n){
        for(int i=1;i<=n;i++){
            System.out.print((2*i-1)+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N : ");
        int num=sc.nextInt();
        OddNaturalnumber(num);
    }
}