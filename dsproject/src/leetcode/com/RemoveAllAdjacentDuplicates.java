package leetcode.com;

import java.util.HashSet;
/*Input: "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.
The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
 
 */
public class RemoveAllAdjacentDuplicates {

	public static void main(String[] args) {
		String s = "BAABDCCDkedar";
		System.out.println(removeAdjacentDuplicatesUsingStackDs(s));

	}
	//assumption: Input String contains only capital letters
	/*Complexity Analysis

Time complexity : O(N^2), where N is a string length. Here we have an onion : while -> for -> replace. while is executed not more then N/2 times, 
 for is always run 26 times, and replace has O(N) run time in average.
 In total that results in o((N/2)*26*N)=O(N^2).	
 
Space complexity : O(N). The hashset of duplicates has the constant length 26, 
but replace function actually creates a copy of the string and thus uses O(N) space.*/ 
	public static String removeAdjacentDuplicates(String s) {
		HashSet<String> duplicates = new HashSet<String>();
		StringBuilder sb = new StringBuilder();
		for(char i='A';i<'Z';i++) {
			sb.setLength(0);
			sb.append(i);sb.append(i);
			duplicates.add(sb.toString());
		}
		System.out.println(duplicates);
		int prevLength = -1; int l = 0;
		while(prevLength != s.length()) {
			System.out.println(l++);
			prevLength = s.length();
			for(String d : duplicates)
				s = s.replace(d, "");		
		}
		
		return s;		
	}
	/* time complexity : o(N), where N is a string length
	 * space complexity : O(N-D), where D is total length of duplicate characters
	 */
	public static String removeAdjacentDuplicatesUsingStackDs(String s) {
		StringBuilder sb = new StringBuilder();
		int sbLength = 0;
		
		for (char c : s.toCharArray()) {
			if(sbLength != 0 && c == sb.charAt(sbLength-1)) {
				sb.deleteCharAt(sbLength-1);
				sbLength--;
			}
			else {
				sb.append(c);
				sbLength++;
			}
		}
		return sb.toString();
		
	}

}
