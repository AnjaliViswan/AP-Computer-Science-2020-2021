

public class Person
{
    // instance variables - replace the example below with your own
    private String name;
    private int birthYear;

    public Person(String inName, int inYearOfBirth)
    {
        name = inName;
        birthYear = inYearOfBirth;
    }
    
   // public Person()//optional default constructor
   // {
   //     name = "";
   //     birthYear = inYearOfBirth;
   // }
    
    public void setName(String name1)
    {
        name = name1;
    }

    public void setYearOfBirth(int birthYear1)
    {
       birthYear = birthYear1;
    }

    public String getName()
    {
        return name;
    }

    public int getYearOfBirth()
    {
        return birthYear;
    }
    public String toString()
    {
        return "The name is " + name;
    }
}
