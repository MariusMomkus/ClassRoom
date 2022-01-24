import java.util.ArrayList;
import java.util.Scanner;
public class PrintReports {

    Scanner input = new Scanner(System.in);

    protected char answer;
    ArrayList <Displayable> listClassrooms = new ArrayList<Displayable>();

    //constructor to get all the information for the report and print
    public PrintReports()
    {
        do {
            System.out.println("Creating classroom...");
            Displayable classroom1 = enterClassroom();
            listClassrooms.add(classroom1);
            System.out.println("Classroom successfully created!");
            System.out.println("Do you wish to create another classroom? (Y or N): ");
            answer = input.next().toUpperCase().charAt(0);

        } while (answer == 'Y');

        System.out.println("All classroom successfully created!\n");
        report(listClassrooms);



    }

    //returns a classroom object that has all the information for a classroom
    public Displayable enterClassroom()

    {
        ArrayList <Displayable> listStudents = new ArrayList<Displayable>();
        int roomNumber = 0;

        //gets room number
        while (roomNumber < 100)
        {
            System.out.print("Please enter room number (must be 100 or greater): ");
            roomNumber = input.nextInt(); input.nextLine();
        }

        //gets teacher
        System.out.println("\nNow you need to enter a teacher for the classroom.");
        Displayable newTeacher = enterTeacher();
        System.out.println();

        //Loop to get students
        do
        {
            Displayable student1 = enterStudents();
            listStudents.add(student1);
            System.out.println("Do you wish to add another student? (Y or N): ");
            answer = input.next().toUpperCase().charAt(0);
        } while (answer == 'Y');

        return new ClassRoom(roomNumber, newTeacher, listStudents);


    }

    //returns an object that is the type Displayable of the Teacher class
    public Displayable enterTeacher()
    {
        System.out.print("Please enter the first name of the teacher: ");
        String first = input.nextLine();
        System.out.print("Please enter the last name of the teacher : ");
        String last = input.nextLine();
        System.out.print("Please enter the subject of the teacher   : ");
        String subject = input.nextLine();
        return new Teacher(first, last, subject);


    }

    //returns an object that is the Displayable type of the Student class
    public Displayable enterStudents()
    {
        int studentId = 0;
        int finalGrade = -1;

        System.out.println("Please enter first and last name of student: ");

        input.hasNextLine();
        String firstName = input.next();
        String lastName = input.next();

        //gets student id
        do {
            System.out.println("Please enter student's id: ");
            studentId = input.nextInt();
        }while(studentId<=0);

        //gets student grade
        do {
            System.out.println("Please enter student's final grade (%): ");
            finalGrade = input.nextInt();
        }while(finalGrade<0 || finalGrade>100);


        return new Student(firstName, lastName, studentId, finalGrade);

    }

    //Prints out all classrooms
    void report (ArrayList<Displayable> list)
    {
        //loop for scanning through ArrayList and printing
        for (Displayable classroom : list)
        {
            System.out.println(classroom.display());
        }
    }
}
