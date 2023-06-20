class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<3){
            return -1;
        }else{
            for(int i=0;i<nums.length;i++){
                for(int j =0;j<nums.length-1;j++){
                    if(nums[j]>nums[j+1]){
                        //swap
                        int temp;
                        temp = nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                }
            }return nums[1];
        } 
        
    }
}