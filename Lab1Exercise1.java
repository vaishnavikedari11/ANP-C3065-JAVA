import java.util.Scanner;
//Exercise 1: Create a class with a method which can calculate the sum of first n natural 
//numbers which are divisible by 3 or 5. 

public class Lab1Exercise1 {

    public static void calculateSum(int n){
        for(int i=1;i<=n;i++){
            int sum=0;
            if(n%3==0 && n%5==0){
                sum=sum+i;
            }
        
        System.out.println(sum);
        return ;
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        calculateSum(n);
    }
}