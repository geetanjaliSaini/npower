// our Controller
package vehicle2;

public class Truck extends Vehicle2{
    //constructor actually physically build
    private int cargocap;
    
    Truck(int p, int f, int m){ //these were created in the constructor of the super class
    
        super (p,f,m); // using keyword super will allow to inherit them from super class.
        
    }
    
}
