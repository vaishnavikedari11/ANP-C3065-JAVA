import java.util.Arrays;

public class CheckSameElement {
    public static void main(String[] args) {
        int a[]={12,54,13,15};
        int b[]={12,13,54,15};
        boolean result=Arrays.equals(a, b);
        if(result==true){
            System.out.println("a and b have equal elements");
        }else{
            System.out.println("a and b have not equal elements");
        }
    }
}
