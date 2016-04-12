/**
 * Display a student roster with a set list of students.
 * 
 * @author Alissa Rogers
 * @version March 12, 2015
 */
import java.util.ArrayList;

public class StudentRoster
{
    private ArrayList<Student> roster = new ArrayList<Student>();
   
    /**
     * Return an ArrayList of all students in roster
     * 
     * @return ArrayList of all students
     * 
     */
    public ArrayList<Student> getRoster()
    {
        return roster;
    }
    
    /**
     * Add student to roster
     * 
     * @param studentID Student's ID
     * @param firstName Student's first name
     * @param lastName Student's last name
     * @param email Student's email address
     * @param age Student's age
     * @param grade1 First grade
     * @param grade2 Second grade
     * @param grade3 Third grade
     */
    public void add(int studentID, String firstName, String lastName, String email, int age, int grade1, int grade2, int grade3)
    {
        Student student = new Student(studentID, firstName, lastName, email, age, grade1, grade2, grade3);
        roster.add(student);
    }

    /**
     * Remove student from roster
     * 
     * @param studentID Student id of student to remove
     */
    public void remove(int studentID)
    {
        // Assume we can't find the student
        boolean found = false;
        for (int i=0; i<roster.size(); i++)
        {
            Student student = roster.get(i);
            // Match the current student's ID with our paramater ID
            if (student.getStudentID() == studentID)
            {
                // We found it, now let's remove it and tell the user 
                found = true;
                roster.remove(i);
                System.out.println("Student ID " + studentID + " has been successfully removed.");
            }
        }
        
        // Didn't find it, so let's print an error
        if (!found)
        {
            System.out.println("Error: Student ID " + studentID + " not found.");
        }
    }

    /**
     * Print roster
     * 
     */
    public void print_all()
    {
        for (Student student : roster)
        {
            student.print("studentID");
            System.out.print("\tFirst Name: ");
            student.print("firstName");
            System.out.print("\tLast Name: ");
            student.print("lastName");
            System.out.print("\tAge: ");
            student.print("age");
            System.out.print("\tGrades: ");
            student.print("grades");
            System.out.print("\n");
        }
    }

    /**
     * Print the average of the student's grades
     * 
     * @param studentID Student id of student 
     */
    public void print_average_grade(int studentID)
    {
        for (Student student : roster)
        {
            if (student.getStudentID() == studentID)
            {
                int[] grades = student.getGrades();
                int average = (grades[0] + grades[1] + grades[2]) / 3;
                System.out.print(average);
                return;
            }
        }
    }

    /**
     * Print invalid email addresses from the roster
     * 
     */
    public void print_invalid_emails()
    {
        for (Student student : roster)
        {
            String email = student.getEmail();
            // A valid email address has an @, a ., and no spaces
            // Let's assume we have an invalid address to start with
            boolean atFound = false;
            boolean dotFound = false;
            boolean spaceFound = true;
            
            // If @ has an index value, the email address has an @ sign
            if (email.indexOf("@") > -1)
            {
                atFound = true;
            }
            
            // If . has an index value, the email address has a .
            if (email.indexOf(".") > -1)
            {
                dotFound = true;
            }
            
            // If " " has no index value, the email address has no spaces
            if (email.indexOf(" ") == -1)
            {
                spaceFound = false;
            }
            
            // If any of the test conditions didn't change from their initial values, the address is invalid
            // so let's tell the user that
            if (!atFound || !dotFound || spaceFound)
            {
                System.out.println("Invalid email address found for student ID " + student.getStudentID() + ": " + email);
            }
        }
    }
}
