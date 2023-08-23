package data.java.structures.qa;

import java.util.Arrays;

public class PrefixNSuffixSum {

    public static int[] prefix(int[] arr){
        int[] temp=new int[arr.length];

        temp[0]=arr[0];

        for(int index=1;index<arr.length;index++){
            temp[index]=temp[index-1]+arr[index];
        }

        return temp;
    }

    public static int[] suffix(int[] arr){
        int[] temp=new int[arr.length];

        temp[temp.length-1]=arr[arr.length-1];

        for(int index= arr.length-2;index>=0;index--){
            temp[index]=temp[index+1]+arr[index];
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] arr={45,91,23,11,8,87,21};
        //45 136  159
        //arr=prefix(arr);
        arr=suffix(arr);
        System.out.println(Arrays.toString(arr));
    }
}
