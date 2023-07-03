class Solution {
    public int countPrimes(int n) {
        boolean b[] = new boolean[n];
        int count =0;

        for(int i =2;i<n;i++){
            b[i]=true;
        }
        
		for(int i=2;i*i<n;i++){   
			if(b[i]==true)
            
			for(int j =i+i;j<n;j=j+i) {
				b[j] = false;
			}
            
		}
        for(int k =2;k<n;k++) {
			if(b[k]==true){
                count++;
            }
		} return count;
		
		
		
        
    }
}