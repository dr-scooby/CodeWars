
package codewars;
import java.util.*;
/**
 * Complete the solution so that it splits the string into pairs of two characters. 
 * If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

Examples:

* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']


 * @author J.Ismail
 */
public class StringSplit {
    
    StringSplit(){
        String s = "abcde";
       String[] results = solution(s);
       System.out.println("checking results of abc...");
       for(int i=0; i <  results.length; i++){
           System.out.println(results[i]);
        }
       
        String s2 = "LovePizza";
        
        results = solution(s2);
        System.out.println("checking results 2...");
        for(int i=0; i <  results.length; i++){
           System.out.println(results[i]);
        }
    }
    
    public static String[] solution(String s){
        
        ArrayList<String> listing = new ArrayList();
        
        System.out.println(s.length());
        char[] chars = s.toCharArray();
        int end = chars.length ;
        String pair = "";
        boolean even = false;
        int size = chars.length;
        if(size % 2 == 0){
            System.out.println("Even");
            even = true;
        }else{
            System.out.println("Odd");
            even = false;
        }
        int next = 0;
        for(int i =0 ; i < chars.length; i=i+2){
            System.out.println(i + " " + chars[i]);
            if(i == chars.length -1 && even == false){
                System.out.println("should be end..." + i + " " + chars[i]);
                pair += chars[i] + "_";
                listing.add(pair);
            }else{
                pair += chars[i];
                System.out.println("pair:: " + pair);
                next = i + 1;
                if(next == end){
                    break;
                }else{
                    System.out.println("next:: " + next);
                    pair += chars[next];
                    System.out.println("pair:: " + pair);
                    listing.add(pair);
                    next = 0;
                    pair = "";
                }
            }
            
        }
        
        //System.out.println("checking...");
        System.out.println("Listing size: " + listing.size()) ;
         String[] results = new String[listing.size()];
         int index = 0;
        Iterator it = listing.iterator();
        while(it.hasNext()){
            String apair = (String)it.next();
            //System.out.println(apair);
            results[index] = apair;
            index++;
        }
        
        
       
        
        
        return results;
    }
    
    public static void main(String[] args){
        new StringSplit();
    }
}
