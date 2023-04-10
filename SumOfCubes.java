//Write a program to calculate sum of cubes of first N natural numbers
import java.util.*;
public class SumOfCubes{
    public static int CubeSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=(i*i*i);
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=sc.nextInt();
        System.out.println("Sum of "+n+" Cubes is: "+CubeSum(n));
    }
}