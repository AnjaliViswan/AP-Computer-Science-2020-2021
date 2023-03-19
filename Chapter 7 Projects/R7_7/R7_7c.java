
public class R7_7c
{
    public R7_7c(int arr[])
    {
        int counter = 0;
        for(int read : arr)
        {
            if( arr[read] < 0)
            {
                counter++;
            }
        }
        System.out.println("The number of negative numbers is: " + counter);
    }
}
