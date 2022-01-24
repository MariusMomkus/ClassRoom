public class Student extends Person implements Displayable
{

    private int studentId;
    private int finalGrade;



    public Student (String firstName, String lastName, int studentId, int finalGrade)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.finalGrade = finalGrade;
    }

    //Displays all student information
    @Override
    public String display()
    {

        String student = "Student ID: " + getStudentId() + "  " + getFullName() + " Final Grade: " + getFinalGrade() + "%";
        return student;

    }

    //gets student id
    public int getStudentId()
    {
        return studentId;
    }

    //set student id
    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    //get final grade
    public int getFinalGrade()
    {
        return finalGrade;
    }

    //set final grade
    public void setFinalGrade (int finalGrade)
    {
        this.finalGrade = finalGrade;
    }

}
