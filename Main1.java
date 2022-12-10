
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main1 {

    public static void main(String[] args) {
        //list of product in mycart
        List<String>listProduct=new ArrayList<>();          
        listProduct.add("Sugar");
        listProduct.add("Rice");
        listProduct.add("Oil");
        //showing list of product
        System.out.println(listProduct);
        //adding product
        listProduct.add("Salt");                
        System.out.println(listProduct);
        //indexing
        System.out.println(listProduct.indexOf(" ")); 
        //
    }
}
