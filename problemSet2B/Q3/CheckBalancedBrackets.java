
import CustomStack;
import StackImpl;

import problemSet2B.Q2.CustomStack;

public class CheckBalancedBrackets {

    public static void main(String[] args) {

        System.out.println(isOpenBracket('('));
        System.out.println( isOpenBracket('a'));
        System.out.println(isCloseBracket(']'));
        System.out.println(isCloseBracket('a'));
        System.out.println( isMatchBracket('(',')'));
        System.out.println( isMatchBracket('a','a'));
        System.out.println(isBalancedBrackets("()[]()"));
        System.out.println(isBalancedBrackets("([]())"));
    }

    public static boolean isBalancedBrackets( String expression ){
        CustomStack<Character> newstack= new StackImpl<Character>();
        for (int i=0;i<expression.length();i++){
            char c=expression.charAt(i);
            if (isOpenBracket(c)){
                newstack.push(c);
            } else if (isCloseBracket(c)) {
                char d= newstack.pop();
                if (!isMatchBracket(d,c)){
                    return false;
                }
            }
        }
        if (newstack.isEmpty()){
            return true;
        }
        return false;
    }

    public static boolean isOpenBracket( char c){
        String brackets = "({[";
        return brackets.contains(""+c);
    }

    public static boolean isCloseBracket(char c){
        String brackets = ")}]";
        return brackets.contains(""+c);
    }

    public static boolean isMatchBracket(char c1, char c2){
        if (c1=='('){
            return c2==')';
        }
        else if (c1=='{'){
            return c2=='}';
        }
        else if (c1=='['){
            return c2==']';
        }
        return false;
    }
}

