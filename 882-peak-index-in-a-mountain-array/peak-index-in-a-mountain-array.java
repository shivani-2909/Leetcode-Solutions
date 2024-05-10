class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s = 0; int mid;
        int e = arr.length-1;
        while(s<e){
            mid = s + (e-s)/2;
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }else{
                e=mid;
            }
            mid = s + (e-s)/2;
        }
        return s;
    }
}