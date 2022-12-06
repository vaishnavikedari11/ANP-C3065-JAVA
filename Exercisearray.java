import java.util.ArrayList;

public class Exercisearray {

    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> array =new ArrayList<Integer>();
        array.add(12);
        array.add(2);
        array.add(34);

        System.out.println(array);

        array.add(3,23);                //adding element in array
        System.out.println(array);

        array.remove(1);                       //remove element of array at index 1
        System.out.println(array);

        boolean b=array.isEmpty();                    //state that the aarray is empty=true/false
        System.out.println("array is empty "+b);

        System.out.println(array.indexOf(34));      //showing elements indexing in array
        System.out.println(array.indexOf(23));

        System.out.println(array.size());                //size of array
        array.add(45);
        array.add(65);
        array.add(60);
        System.out.println(array);
        System.out.println("Size of array " + array.size());



    }
}
