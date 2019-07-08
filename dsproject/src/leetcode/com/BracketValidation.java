package leetcode.com;

import java.util.HashMap;

public class BracketValidation {
/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.*/
	public static void main(String[] args) {
		System.out.println(isValid("([])"));

	}
public static boolean isValid(String s) {
        
        HashMap<Character,Character> bracketPairs = new HashMap<Character,Character>();
        
        bracketPairs.put(']','[');
        bracketPairs.put('}','{');
        bracketPairs.put(')','(');
        
        StringBuilder sb = new StringBuilder();
        int sbLength = 0;
        
        for(char c: s.toCharArray()){
            if(sbLength != 0 && bracketPairs.containsKey(c)){                
                    if(sb.charAt(sbLength-1) == bracketPairs.get(c)){
                        sb.deleteCharAt(sbLength-1);
                        sbLength--;
                    }else{
                        sb.append(c);
                        sbLength++;
                    }
            }else{
                 sb.append(c);
                 sbLength++;
            }            
           
        }
        if(sbLength>0)
            return false;
        return true;
    }

}
