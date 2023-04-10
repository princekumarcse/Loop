//Write a program to print a table of N.
import java.util.*;
public class NthTable{
    public static void PrintTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Nth Table: ");
        int table=sc.nextInt();
        PrintTable(table);
    }
}