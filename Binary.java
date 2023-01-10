/*
 take 2 ints, add them together, and return the binary format
 */
public class Binary {
    
    Binary(){
        System.out.println(binaryAddition(5,9));
    }
    
    public static String binaryAddition(int a, int b){
        
        String s = "";
        
        int total = a + b;
        
        s ="( "+a + " + " +  b + " = "+ total + " in decimal or " + Integer.toBinaryString(total) + " in binary)";
        
        return s;
    }
}
