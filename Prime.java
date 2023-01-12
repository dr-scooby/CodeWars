/*
 * is a number a Prime number or not?
 *  Prime number is a number that is greater than 1 and divided by 1 or itself only. 
 In other words, prime numbers can't be divided by other numbers than itself or 1. 
 For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers
 Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2
 */
public class Prime {
    
    Prime(){
       
        if(isPrime(0))
            System.out.println("Prime " );
        else
            System.out.println("Not Prime");
        
        if(isPrime(-1))
            System.out.println("Prime " );
        else
            System.out.println("Not Prime");
        
        
        if(isPrime(2))
            System.out.println("Prime " );
        else
            System.out.println("Not Prime");
        
        if(isPrime(5099))
            System.out.println("Prime " );
        else
            System.out.println("Not Prime");
    }
    
  
    public static boolean isPrime(int num){      
        
        if(num<=1){
            return false;
        }
      /*
       * for better optimization:
       for (int i = 2; i*i <= number; i++) {
        if (number % i == 0) {
            return false;
        }
       */
        for(int i = 2; i <= num / 2; ++i){
            if( (num % i) == 0){
                return false;
                          
            }
        }
        
        return true;
    }
    
    public static void main(String[] args){
        new Prime();
    }
}
