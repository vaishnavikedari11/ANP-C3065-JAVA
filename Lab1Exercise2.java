import java.util.Scanner;

public class Lab1Exercise2 {
//Exercise 2: Create a class with a method to find the difference between the sum of the 
//squares and the square of the sum of the first n natural numbers.
//condition (1^2+2^2+3^2+....n^2)-(1+2+3+4+....n)^2
        
    public static int calculateSquareDifference(int n){
        
        int a=(n*(n+1)*(2*n+1))/6;        //sum of squares of n natural numbers
        int b=(n*(n+1))/2;               //sum of n natural numbers
        b=b*b;                            //square of b(sum of n natural numbers)
        int c=Math.abs(a-b);                //difference between a nd b.
        return c;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n ");
        int n=sc.nextInt();
    System.out.println(calculateSquareDifference(n));
    
    }
}
