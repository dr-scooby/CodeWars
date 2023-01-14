/*
Write a function that takes an array of numbers (integers for the tests) and a target number. It should find two different items in the array that, when added together, give the target value. The indices of these items should then be returned in a tuple / list (depending on your language) like so: (index1, index2).

For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.

The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers; target will always be the sum of two different items from that array).

Based on: http://oj.leetcode.com/problems/two-sum/

two_sum([1, 2, 3], 4) == {0, 2}

*/

package codewars;

import java.util.*;

public class TwoSum {
    
     ArrayList<Integer> listing;
    
    
    TwoSum(){
        int[] result = twoSum(new int[]{123,5678,9012}, 14690);
      // twoSum(new int[]{1,2,3}, 4);
        for(int i = 0 ; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
    
    public static int[] twoSum(int[] numbers, int target)
    {
       for(int i = 0; i < numbers.length; i++) {
           for(int j = i + 1; j < numbers.length; j++) {
               if(numbers[i] + numbers[j] == target){
                   return new int[]{i, j};
               }
           }
       }
      return null; 
    }
    
   
    
    public static void main(String[] args){
        new TwoSum();
    }
}
