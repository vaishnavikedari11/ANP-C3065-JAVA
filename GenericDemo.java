class Square{
    public String tiString(){
        return "I am a square";
    }
}
class Rectangle{
    public String tiString(){
        return "I am a rectangle";
    }
}
class Circle{
    public String tiString(){
        return "I am a circle";
    }
}
class Shape{
    Object o;
    void setShapeObject(Object obj){
        o=obj;
    }
    Object getShapeObject(){
        Object o=null;
        return o;
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle();
        Square square1 =new Square();
        Shape obj1=new Shape();
        obj1.setShapeObject(rectangle1);

        Object object=obj1.getShapeObject();
        Rectangle rectangle2=(Rectangle)object;

        System.out.println(rectangle2);
        obj1.setShapeObject(square1);
        Object onject2=obj1.getShapeObject();
       // Square square2=(Square)object2;
        Rectangle rectangle3=(Rectangle)object;
        System.out.println(rectangle3);
        //System.out.println(square2);
        Square s1=new Square();



    }
}
