public abstract class Person
{

    protected String firstName;
    protected String lastName;

    //gets first name of person
    public String getFirstName()
    {
        return firstName;
    }

    //sets first name of person
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    //gets last name of person
    public String getLastName()
    {
        return lastName;
    }

    //sets last name of person
    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    //gets full name of person
    public String getFullName()
    {
        return firstName + " " + lastName;
    }

}
