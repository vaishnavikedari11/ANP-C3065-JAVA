public class DevideByZeroExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Main Methods Begins");
        try{                                            //for exception handlling we use try nd catch block.
        System.out.println(12/0);
        System.out.println("try ends");
        }catch(ArithmeticException ae){
            ae.printStackTrace();
        }
        System.out.println("Main Methods Ends");
    }
}
