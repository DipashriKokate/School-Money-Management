package SchoolManagement;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> student;
    private static int totalMoneyEarned;
    private  static int totalMoneySpend;

    /**
     * new school object is created
     * @param teachers list of teachers
     * @param student list of students
     */
    public School(List<Teacher> teachers, List<Student> student) {
        this.teachers = teachers;
        this.student = student;
        totalMoneyEarned=0;
        totalMoneySpend=0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudent() {
        return student;
    }

    public void addStudent(Student students) {
        student.add(students);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
       totalMoneyEarned+=MoneyEarned;
    }

    public int getTotalMoneySpend() {
        return totalMoneySpend;
    }

    /**
     * money spend by school
     * @param MoneySpend teachers salary
     */
    public void updateTotalMoneySpend(int MoneySpend) {
        totalMoneyEarned=totalMoneyEarned- MoneySpend;
    }
}
