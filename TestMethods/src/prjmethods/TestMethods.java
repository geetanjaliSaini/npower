
package prjmethods;

public class TestMethods {

 
    public static void main(String[] args) {
       
        MyMethods test1 = new MyMethods();
        
        int aVal = test1.total();
        
        System.out.println("Method result =" + aVal);
        
        test1.print_text() ;
    }
    
}
