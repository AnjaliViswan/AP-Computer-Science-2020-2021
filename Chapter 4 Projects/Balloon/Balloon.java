
public class Balloon
{
  public Balloon()
  {
      
  }
        private double air = 0;
        private double volume = 0;
        private double surfArea = 0;
        private double radius = 0;
  public void addAir(int add)
  {
      air = (air + add);
  }
  public double getVolume()
  {
      
      
      //find radius
      double test = ((3*air) * (4*Math.PI));
      radius = (Math.cbrt(test));
      
      //calculate and return volume
      volume = ((4/3)*(Math.PI)*(Math.pow(radius,3)));
      
      System.out.println("Volume: " + volume);
      return volume;
  }
  public double getSurfaceArea()
  {
      
      
      //Calculate radius
      double test = ((3*air) * (4*Math.PI));
      radius = (Math.cbrt(test));
      
      //Calculate Surface Area and return value
      surfArea = Math.pow((4*Math.PI), 2);
      
      System.out.println("Surface Area: " + surfArea);
      return surfArea;
  }  
  public double getRadius()
  {
      
      //Calulate radius & return value
      double test = ((3*air) * (4*Math.PI));
      radius = (Math.cbrt(test));
      
      System.out.println("Radius: " + radius);
      return radius;
  }
}
