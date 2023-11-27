public class stock_profit {
    
    public static int max_profit(int shares[]){

        int mp = 0;
        int buy_price = shares[0];

        for(int i = 1; i < shares.length; i++){

            if(shares[i] > buy_price){
                int profit = shares[i] - buy_price;
                mp = Math.max(mp, profit);
            }
            else{
                buy_price = shares[i];
            }
        }
        return mp;
    }

    public static void main(String args[]){

        int shares[] = {5,4,3,2,1};
        System.out.println(max_profit(shares));
    }
}
