public class Lab1Exercise4 {
    //Exercise 4: Create a method to check if a number is a power of two or not 
    public static int checkNumber(int n){
        boolean isPowerOfTwo=true;
        if(n==0){
            return false;
            while(n!=1){
                if(n%2 !=0){
                    return false;
                    n=n/2;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        if(isPowerOfTwo){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }if(isPowerOfTwo){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    
}
