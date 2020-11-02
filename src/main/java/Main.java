import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
           HashMap<String, String> personMap = new HashMap<String, String>();
        personMap.put("Jayde" ,"Barnard" );
         personMap.put("Kailum", "Sinclair ");
         personMap.put("Carwyn", "Singleton" );
         personMap.put("Tanya","Ratcliffe" );
         personMap.put("Dimitri", "Ahmed" );
        personMap.put("Susan", "Battle" );
        personMap.put("Alyx" ,"Riddle" );
        personMap.put("Zunairah" ,"Moon" );
        personMap.put("Primrose" ,"Hume" );

        ArrayList<Student> students = new ArrayList<Student>();
        Student student1 = new Student("Dimitri" , 2);
        Student student2 = new Student("Tanya" , 4);
        Student student3 = new Student("Alyx" , 1);
        Student student4 = new Student("Jayde" , 5);
        Student student5 = new Student("Zunairah" , 3);


        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Iterator<Student> it = students.iterator();


        System.out.printf("Students: ");
            while ( it.hasNext() ){
                System.out.println(it.next().name);

            }
        while ( it.hasNext() ){
            System.out.println(it.next().course);

        }


        Student.printStudents(  students , 3);





        // Get the iterator
        ArrayList<Bird> birds = new ArrayList<Bird>();

       Eagle eagle = new Eagle();

        birds.add(eagle);
       Swallow swallow = new Swallow();

        birds.add(swallow);
       Penguin penguin = new Penguin();

        birds.add(penguin);
       Chicken chiken = new Chicken();

        Iterator<Bird> its = birds.iterator();


        System.out.printf("Do they fly?: ");
        while ( its.hasNext() ){
             its.next().fly();

        }
    }
}
