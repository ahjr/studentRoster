
/**
 * Student object.
 * 
 * @author Alissa Rogers 
 * @version March 12, 2015
 */
public class Student
{
    // instance variables
    private int studentID;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int[] grades = new int[3];

    /**
     * Constructor for objects of class Student
     */
    public Student(int studentID, String firstName, String lastName, String email, int age, int grade1, int grade2, int grade3)
    {
        // initialise instance variables
        setStudentID(studentID);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setAge(age);
        setGrades(grade1, grade2, grade3);
    }

    /**
     * Get student ID
     * 
     * @return     The student id number 
     */
    public int getStudentID ()
    {
        return this.studentID;
    }

    /**
     * Get student age
     * 
     * @return     The age of the student 
     */
    public int getAge ()
    {
        return this.age;
    }

    /**
     * Get student first name 
     * 
     * @return  The first name of the student 
     */
    public String getFirstName ()
    {
        return this.firstName;
    }

    /**
     * Get student last name 
     * 
     * @return  The last name of the student
     */
    public String getLastName ()
    {
        return this.lastName;
    }

    /**
     * Get student email address
     * 
     * @return  The student's email address 
     */
    public String getEmail ()
    {
        return this.email;
    }

    /**
     * Get student grades
     * 
     * @return  The students grades 
     */
    public int[] getGrades ()
    {
        return this.grades;
    }

    /**
     * Set student ID
     * 
     * @param  i The student ID number
     */
    public void setStudentID (int i)
    {
        this.studentID = i;
    }

    /**
     * Set student first name
     * 
     * @param  name The first name
     */
    public void setFirstName (String name)
    {
        this.firstName = name;
    }
    
    /**
     * Set student last name
     * 
     * @param  name The last name
     */
    public void setLastName (String name)
    {
        this.lastName = name;
    }
    
    /**
     * Set student age
     * 
     * @param  i The student's age 
     */
    public void setAge (int i)
    {
        this.age = i;
    }

    /**
     * Set student email
     * 
     * @param  email The email address
     */
    public void setEmail (String email)
    {
        this.email = email;
    }
    
    /**
     * Set student grades
     * 
     * @param  g1 First grade
     * @param g2 Second grade
     * @param g3 Third grade
     */
    public void setGrades (int g1, int g2, int g3)
    {
        this.grades[0] = g1;
        this.grades[1] = g2;
        this.grades[2] = g3;
    }
    
    /**
     * Print student information
     * 
     * @param parameter Parameter to print in string form
     */
    public void print (String parameter)
    {
        if (parameter.equals("studentID"))
        {
            System.out.print(getStudentID());
        }
        else if (parameter.equals("firstName"))
        {
            System.out.print(getFirstName());
        }
        else if (parameter.equals("lastName"))
        {
            System.out.print(getLastName());
        }
        else if (parameter.equals("email"))
        {
            System.out.print(getEmail());
        }
        else if (parameter.equals("age"))
        {
            System.out.print(getAge());
        }
        else if (parameter.equals("grades"))
        {
            int[] gradePrint = getGrades();
            System.out.print("{" + gradePrint[0] + ", " + gradePrint[1] + ", " + gradePrint[2] + "}");
        }
        else
        {
            System.out.println("Error: Invalid parameter - " + parameter);
        }
    }
}
