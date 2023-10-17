//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int count = 0;
        int f = first(arr,x);
        int l = last(arr,x);
        if(f>=0 || l>=0){
            count = l - f + 1;
        }else{
            count = 0;
        }
        
        return count;
    }
        
        public int first(int[] arr, int x){
            int first = -1;
            int start = 0;
            int end = arr.length-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(x == arr[mid]){
                    first = mid;
                    end = mid-1;
                }else if(x<arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
                
            }return first;
        }
        public int last(int[] arr, int x){
            int last = -1;
            int start = 0;
            int end = arr.length-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(x == arr[mid]){
                    last = mid;
                    start = mid+1;
                }else if(x<arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            } return last;
        }
        
    
}