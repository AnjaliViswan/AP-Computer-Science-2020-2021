
public class mainTester
{
    public static void main (String [] args)
    {
        Person p1 = new Person("Jane Doe", 2004);
        p1.setName("Mrs. Jane Doe");
        p1.setYearOfBirth(1994);
        System.out.println("The person's name is " + p1.getName() + " and their year of birth is " + p1.getYearOfBirth());
        System.out.println(p1); //prints: The name is Mrs. Jane Doe.
    }
}
