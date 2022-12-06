class Base{

}
class Child extends Base{

}

public class InstanaceofOperatorDemo {
public static void main(String[] args) {
    InstanaceofOperatorDemo ioodObj1=new InstanaceofOperatorDemo();
    Base base1=new Base();
    

    Child child1=new Child();
     
    boolean result1 =base1 instanceof Child;
    System.out.println(result1);

    boolean result2 =base1 instanceof Base;
    System.out.println(result2);
}


}
