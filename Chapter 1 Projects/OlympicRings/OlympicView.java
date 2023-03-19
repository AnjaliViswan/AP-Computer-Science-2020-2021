import javax.swing.JFrame;

public class OlympicRings
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(150, 250);
      frame.setTitle("An Alien Face");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      OlympicRings component = new OlympicRings();
      frame.add(component);

      frame.setVisible(true);
   }
}

