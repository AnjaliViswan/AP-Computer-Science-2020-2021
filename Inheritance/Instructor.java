public class Instructor extends Person
{
    public Instructor(String inName, int inYearOfBirth, int salary1)
{
         super(inName, inYearOfBirth);
         salary = salary1;
}

    private int salary;
    
    public void setSalary(int salary1)
{
       salary = salary1;
}
public int getSalary()
{
      return salary;
}
public String toString()
{
        return super.toString() +  "Their salary is" + salary;
}

}
