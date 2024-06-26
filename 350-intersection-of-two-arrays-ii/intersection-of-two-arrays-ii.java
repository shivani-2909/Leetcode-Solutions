class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums2.length>nums1.length){
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums1){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int num : nums2){
            if(map.containsKey(num) && map.get(num)>0){
                list.add(num);
                map.put(num, map.get(num)-1);
            }
        }
        int[] ans = new int[list.size()];
        for(int i =0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}