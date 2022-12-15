
import javafx.scene.text.Text;


    public class Exam15Dec_Exercise1 {
        //member variables for student class
        int studentId;
        Text studentName;
        String qualification;

        //member variables for course class
        int courseId;
        Text courseName;
        double coursePrice;

//student class
    public void Student(int sId,Text sName,String qualification){
        studentId= sId;
        studentName= sName;
        qualification= "qualification";
    }   
     //setter method

        public void setStudentId(int sId){
            this.studentId=sId;
        }
        public void  setStudentName( Text sName){
            this.studentName=sName;
        }
        public void setQualification(String qualification){
            this. qualification=qualification;
        }

    //getter method

        public int getStudentId(){
            return studentId;
        }   
        public Text getStudentName(){
            return studentName;
        }  
        public String getQualification(){
            return qualification; 
        }
        @Override
    //toString method
        public String toString(){
            return"Student[studentId="+studentId+",studentName="+studentName+",qualification="+qualification+"]";
        }
    //equials method
    public boolean equals(){
        if(this==sId){
            return true;
        }
    //hashcode
    
    public int hashCode() {
        return this.sId;
    }    
    }


//course class

        public void Course(int cId,Text cName,double cPrice){
            courseId= cId;
            courseName= cName;
            coursePrice=cPrice;
        }   
         //setter method
    
            public void setCourseId(int cId){
                this.courseId=cId;
            }
            public void  setCourseName( Text cName){
                this.courseName=cName;
            }
            public void setCoursePrice(double cPrice){
                this. coursePrice=cPrice;
            }
    
        //getter method
    
            public int getCourseId(){
                return courseId;
            }   
            public Text getCourseName(){
                return courseName;
            }  
            public double getCoursePrice(){
                return coursePrice; 
            }
            
            @Override
        //toString method
            public String toString(){
                return"Course[courseId="+courseId+",courseName="+courseName+",coursePrice="+coursePrice+"]";
            }
        public static void main(String[] args) {
            //object creating


             Exam15Dec_Exercise1 E1=new Exam15Dec_Exercise1() ;
             E1
             System.out.println(E1);

        }
    
}


