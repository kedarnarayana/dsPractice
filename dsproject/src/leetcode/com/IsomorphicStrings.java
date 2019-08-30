package leetcode.com;

import java.util.HashMap;

public class IsomorphicStrings {
	
	public static boolean isIsomorphic(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		HashMap<Character,Character> map = new HashMap<Character,Character>();
		for(int i=0;i<s1.length();i++) {
			if(!map.containsKey(s1.charAt(i)) ) {
				if(s2.substring(0, i).contains(s2.charAt(i)+"")) {
					return false;
				}
				map.put(s1.charAt(i), s2.charAt(i));
			}else {
				char c = map.get(s1.charAt(i));
				System.out.println(c+ "  "+s2.charAt(i));
				if(c != s2.charAt(i)) {
					return false;
				}
			}			
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isIsomorphic("ab","aa"));		
	}
}
