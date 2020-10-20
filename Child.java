import java.util.Scanner;
public class Child {
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   String name = input.next();
    Students n  = new Students();
    n.getNumberOfStudents();
   n.setName(name);
    System.out.println(" YOUR NAME IS : " + n.getName() );
    double [] grades = new double[3];
            for (int i = 0; i < grades.length; i++){
              System.out.println("ENTER GRADE :");
                grades[i] = input.nextDouble();                                       
            }
    n.setGrades(grades);
     System.out.println(n.getStudentDetails());
   } 
} 
