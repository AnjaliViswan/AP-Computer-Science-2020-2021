/**
   The sort method of this class sorts an array, using the selection 
   sort algorithm.
*/
public class SelectionSorter
{
   /**
      Sorts an array, using selection sort.
      @param a the array to sort
   */
   public static void sort(int[] a)
   {  
      for (int i = a.length - 1; i >= 0; i--)
      {  
         int minPos = minimumPosition(a, i);
         ArrayUtil.swap(a, minPos, i);
      }
   }

   /**
      Finds the smallest element in a tail range of the array.
      @param a the array to sort
      @param from the first position in a to compare
      @return the position of the smallest element in the
      range a[from] . . . a[a.length - 1]
   */
   private static int minimumPosition(int[] a, int from)
   {  
      int minPos = from;
      for (int i = from; i >= 0; i--)
      {
         if (a[i] < a[minPos]) { minPos = i; }
      }
      return minPos;
   }
}
