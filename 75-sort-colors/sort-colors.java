class Solution {
    public void sortColors(int[] nums) {
        if (nums.length <= 1) {
            return;  // If the array has 1 or 0 elements, it's already sorted
        }

        int s = 0;
        int e = nums.length - 1;
        
        // We need to loop through the array and use a modified bubble sort approach
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(j, j + 1, nums);
                }
            }
        }
    }

    public static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
