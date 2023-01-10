/*
 *
 Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
Examples

    16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2

*/
public class Sums {
    
    public Sums(){
       int d =  digits(456);
       System.out.println("d total:: " + d);
    }
    
    public int digits(int n){
        int x = 0;
        int number = n;
        int total = 0;
        System.out.println("the number:: " + number);
        String s = String.valueOf(number);
        char[] ch = s.toCharArray();
        
        for(int i =0 ; i < ch.length; i++){
            System.out.println(ch[i]);
            x += Integer.parseInt(String.valueOf(ch[i]) );
        }
        System.out.println("total: " + x);
        return x < 10 ? x : digits(x);
        
            
    }
    
    public static void main(String[] args){
        new Sums();
    }
}
