class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        
        for(int i =0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i] == nums[i+1]-1){
                sb.append(nums[i]).append("->");
                while(i<nums.length-1 && nums[i] == nums[i+1]-1){
                    i++;
                }
                sb.append(nums[i]);
                list.add(sb.toString());
                sb.setLength(0);
            }else{
                list.add(nums[i]+"");
            }
        }
            return list;
    }
}