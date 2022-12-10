import java.util.Collection;
import java.util.LinkedList;
import java.util.Objects;

public class Person implements Comparable<Person>{
    private int personId;
    private String personName;
    private int age;
    public Person(){
        super();
    }
    public Person(int personId,String personName,int age){
        super();
        this.personId=personId;
        this.personName=personName;
        this.age=age;
    }
    public int getPersonId(){

    }



        //overide
    public int hashCode(){
        return Objects.hash(age,personId,personName);
        }
        //overide
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(getClass()!=obj.getClass())
            return false;
        Person other=(Person)obj;
        return age==other.age && personId ==other.personId && Object.equals(personName.other.personName);
    }
        //overide
    public String toString(){
        return "Person [personId="+personId+",personName="+personName+",personAge="+age+"]"
    }
    public int compareTo(Person person){
        if(this.age==person.age)
            return 0;
        else
            return this.age>person.age?1:-1;
    }
    class PersonComparatorByName implements Comparator<Person>{     //compareble=      nd comparator =util package
        public int compare(Person p1,person p2){
            int flag=0;
            flag=p1.getPersonName().compareTo(p2.getPersonName)
        }
        public class ComparableDemo{
            public static void main(String[] args) {
                
            }
        }
    
    }
}