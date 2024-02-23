package SchoolManagement;
//this class is for student keeping track of studdent fees and it paid fees
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feespaid;
    private int feesTotal;



    /**
     * fess for every srtudent is $30000
     * intially it is 0
     * @param id id for the student :unique
     * @param name of the student
     * @param grade of the student
     */
    public Student(int id, String name, int grade) {
        feespaid=0;
        feesTotal=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }
//    not going to alter student name and id

    /**
     *
     * @param grade new grade of the student
     */
    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     * The school is going to receive the funds
     * the fees to the fees paid
     * keep adding the fees to the fees paid
     * @param fees is the student pays
     */
    public void Payfees (int fees) {
        feespaid += fees;
        School.updateTotalMoneyEarned(feespaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeespaid() {
        return feespaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
    public int getremainingfees(){
        return feesTotal-feespaid;
    }



}
