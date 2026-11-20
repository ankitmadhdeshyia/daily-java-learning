package Practise;

import java.util.ArrayDeque;
import java.util.Deque;

public class VallidParenthese {
        static boolean isValid(String s){
            Deque<Character> stack=new  ArrayDeque<>();
            for(char c :s.toCharArray()){
                if(c=='('||c=='{'||c=='['){
                    stack.push(c);
                }else{
                    if(stack.isEmpty()) return false;
                    char top=stack.pop();
                    if(c=='(' && top!=')' ||c=='}' && top!='{' || c==']' && c=='[' ){
                        
                    }
                }
            }
        }
}
