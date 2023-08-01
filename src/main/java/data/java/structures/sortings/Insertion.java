package data.java.structures.sortings;

/*
Insertion Sort:
1>> 0
2>> 1,0
3>> 2,1,0
4>> 3,2,1,0
5>> 4,3,2,1,0

  0  1   2    3    4   5
3.4 9.2 1.12 12.09 4.5 7.2
  p  c

  0  1   2    3    4   5
3.4 9.2 1.12 12.09 4.5 7.2
     p   c|k
  0  1   2    3    4   5
3.4 1.12 9.2 12.09 4.5 7.2
  p  k

  0  1   2    3    4   5
1.12 3.4 9.2 12.09 4.5 7.2
               p    c|k

  0  1   2    3    4   5
1.12 3.4 9.2 4.5 12.09 7.2
          p    k    c|k
  0  1   2    3    4   5
1.12 3.4 4.5 9.2 12.09 7.2
                    p  c|k
  0  1   2    3    4   5
1.12 3.4 4.5 9.2  7.2 12.09
                    p  c|k
 */

import java.util.Arrays;

public class Insertion {
    public static void sortInsert(double[] arr){
        for(int current=1;current<arr.length;current++){
            int previous=current-1;
            double key=arr[current];
            while(previous>=0&&arr[previous]>key){
                // swapping
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]=key;
        }
    }
    public static void main(String[] args) {
        double[] myData={3.4,9.2,1.12,12.09,4.5,7.2};
        sortInsert(myData);
        System.out.println(Arrays.toString(myData));
    }
}
