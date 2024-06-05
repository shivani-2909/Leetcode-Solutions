class Solution {
    public int maxProfit(int[] prices) {
        int Profit = 0;
		int BP[] = new int[prices.length];
		int SP[] = new int[prices.length];
		//BP[0] =0;
		SP[0] =0;
		if(prices.length<0){
			BP[1] = prices[0];

		}
		
		
		for(int i =1;i<prices.length;i++) {
			
			BP[i] = Math.min(BP[i-1], prices[i-1]);
			BP[1]=prices[0];
			SP[i] = prices[i];
			int P = SP[i]-BP[i];
			Profit = Math.max(P, Profit);
			
			
		} return Profit;
        
    }
}