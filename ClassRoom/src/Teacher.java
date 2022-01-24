public class Teacher extends Person implements Displayable
{
    private String subject;


    public Teacher (String firstName, String lastName, String subject)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    //Displays all teacher information
    @Override
    public String display()
    {

        String teacher = getFullName()+" teaches " + getSubject() + "\n";
        return teacher;

    }

    //gets teacher's subject
    public String getSubject()
    {
        return subject;
    }

    //sets teacher's subject
    public void setSubject(String subject)
    {
        this.subject = subject;
    }

}
