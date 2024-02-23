package SchoolManagement;

/**
 * this class is keeping the record of teacher
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;

    /**
     *
     * @param id of the teacher
     * @param name of the teacher
     * @param salary of the teacher
     */
    public Teacher(int id, String name,int salary) {
        this.id = id;
        this.name = name;
        this.salary=salary;
    }

    /**
     *
     * @return id,name,salary
     * of the teacher
     */

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
/*
    set the salary
 */
    public void setSalary(int salary) {
        this.salary = salary;
    }


    public int reciveSalary(int salary) {
        return salary+=salary;

    }
}