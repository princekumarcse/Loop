//Write a program to print the first 10 odd natural numbers in reverse order.
public class OddNumberInReverse{
    public static void main(String args[]){
        int i=10;
        while(i>=1){
            System.out.println((2*i-1));
            i--;
        }
    }
}