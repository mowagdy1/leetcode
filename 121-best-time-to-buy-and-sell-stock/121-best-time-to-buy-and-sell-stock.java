class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        
        int maxProfit=0;
        
        for(int i=0; i<prices.length; i++){
            
            if(prices[i]<prices[l]){
                l=i;
            }
            
            if(prices[i] - prices[l] > maxProfit){
                r=i;
                maxProfit = prices[i] - prices[l];
            }
        }
        
        return maxProfit;
    }
}