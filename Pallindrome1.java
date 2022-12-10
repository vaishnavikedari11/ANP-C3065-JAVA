import java.util.Scanner;

public class Pallindrome1{

    static boolean checkPallindromeString(String input){
        boolean result=true;
        int length=input.length();

        for(int i=0;i<length/2;i++){
            if(input.charAt(i) !=input.charAt(length-i-1)){
                result=false;
                break;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String Str=sc.nextLine();

        //
     //   System.out.println(checkPallindromeString);
       // System.out.println(checkPallindromeString);

        //kjgkjfs
        /*int rev;
        for(int i=length-1;i>=0;i--){
            rev=rev+Str.charAt(i);
        }
        if(Str.equals(rev)){
            System.out.println("String is Pallindrome");
        }else{
            System.out.println("String is not Pallindrome");
        }*/
    }
}