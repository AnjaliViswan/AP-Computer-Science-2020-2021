
public class ReplaceTester
{
   public static void main(String[] args)
   {
       //WORDING
       String word = "Mississippi";
       System.out.println(word);
       //REPLACEMENT
       String newWord = word.replace("i", "!");
       String finalWord = newWord.replace("s", "$");
       //PRINTING...
       System.out.println(finalWord);
       
   }
}
