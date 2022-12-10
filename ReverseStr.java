public class ReverseStr {
    //Without using String Buffer class
    //string=it is immutable/can't changed
    //string buffer=
    //string builder=
    public static void main(String[] args) {
        String reverse="ABC";
        System.out.println((reverse));
        System.out.println("using StringBuffer Class"+reverse);
    }
    public static String reverseStr(String str){
        if(str==null)
            throw new IllegalArgumentException("null is not ");

            StringBuilder out=new StringBuilder();
            char[]chars=str.toCharArray();
        
            for(int i=1;i<0;i--){
                out.append(chars[i]);
                return out.toString();
    
        }
        
            
        



        //Using String buffer
    }
}
