public class ThrowsException {
    static void raiseException()throws Exception{
        int age=-67;
        Exception e=new Exception()
        if(age<0)
        //throw e;
        throw new Exception();
    }
    public static void main(String[] args) {
        int age=-67;
        RuntimeException e=new RuntimeException();
        if(age<0)
        //throw e;
        throw new RuntimeException();

    }
}
