
public class Car
{
    public static void main(String[] args)
    {
        Car myHybrid = new Car(50); // 50 miles per gallon
        myHybrid.addGas(20); //Tank 20 gallons
        myHybrid.drive(100); // Drive 100 miles
        double gasLeft = myHybrid.getGasInTank(); // Get gas remaining in tank
        
    }
    private int currentGas;
    private int milesPerGallon;
    public Car(int milesPerGallon)
    {
        milesPerGallon = milesPerGallon;
    }
    
    public void setFuel()
    {
        currentGas = 0;
    }
    public void drive(int miles)
    {
        currentGas = (currentGas - (miles/milesPerGallon));
    }
    public void addGas(int gas)
    {
        currentGas = currentGas + gas;
    }
    public int getGasInTank()
    {
        return currentGas;
    }
}
