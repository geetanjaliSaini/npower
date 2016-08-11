
package prjarrays;

public class ArraysTest {

    
    public static void main(String[] args) {
        
        int aryNum[] = new int[6];
        aryNum[0]=100;
        aryNum[1]=201;
        aryNum[2]=345;
        aryNum[3]=541;
        aryNum[4]= 982;
        aryNum[5]=842;
        
        System.out.println(aryNum[2]);
        
        int[] lottery_numbers = new int[49];
        int i;
        for(i=0; i < lottery_numbers.length; i++){
            lottery_numbers[i] = i + 1;
            System.out.println(lottery_numbers[i]);
        }
    }
    
}
