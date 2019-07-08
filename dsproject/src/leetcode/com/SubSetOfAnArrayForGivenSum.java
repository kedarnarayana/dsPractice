package leetcode.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

//find subset of given array which has two numbers for given sum value
public class SubSetOfAnArrayForGivenSum {
	
	public static void subSet(int sum, int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for (int i : arr) {
			int val = sum - i;
			if(!map.containsKey(val)) {
				map.put(i, val);
			}
			else {
				System.out.println("["+i+","+val+"]");
				break;
			}			
		}
	}
	
	public static void subSet1(int sum, int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		for(int i : arr) {
			int val = sum-i;
			//List<Integer> list = Arrays.asList(arr);
			if(list.contains(val)) {
				System.out.println("["+i+","+val+"]");
				break;
			}
		}
	}
	
	public static void subSet2(int sum, int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		//list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		for(int i : arr) {
			int val = sum-i;
			//List<Integer> list = Arrays.asList(arr);
			if(list.contains(val)) {
				System.out.println("["+i+","+val+"]");
				//break;
			}
			list.add(i);
		}
	}

	public static void main(String[] args) {
		int[] arr = {7,1,2,3,4,5,6};
		int sum = 10;
		subSet2(sum, arr);

	}

}
