
public class Employee
{
   public static void main(String[] args)
   {
       
       Employee harry = new Employee();
       harry.Employee("Hacker, Harry", 50000);
       harry.raiseSalary(10); // Herry gets a 10 % raise.
       
       //put stuff here ^,__,^
        
   }
   private String employeeName;
   private double currentSalary;
   public void Employee( String employeeName, int currentSalary)
   {
       employeeName = employeeName;
       currentSalary = currentSalary;

   }
   public String getName()
   {
       return employeeName;
       
   }
   public double getSalary()
   {
       return currentSalary;
       
   }
   public void raiseSalary(double percent)
   {
       currentSalary = (currentSalary * percent)/100;
       
   }
}
