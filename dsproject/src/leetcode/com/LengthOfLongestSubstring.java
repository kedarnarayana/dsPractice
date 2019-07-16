package leetcode.com;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubString1("abcabcbb"));
		
	}
	public static int lengthOfLongestSubstringforGiven(String s) {
        StringBuilder sb = new StringBuilder();
        //HashSet<String> subStrings = new HashSet<String>();
        //TreeMap<String,Integer> 
        int length = 0;
        if(s.length()==1) {
        	return 1;
        }
        for(char c : s.toCharArray()){
            if(sb.toString().contains(c+"")){
                
                if(sb.toString().length()>length){
                    length = sb.toString().length();
                }
                System.out.println(sb);
                sb.setLength(0);
            }
            sb.append(c);
        }
        System.out.println(sb);
        if(sb.length()>length) {
        	length = sb.length();
        }
       return length;        
    }
	
	public static int lengthOfLongestSubString1(String s) {
		int n = s.length();
		int length = 0;
		String str = "";
		for(int i = 0; i < n; i++) {
			for(int j=i+1; j <= n; j++) {
				System.out.println(s.substring(i, j));
				if(allUnique(s,i,j)) {
					//length = Math.max(length, j-i);
					if((j-i)>length) {
						length = j-i;
						str = s.substring(i, j);
					}
				}
			}
		}
		System.out.println("Sub String :"+str);
		return length;
	}
	public static boolean allUnique(String s, int start, int end) {
		Set<Character> set = new HashSet<Character>();
		for(int i = start; i < end; i++) {
			Character ch = s.charAt(i);
			if(set.contains(ch)) {
				return false;
			}
			set.add(ch);
		}
		return true;		
	}
}
