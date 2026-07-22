class Solution {
    public int maxProfit(int[] prices) {
        int minsum=9999;
        int maxprofit=0;
        for(int price:prices){
            if(price<minsum){
                minsum=price;
            }
            else{
                maxprofit=Math.max(maxprofit,price-minsum);
            }
        }
        return maxprofit;
    }
}