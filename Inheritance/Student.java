
public class Student extends Person
{
        public Student(String inName, int inYearOfBirth, String major1)
    {
        
            super(inName, inYearOfBirth);
            major = major1;
        
    }
    // instance variables - replace the example below with your own
    private String major;
    private String student;

    public String toString()
{
        return super.toString() +  "The student is" + student;
}

public void setMajor(String major1)
{
        major = major1;
}
public String getMajor()
{
        return major;
}
    
}
