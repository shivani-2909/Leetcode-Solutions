class Solution {
    public int buyChoco(int[] prices, int money) {
        while(money>0){

            for(int i =0;i<prices.length;i++){
                for(int j =0;j<prices.length-1;j++){
                    if(prices[j]>prices[j+1]){
                        int temp;
                        temp = prices[j];
                        prices[j]=prices[j+1];
                        prices[j+1]=temp;
                    }
                }
            }
            money = money-(prices[0]+prices[1]);
            if(money>=0)
            return money;
            else{
                return money+(prices[0]+prices[1]);
            }
        }return 0;
        
    }
}