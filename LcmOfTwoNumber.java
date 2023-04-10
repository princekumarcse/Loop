//Write a program to calculate LCM of two numbers
import java.util.*;
public class LcmOfTwoNumber{
    
        public static int Lcm(int a,int b){
            int max=a>b?a:b;
            for(int i=max;i<=a*b;i++){
                if(max%a==0 && max%b==0){
                    return max;
                }
            }
            return a*b;
        }
        public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Lcm of "+num1+" And "+num2+" Is : "+Lcm(num1,num2));
    }
}