package stack.BalancedParentheses;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "([{}])";
        //String str = ")([{}])";
        if(isValid(str) == true){
            System.out.println("Balanced or Valid Parentheses");
        }
        else{
            System.out.println("Parentheses are not balanced");
        }
    }

    // function to check if opening and closing brackets are same to pop
    public static boolean isMatching(char a, char b){
        return (( (a=='(') && (b==')'))||( (a=='[') && (b==']') )||( (a=='{') && (b=='}') ));
    }

    public static boolean isValid(String str) {
        Deque<Character> s = new ArrayDeque<>();

        //Traverse in string

        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == '(' || x == '{' || x == '[') {
                s.push(x);
            } else {
                // check if list is empty or contains a closing bracket
                if (s.isEmpty()) {
                    return false;
                } else if (!isMatching(s.peek(), x)) {
                    return false;
                } else {
                    s.pop();
                }
            }
        }
        return (s.isEmpty()); // checks if at the end stack is empty or not eg: "((())"
    }
}
