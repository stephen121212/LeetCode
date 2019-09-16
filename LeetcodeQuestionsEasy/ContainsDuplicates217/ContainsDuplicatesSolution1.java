package ContainsDuplicates217;

import java.util.Arrays;

public class ContainsDuplicatesSolution1 {
	public boolean containsDuplicate(int[] nums) {
	       Arrays.sort(nums);
	       for(int i = 0; i<nums.length-1; i++){
	           if(nums[i] == nums[i+1]){
	               return true;
	           }
	       }
	       return false;
	  }
}
