package leetcode.com;

import java.util.HashMap;

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

}
