package BestTimetoBuyandSellStocks121;

public	class BestTimetoBuyandSellStocksSolution1 {
	    public int maxProfit(int[] prices) {
	        int maxProfit = 0;
	        for(int i = 0; i<prices.length-1; i++){
	            for(int j = i+1; j<prices.length; j++){
	                if(prices[j] - prices[i] > maxProfit){
	                    int profit = prices[j] - prices[i];
	                    maxProfit = profit;
	                }
	            }
	        }
	        return maxProfit;
	  }
}
