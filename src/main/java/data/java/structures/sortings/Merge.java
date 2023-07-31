package data.java.structures.sortings;

import java.util.Arrays;

public class Merge {

    public static void conquer(double[] got, int start,int mid,int end){
        int lengthLeft=mid-start+1;
        int lengthRight=end-mid;

        double[] gotLeft=new double[lengthLeft];
        double[] gotRight=new double[lengthRight];

        for(int indexLeft=0;indexLeft<lengthLeft;indexLeft++){
            gotLeft[indexLeft]=got[start+indexLeft];
        }

        for(int indexRight=0;indexRight<lengthRight;indexRight++){
            gotRight[indexRight]=got[mid+1+indexRight];
        }

        // compare gotLeft and gotRight and store into original
        int indexLeft=0,indexRight=0,indexOrigin=start;

        while(indexLeft<lengthLeft&&indexRight<lengthRight){
            if(gotLeft[indexLeft]>gotRight[indexRight]){
                got[indexOrigin]=gotRight[indexRight];
                indexRight++;
            }
            else{
                got[indexOrigin]=gotLeft[indexLeft];
                indexLeft++;
            }
            indexOrigin++;
        }

        while(indexLeft<lengthLeft){
            got[indexOrigin]=gotLeft[indexLeft];
            indexLeft++;
            indexOrigin++;
        }

        while(indexRight<lengthRight){
            got[indexOrigin]=gotRight[indexRight];
            indexRight++;
            indexOrigin++;
        }

    }

    public static void divide(double[] got,int start,int end){
        if(start<end){
            //System.out.println(Arrays.toString(got)+" start "+start+" end "+end);
            int mid=start+(end-start)/2;
            divide(got,start,mid);
            divide(got,mid+1,end);
            conquer(got,start,mid,end);
        }
    }

    public static void main(String[] args) {
        double[] arr={89.4,2.3,87.4,12.9,5.6,3.3,1.20,4.5};
        divide(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
