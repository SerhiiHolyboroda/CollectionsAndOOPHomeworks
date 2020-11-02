import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    String name;        // ім'я
    int course;            // курс
    public Student(String name , int course) {
    this.name = name;
   this.course = course;
    }
    static void printStudents (ArrayList<Student> students , Integer course){
        Iterator<Student> it = students.iterator();


      if( it.next().course == course ){
        System.out.printf(it.next().name);
    }
        if( it.next().course == course ){
            System.out.println(it.next().course);
        }

    }
    void compareStudents(String name1 , String name2){
        if(name1 == name2){
            System.out.println("Same student");
        } else {
            System.out.println("Different student");
        }
    }
    void compareStudents(Integer course1, Integer course2){
      if(course1 == course2){
          System.out.println("Same student");
      } else {
          System.out.println("Different student");
      }
    }
}
