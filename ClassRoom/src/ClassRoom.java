import java.util.ArrayList;

public class ClassRoom extends Person implements Displayable
{
    private int roomNumber;
    Displayable teacher;
    ArrayList<Displayable> students;

    ClassRoom()
    {
        students = new ArrayList<Displayable>();
    }

    ClassRoom(int room, Displayable teacher, ArrayList<Displayable> list)
    {
        roomNumber = room;
        this.teacher = teacher;
        this.students = list;

    }

    //Displays the room number, teacher information, and all students in the classroom
    @Override
    public String display()
    {
        String roomAndTeacher = "Room Number: " + roomNumber + " \n" + teacher.display();

        StringBuilder studentList = new StringBuilder();
        for (Displayable studentName : students)
        {
            studentList.append(studentName.display() + "\n");
        }

        return roomAndTeacher + studentList.toString();

    }

}