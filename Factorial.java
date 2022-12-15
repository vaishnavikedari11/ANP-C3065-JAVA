public class Factorial {
    public static void main(String[] args) {
        int n=5;

        for(int i=0;i<n;i++){

        }


        //Find factorial using while loop  n=n*n-1*n-2......1
        int f=7;
        int factorial=1;
        int i=1;
        while(i<=f){
            factorial *=i;
            i++;
        }
        System.out.println(factorial);

    }
}
