package leetcode.com;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] res = twoSum(new int[] {2,11,7,15}, 9);
		System.out.print("[");
		for(int i: res) {
			System.out.print(i+" ");
		}
		System.out.print("]");

	}
	
	 public static int[] twoSum(int[] nums, int target) {
	        
	        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	        int[] res = new int[2];
	        for(int i=0; i< nums.length; i++){
	            int j = target- nums[i];
	            if(map.containsKey(j)){
	                res[0] = map.get(j);
	                res[1] = i;
	                return res;
	            }else{
	                map.put(nums[i],i);
	            }
	        }
	        return res;
	        
	    }
	 public int[] twoSumOnePass(int[] nums, int target) {
		    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		    for (int i = 0; i < nums.length; i++) {
		        int complement = target - nums[i];
		        if (map.containsKey(complement)) {
		            return new int[] { map.get(complement), i };
		        }
		        map.put(nums[i], i);
		    }
		    throw new IllegalArgumentException("No two sum solution");
		}
	 public int[] twoSumTwoPass(int[] nums, int target) {
		    Map<Integer, Integer> map = new HashMap<>();
		    for (int i = 0; i < nums.length; i++) {
		        map.put(nums[i], i);
		    }
		    for (int i = 0; i < nums.length; i++) {
		        int complement = target - nums[i];
		        if (map.containsKey(complement) && map.get(complement) != i) {
		            return new int[] { i, map.get(complement) };
		        }
		    }
		    throw new IllegalArgumentException("No two sum solution");
		}
	 public int[] twoSumBruteForce(int[] nums, int target) {
		    for (int i = 0; i < nums.length; i++) {
		        for (int j = i + 1; j < nums.length; j++) {
		            if (nums[j] == target - nums[i]) {
		                return new int[] { i, j };
		            }
		        }
		    }
		    throw new IllegalArgumentException("No two sum solution");
		}

}
