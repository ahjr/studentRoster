/**
 * Demo program for student roster stuff.
 * 
 * @author Alissa Rogers
 * @version March 12, 2015
 */
import java.util.ArrayList;

public class StudentDemo
{
    public static void main(String[] args)
    {
        String [] studentInput = {"1,John,Smith,John1989@gmail.com,20,88,79,59",
                              "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
                              "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
                              "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
                              "5,Alissa,Rogers,studentdemo@iole.co.uk,41,97,37,54"
                             };
        StudentRoster roster = new StudentRoster();
                             
        for (int i=0; i<studentInput.length; i++)
        {
            // I'm sure there's a more elegant way to do this parsing.
            String line = studentInput[i];
            int index = 0;
            int comma = line.indexOf(",");
            int studentID = Integer.parseInt(line.substring(index,comma));
            index = comma + 1;
            comma = line.indexOf(",", index);
            String firstName = line.substring(index,comma);
            index = comma + 1;
            comma = line.indexOf(",", index);
            String lastName = line.substring(index,comma);
            index = comma + 1;
            comma = line.indexOf(",", index);
            String email = line.substring(index,comma);
            index = comma + 1;
            comma = line.indexOf(",", index);
            int age = Integer.parseInt(line.substring(index,comma));
            index = comma + 1;
            comma = line.indexOf(",", index);
            int grade1 = Integer.parseInt(line.substring(index,comma));
            index = comma + 1;
            comma = line.indexOf(",", index);
            int grade2 = Integer.parseInt(line.substring(index,comma));
            index = comma + 1;
            int grade3 = Integer.parseInt(line.substring(index));
            
            roster.add(studentID,firstName,lastName,email,age,grade1,grade2,grade3);
        }
        roster.print_all();
        
        roster.print_invalid_emails();
        
        // Print a table with students' ids and averages
        ArrayList<Student> students = roster.getRoster();
        System.out.println("ID\tAverage");
        for (Student student : students)
        {
            System.out.print(student.getStudentID() + "\t");
            roster.print_average_grade(student.getStudentID());
            System.out.print("\n");
        }
        
        roster.remove(3);
        
        roster.remove(3);
    }
}
