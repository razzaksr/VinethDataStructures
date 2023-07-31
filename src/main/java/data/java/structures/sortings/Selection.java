package data.java.structures.sortings;

import java.util.Arrays;

public class Selection {

    public static void selectionSort(double[] got){
        for(int selected=0;selected<got.length;selected++){
            for(int compare=selected+1;compare<got.length;compare++){
                if(got[selected]>got[compare]){
                    got[selected]*=got[compare];
                    got[compare]=got[selected]/got[compare];
                    got[selected]/=got[compare];
                }
            }
        }
    }

    public static void main(String[] args) {
        double[] arr={89.4,2.3,87.4,12.9,5.6,3.3,1.20,4.5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
