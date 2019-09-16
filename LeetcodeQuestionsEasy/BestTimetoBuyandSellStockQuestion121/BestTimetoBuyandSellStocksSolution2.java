package BestTimetoBuyandSellStocks121;

public class BestTimetoBuyandSellStocksSolution2 {
	    public int maxProfit(int[] prices) {
	        int minAmount = Integer.MAX_VALUE;
	        int maxProfit = 0;
	        for(int i = 0; i<prices.length; i++){
	            if(prices[i] < minAmount){
	                minAmount = prices[i];
	            }
	            
	            else if(prices[i] - minAmount > maxProfit){
	                maxProfit = prices[i] - minAmount;
	            }
	        }
	        return maxProfit;
	 }
}
