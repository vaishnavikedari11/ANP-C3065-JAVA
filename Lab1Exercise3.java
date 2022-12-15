import java.util.Scanner;

public class Exercise3 {
    /*Exercise 3: Create a method to check if a number is an increasing number 
    A number is said to be an increasing number if no digit is exceeded by the digit to its left. 
     For Example : 134468 is an increasing  number*/

     public static int checkNumber(int n){
        boolean check=true;
        int pre=-1;
        int type=-1;
        while(n!=0){
            if(type==-1){
                if(pre==-1){
                    pre=n%10;
                    n=n/10;
                    continue;
                }
                if(pre==n%10){
                    check=false;
                    break;
                }
                if(pre>n%10){
                    type=1;
                    pre=n/10;
                    continue;
                }
                pre=n%10;
                n=n/10;
            }
            else{
                if(pre==n%10){
                    check=false;
                    break;
                }
                pre=n%10;
                n=n/10;
            }
            return n;
        }
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(){
             System.out.println("yes");
        }else{
            System.out.println("no");
        }        
    }
}
