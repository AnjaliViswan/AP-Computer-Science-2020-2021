
public class R7_5
{
    public R7_5(int arr[])
    {
        
        int minCount = arr[0];
        int maxCount = arr[0];
        
        for( int i = 1; i < arr.length; i++)
        {
            if(arr[i] < minCount)
            {
                minCount = arr[i];
            }
            if(arr[i] > maxCount)
            {
                maxCount = arr[i];   
            }
        }
        System.out.println("The maximum value is, " + maxCount);
        System.out.println("The minimum value is, " + minCount);
    }
}
