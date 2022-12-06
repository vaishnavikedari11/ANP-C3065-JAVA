public class Exception {
    public static void main(String[] args) {
        System.out.println("Main Method Begins");
        try{
            int a[]={3,2};
            System.out.println(12/10);
            try{
            System.out.println(a[3]);
                }catch(ArithmeticException e){
                    System.out.println("Inner catch1");
                }
                System.out.println("try ends");
            }catch(ArrayIndexOutOfBoundsException ae){
                System.out.println("Outer catch1");
                ae.printStackTrace();
            }catch(Exception ae){
                System.out.println("outer catch2");
                ae.printStackTrace();
            }
    }
}
