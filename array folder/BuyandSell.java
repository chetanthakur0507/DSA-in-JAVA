public class BuyandSell {
    public static int maxprofit(int price[]){
        int buyprice=Integer.MAX_VALUE;
        int maxrofit=0;
        for(int i=0;i<price.length;i++){
           if(buyprice<price[i]){
              int profit=price[i]-buyprice;
              maxrofit=Math.max(maxrofit, profit);

           }
           else{
            buyprice=price[i];
           }
           
        }
        return maxrofit;
    }
    public static void main(String[] args){
        int price[]={7,1,5,3,6,4};
        System.out.println(maxprofit(price));

    }
}
