import java.util.*;

class Solution {

    public static List<String> fizzBuzz(int n) {
                
        List<String> output_array = new ArrayList<String>();

        for (int i = 1; i <= n ; i++) {

            if (i % 3 == 0 &&  i % 5 == 0) {
                output_array.add("FizzBuzz");
            }

            else if (i % 3 == 0) {
                output_array.add("Fizz");
            }

            else if (i % 5== 0) {
                output_array.add("Buzz");
            }      

            else {
                output_array.add(Integer.toString(i));
            }      
            
        }
        return output_array;
    }

    // Testing n = 5
    public static void main(String[] args) {
        System.out.println(fizzBuzz(5));
    }

}