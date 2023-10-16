class Solution {
    public int[] buildArray(int[] nums) {
        int c = 1001;
        
        for(int i =0;i<nums.length;i++){
            nums [i] = nums[i]+c*(nums[nums[i]]%c);
        }
        for(int i =0;i<nums.length;i++){
            nums[i] = nums[i]/c;
        }
        return nums;
    }
}