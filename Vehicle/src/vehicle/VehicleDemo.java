
package vehicle;

public class VehicleDemo {
   static int range; /* Static Variables 
                                        - outside of method, constructor or block.
                                        - Single Copy    
   */
    
    /* you have to make this method static. 
            so, that values can be passed between static main & static calcRange methods
                    So, your variables also should be static. that is why static int range;
    */
    public static int calcRange(int fCap, int milesPerGallon){ // method to do calculation for range
        range = fCap * milesPerGallon;
        
        return range;
    }
    
    /*How do we pass an object to a method?
        
    
    */
    public static void displayRange(){
        
      System.out.println("Minivan can carry: " + minivan.passengers + " " + "with the Range of " + range + " miles per Gallon");  
    }
    
    //one of your classes must have a main method.
    //what is the syntax of a main method?
    /*static means there is only one copy of this method. 
                   this will prevent people from making multiple copies of this method */
        public static void main(String[] args){
             // it is best practise to keep your variables at the top of your method. 
            
            //create an object of a vehicle class
            Vehicle minivan = new Vehicle();
            Vehicle sportscar = new Vehicle();
            
            
            minivan.passengers = 7;
            minivan.fuelCap = 16; // 16 gallons Capacity
            minivan.mpg = 21; // 21 mile per gallon
           calcRange (minivan.fuelCap, minivan.mpg);
            
            sportscar.passengers = 2;
            sportscar.fuelCap = 14;
            sportscar.mpg = 12;
           calcRange (sportscar.fuelCap, sportscar.mpg); 
            
            

        }
}
