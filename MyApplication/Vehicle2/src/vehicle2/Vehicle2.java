//Model
package vehicle2;

public class Vehicle2 {
         
    private int passenger;
    private int fuelCap;
    private int mpg;

Vehicle2 (int p, int f, int m){
    passenger = p;
    fuelCap = f;
    mpg = m;   
}
  int range (){
      return fuelCap * mpg;
  }
  
  double fuelNeeded(int miles){
      /* double) is used to cast or convert an int to a
      floating point (decimal) value to be more exact.
      */
      return (double) miles/mpg;
  }
  // Accessor methid for instance variables
  int getPassengers () { return passenger;}
  void setPassengers(int p) { passenger = p;}
  int getFuelCap(){ return fuelCap;}
  void setFuelCap(int f){  fuelCap = f;}
  int getMpg(){return mpg;}
  void setMpg(int m) {mpg = m;}
}
