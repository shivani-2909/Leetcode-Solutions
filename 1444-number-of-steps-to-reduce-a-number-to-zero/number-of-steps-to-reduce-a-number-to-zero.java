class Solution {
    public int numberOfSteps(int num) {
        return helper(num);
    }
    public static int helper(int n){
        return steps(n,0);
    }
    public static int steps(int n ,int s){
        if(n==0){
            return s;
        }
        if(n%2==0){
            return steps(n/2,s+1);
        }if(n%2!=0){
            return steps(n-1,s+1);
        }
        return steps(n/2,s);
    }
}