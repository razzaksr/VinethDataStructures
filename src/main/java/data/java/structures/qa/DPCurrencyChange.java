package data.java.structures.qa;

/*
[500,100]   >> 1800
500+500+500+100+100+100 >> 6
500+500+100+100+100+100+100+100+100+100 >> 10
 */

import java.util.Arrays;

public class DPCurrencyChange {

    public static int findMinCurrencyNotes(int[] arr,int userAmount){
        int[] poss=new int[userAmount+1];
        Arrays.fill(poss,userAmount+1);
        // initial solution
        poss[0]=0;

        for(int each:arr){
            // each is 500
            for(int current=each;current<=userAmount;current++){
                // 500
                poss[current]=Math.min(poss[current],poss[current-each]+1);
                //System.out.println(poss[current]);
            }
        }

        return (poss[userAmount]<=userAmount)?poss[userAmount]:-1;
    }

    public static void main(String[] args) {
        System.out.println(findMinCurrencyNotes(new int[]{500,100},1800));
        System.out.println(findMinCurrencyNotes(new int[]{500,100},40000));
        System.out.println(findMinCurrencyNotes(new int[]{500,100},1150));
        System.out.println(findMinCurrencyNotes(new int[]{500,100,50},5250));
    }
}
