package Shashwat;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonMain {
    public static void main(String[] args) { //Main class
        Teacher t = new Teacher("Shashwat Sharma","Bhilai");
        System.out.println();
        t.show(); //Displaying name
        ArrayList<String> courses= new ArrayList<String>(); //ArrayList courses
        courses.add("Maths");
        courses.add("Physics");
        courses.add("Chemistry");
        courses.add("Calculus");
        courses.add("Trigonometry");

        Iterator i1= courses.iterator();

        if(courses.size()<=5) {
            System.out.print("Teacher subjects =");
            while (i1.hasNext()) {
                System.out.print(i1.next()+" ");
            }
        }
        else {
            System.out.println("Teacher course limit exceeded");
        }
        System.out.println();
        System.out.println();


        Student s = new Student("Anuj Tiwari","Korba");
        s.show(); //Displaying name
        ArrayList<String> courses1= new ArrayList<String>();//ArrayList courses1
        courses1.add("Maths");
        courses1.add("Physics");
        courses1.add("Chemistry");
        courses1.add("Calculus");
        courses1.add("Optics");

        courses1.remove("Chemistry"); //removing Chemistry subject

        ArrayList<Integer> grades= new ArrayList<Integer>();//ArrayList grades
        grades.add(8);
        grades.add(9);
        grades.add(8);
        grades.add(9);
        grades.add(8);


        Iterator i2= courses1.iterator();
        Iterator i3= grades.iterator();


        if(courses1.size()<=6) {
            System.out.println("Student courses and grades: ");
            while(i2.hasNext()){
                System.out.println(i2.next()+" = "+i3.next());
            }
        }
        else
            System.out.println("Student course limit exceeded");

        int gSum=0;
        for(int i=0;i< grades.size();i++){
            gSum=gSum+grades.get(i); //calling avg method
        }

        System.out.println("Average grade = "+s.average(gSum, grades.size()));
    }

}
