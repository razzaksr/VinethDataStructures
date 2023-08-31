package data.java.structures.qa;

/*
0  1  2 3  4
45 12 3 10 50

45>>12,3,10,50 >> 45,50 >> 5
12,50>> 38

 */

public class DPStockButAndSell {

    public static void bestTimeToBuyAndSell(int[] arr){
        if(arr.length<2){
            System.out.println("Invalid stock history");
        }
        else{
            // initial solution parameters
            int currentBuy=arr[0];
            int currentSell=arr[1];

            // -32
            int maxProfit=currentSell-currentBuy;

            //initial solution
            int currentProfit=Integer.MIN_VALUE;

            for(int index=1;index<arr.length;index++){
                currentProfit=arr[index]-currentBuy;//50 - 3>> 47
                // 47 > 7
                if(currentProfit>maxProfit){
                    maxProfit=currentProfit;
                    currentSell=arr[index];//50
                }
                // 3>50
                if(currentBuy>arr[index]){
                    currentBuy=arr[index];// 3
                }
            }
            System.out.println("Best time to buy "+(currentSell-maxProfit)
                    +" best time to sell "+currentSell);
        }
    }

    public static void main(String[] args) {
//        int[] arr={45,12,3,10,50};
//        int[] arr={-10,-5,-2,-1,1};
        int[] arr={90,40,20,10,4};
        bestTimeToBuyAndSell(arr);
    }
}
