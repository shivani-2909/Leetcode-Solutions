//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        
        
         HashMap<Character,Integer> hm=new HashMap<>();
         for(int i=0;i<pat.length();i++)
         {
             char ch=pat.charAt(i);
             hm.put(ch,hm.getOrDefault(ch,0)+1);
         }
         
         //now in the map we having the character of pat 
         int count=hm.size();
         int res=0;
         int k=pat.length();//window size
         
         int i=0,j=0;
         while(j<txt.length()){
             char ch=txt.charAt(j);
             //check this character is present in the hm
             //if present than just reduce its frequency by one
             if(hm.containsKey(ch)){
                 hm.put(ch,hm.get(ch)-1);
                 //and see after reducing by one is it freq beacome zero then 
                 //reduce the count
                 if(hm.get(ch)==0)
                 count--;
             }
             
             if((j-i+1)<k){
                 j++;
             }
             else if((j-i+1)==k){
                 
                 if(count==0){
                     res++;
                 }
                 
                 char ch1=txt.charAt(i);
                 if(hm.containsKey(ch1)){
                     hm.put(ch1,hm.get(ch1)+1);
                     if(hm.get(ch1)==1)
                     count++;
                 }
                 
                 
                 //slide the window 
                 i++;
                 j++;
                 
             }
         }
         return res;

        
    }
    
}