//view
/* Display things to the Screen.
        This class will display & controls input for user to see.
         This is our View. So, we need a Main Method over here*/
package vehicle2;

public class TruckDemo
{
    public static void main(String[] args)
    {
    Truck semi = new Truck(2, 200, 44000 ); // create truck object & pass it 3 value passenger, capacity, mpg
    
    double gallons;
    int distance = 252;
    
    gallons = semi.fuelNeeded(distance);
    
    System.out.println("To go "+ distance +  "miles Semi needs" + gallons +" gallons of fuel");
    }
}