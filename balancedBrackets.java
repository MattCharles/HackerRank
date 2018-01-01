import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String expression) {
        Deque<Character> stack = new ArrayDeque<Character>();
        char c, b;
        int i;
        for(i=0; i<expression.length(); i++){
            c=expression.charAt(i);
            if(c=='{' || c=='[' || c=='('){
                stack.push(c);
            } else {
                if(stack.peek()==null) return false;
                b = stack.pop();
                if(!helperEquals(b, c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    public static boolean helperEquals(char a, char b){
        if(a=='(' && b==')' ||
           a=='[' && b==']' ||
           a=='{' && b=='}'){
            return true;
        } else {
            return false;
        }
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}

