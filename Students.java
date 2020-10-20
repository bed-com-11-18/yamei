//import java.util.Scanner;
public class Students{
    private String name;
    private double[] grades;
    private int numberOfStudents;
    Students(){
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setGrades(double [] grades){
        this.grades = grades;
    }
       public double getGrades(){
           return grades[0];
       }
       public double getGrades1(){
           return grades[1];
       }
       public double getGrades2(){
           return grades[2];
       }
       
      public double getAverageGrades(){
        double average = (grades[0] +grades[1] +grades[2])/3;
        return average;
        }
       public int getNumberOfStudents(){
         return numberOfStudents++;
        }
       public String getStudentDetails(){
         return "\tYOUR NAME IS  : "  + this.name +  "\n\tFIRST GRADE  : " + grades[0]  + " \n\tSECOND GRADE  : " + grades[1]  + " \n\tTHIRD GRADE  : " + grades[2]  + "\n\t THE AVERAGE OF THE GRADES IS : " + getAverageGrades()  + " \n\tSTUDENT NUMBER  : " + getNumberOfStudents();
        }
     }