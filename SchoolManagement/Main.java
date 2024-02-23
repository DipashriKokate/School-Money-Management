package SchoolManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy=new Teacher(1,"Lizzy",500);
        Teacher john=new Teacher(2,"john",600);
        Teacher Sam=new Teacher(3,"Sam",800);
        Teacher Helly=new Teacher(4,"Helly",700);
        List<Teacher> teacherList=new ArrayList<>();

        teacherList.add(lizzy);
        teacherList.add(john);
        teacherList.add(Sam);
        teacherList.add(Helly);

        Student rey=new Student(1,"rey",3);
        Student pama=new Student(2,"pam",4);
        Student dipa=new Student(3,"dipa",5);
        Student bob=new Student(4,"bob",4);

        List<Student> studentList=new ArrayList<>();
        studentList.add(rey);
        studentList.add(pama);
        studentList.add(dipa);
        studentList.add(bob);


        School ghs=new School(teacherList,studentList);
        rey.Payfees(3000);
        System.out.println("School has earned: "+ghs.getTotalMoneyEarned());
        bob.Payfees(6000);
        System.out.println("School has earned: "+ghs.getTotalMoneyEarned());
//        lizzy.setSalary(300);
        System.out.println(lizzy.getSalary());
    }


}
