package leetcode.com;

import java.util.Arrays;

/*Construct an algorithm to check whether two words (or phrases) are anagrams or not!

"An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once"*/

public class Anagram {
	//O(NlogN) + O(N) = O(NlogN)
	public static boolean isAnagram(char[] c1, char[]c2) {
		if(c1.length!=c2.length)
		{
			return false;
		}
		
		Arrays.sort(c1);// O(NlogN)
		Arrays.sort(c2);
		
		//O(N)
		for(int i=0; i<c1.length; i++) {
			if(c1[i] != c2[i]) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		char[] c1 = {'r','e','s','t','f','u','l'};
		char[] c2 = {'f','l','u','s','t','e','r'};
		
		System.out.println(isAnagram(c1, c2));

	}

}
