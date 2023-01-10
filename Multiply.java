
/*
 find the multiples 3 or 5 of a given number, and then add those numbers
*/
import java.util.*;

public class Multiply {
    
    
    
    Multiply(){
       int y = solution(20);
       System.out.println(y);
    }
    
    public int solution(int number){
        int x = 0;
        if(number < 0){
            System.out.println("negative number");
            return x;
        }
        else{
        int zenumber = number;
        ArrayList<Integer> bucket = new ArrayList<Integer>();
        
        int mult3 = 3;
        int mult5 = 5;
        int[] mults3 =new int[number];
        int[] mults5 = new int[number];
        
        for(int i = 0; i < zenumber; i++){
            System.out.println("the number: " + i);
            if( (i % mult3 == 0) && (i % mult5 == 0)){
                System.out.println("Number is common to both: " + i);
                bucket.add(i);
            }else
            if( (i % mult3 == 0) || (i % mult5 == 0) ){
                System.out.println("multiple of 3, adding " + i);
                //mults3[i] = i;
                bucket.add(i);
            }
        
            
        }
      
        
        System.out.println("checking...");
        System.out.println(bucket);
        
        int total = 0;
        for(int i = 0; i < bucket.size(); i++){
            total = bucket.get(i) + total;
        }
        
        System.out.println("Total: " + total);
        x = total;
        }
        
        
        return x;
    }
    
    
    public static Double multiply(Double a, Double b) {
        return a * b;
    }
    
    public static void main(String[] args){
        new Multiply();
    }
}
