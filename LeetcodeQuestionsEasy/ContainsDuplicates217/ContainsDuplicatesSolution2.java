package ContainsDuplicates217;

import java.util.HashSet;

public class ContainsDuplicatesSolution2 {
	 public boolean containsDuplicate(int[] nums) {
	      HashSet<Integer>set = new HashSet<Integer>(nums.length);
	      for(int x:nums){
	           if(set.contains(x)){
	               return true;
	           }
	           set.add(x);
	       }
	        return false;
	  }
}
