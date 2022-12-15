import java.util.Scanner;

public class Even {
    public static void checkEven(int n){
        if(n%2==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is not even");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number top check it is even or not");
        int n=sc.nextInt();
        checkEven(n);
    }
}
