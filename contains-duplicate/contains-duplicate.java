class Solution {
    public boolean containsDuplicate(int[] nums) {
			boolean ans = false;
			HashSet<Integer> set = new HashSet<>();
			for(int i =0;i<nums.length;i++){
				
					if(set.contains(nums[i])){
						ans = true;
					}else{
						set.add(nums[i]);
					}
				
			}return ans;
        
    }
}