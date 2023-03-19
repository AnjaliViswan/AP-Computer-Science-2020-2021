import java.awt.Rectangle;
public class AreaTester
{
   public static void main(String[] args)
   {
      Rectangle box = new Rectangle(5, 10, 30,15 );
      double height = box.getHeight();
      System.out.println(height);
      double width = box.getWidth();
      System.out.println(width);
      box = new Rectangle(5, 10, box.height, box.width);
      System.out.println(height * width);
   }
}

