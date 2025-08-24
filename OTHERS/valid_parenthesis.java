/* 
package OTHERS;

import java.util.Stack;

public class valid_parenthesis {
   public boolean isValid(String s){
    Stack<Character> stack = new Stack<>();

    // s = "()"
    //       c

    // stack = ()

    for(char c : s.toCharArray()){
        if(c == '('){
            stack.push(')');
        }
        else if( c == '[')
        {
            stack.push(']');
        }
        else if( c == '{'){
            stack.push('}');
        }
        else if( stack.isEmpty() || stack.pop() != c ){  // case where we get a closing bracket
            return false;
        }
    }
    return stack.isEmpty();

    // T.c : O(n) -> n is the length of the string
    // s.c : O(n) 
   }
}
*/

package OTHERS;

import java.util.Scanner;
import java.util.Stack;

public class valid_parenthesis {
   public boolean isValid(String s){
    Stack<Character> stack = new Stack<>();

    for(char c : s.toCharArray()){
        if(c == '('){
            stack.push(')');
        }
        else if( c == '['){
            stack.push(']');
        }
        else if( c == '{'){
            stack.push('}');
        }
        else if( stack.isEmpty() || stack.pop() != c ){
            return false;
        }
    }
    return stack.isEmpty();
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       valid_parenthesis vp = new valid_parenthesis();

       System.out.println("Enter a string containing brackets ( (), {}, [] ): ");
       String input = sc.nextLine();

       if (vp.isValid(input)) {
           System.out.println("✅ The string is VALID!");
       } else {
           System.out.println("❌ The string is NOT VALID!");
       }

       sc.close();
   }
}


/*  // main function to test
   public static void main(String[] args) {
       valid_parenthesis vp = new valid_parenthesis();

       String test1 = "()";
       String test2 = "({[]})";
       String test3 = "(]";
       String test4 = "([)]";
       String test5 = "{[]}";

       System.out.println(test1 + " -> " + vp.isValid(test1)); // true
       System.out.println(test2 + " -> " + vp.isValid(test2)); // true
       System.out.println(test3 + " -> " + vp.isValid(test3)); // false
       System.out.println(test4 + " -> " + vp.isValid(test4)); // false
       System.out.println(test5 + " -> " + vp.isValid(test5)); // true
   } */