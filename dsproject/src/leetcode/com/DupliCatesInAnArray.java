package leetcode.com;

import java.util.HashMap;
import java.util.Map;

/*The problem is that we want to find duplicates in a T[] one-dimensional array of integers in O(N) running time
 where the integer values are smaller than the length of the array!*/
public class DupliCatesInAnArray {
	//O(N)
	public static void printDuplicates(int[] numArr) {
		for(int i=0; i<numArr.length; i++) {
			int n = numArr[Math.abs(numArr[i])];
			if(n > 0) {
				numArr[Math.abs(numArr[i])] = -n;
			}
			else {
				System.out.println(Math.abs(numArr[i]));
			}
		}
	}
	
	//using HashMap
	//O(N), but at the cost of memory space
	public static void printDuplicates1(int[] numArr) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<numArr.length; i++) {
			
			if(!map.containsKey(numArr[i])) {
				map.put(numArr[i], i);				
			}
			else {
				System.out.println(numArr[i]+"="+i);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		
		printDuplicates1(new int[] {1,1,2,3,4,4,2,1,5});

	}

}
