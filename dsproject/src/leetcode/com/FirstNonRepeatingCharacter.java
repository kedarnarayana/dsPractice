package leetcode.com;

import java.util.PriorityQueue;

public class FirstNonRepeatingCharacter {
	public static int findKthNumber(int m, int n, int k) {
        //List<Integer> table = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                pq.add((i+1)*(j+1));
                if(pq.size()==k){
                    return pq.peek();
                }
            }
        }
        //Collections.sort(table);
        return pq.peek();
    }
	public static void printFirstNonRepeatingCharacter(String s) {
		for(int i=0;i<s.length();i++) {
			if(! ((s.substring(i+1, s.length()).contains(s.charAt(i)+"")) || (s.substring(0, i).contains(s.charAt(i)+"")))) {
				System.out.println("FirstNonRepeatingCharacter: "+s.charAt(i));
				break;
			}
		}
	}
	
	static final int NO_OF_CHARS = 256; 
    static char count[] = new char[NO_OF_CHARS]; 
      
    /* calculate count of characters  
       in the passed string */
     static void getCharCountArray(String str)  
     { 
    	 
         for (int i = 0; i < str.length();  i++) 
              count[str.charAt(i)]++; 
     } 
       
    /* The method returns index of first non-repeating 
       character in a string. If all characters are repeating  
       then returns -1 */
    static int firstNonRepeating(String str) 
    { 
        getCharCountArray(str); 
        /*for(char c: count) {
        	System.out.println(c+"    ");
        }*/
        int index = -1, i; 
       
        for (i = 0; i < str.length();  i++) 
        { 
            if (count[str.charAt(i)] == 1) 
            { 
                index = i; 
                break; 
            }    
        }   
        
      return index; 
    }

	public static void main(String[] args) {
		//printFirstNonRepeatingCharacter("geeksforgeeks");
		
		/*String str = "geeksforgeeks"; 
        int index =  firstNonRepeating(str); 
          
        System.out.println(index == -1 ? "Either all characters are repeating or string " + 
                   "is empty" : "First non-repeating character is " +  str.charAt(index)); */
		
		System.out.println(findKthNumber(3,3,5));
    

	}

}
