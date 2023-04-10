//Write a program to check whether a given number is a Prime number or not

import java.util.*;
public class PrimeNumber{
    public static int CheckPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        int result=CheckPrime(num);
        if(num==2){
            System.out.println(num+ " Is Prime");
        }
        if(result==-1){
            System.out.println(num+ " Is  Prime");
        }else{
            System.out.println(num+ " Is Not Prime");
        }
    }
}