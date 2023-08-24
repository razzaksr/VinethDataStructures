package data.java.structures.qa;

/*

// madam
// mam

1. insert
2. replace
3. delete

result=2

kitten
sitting

replace, replace, insert >> 3


Dynamic programming:
    divide as subsets
    trying to get the one subset solution based on previous subset result
    keep track all subset solution in an array
    last value of the array is optimal result

 0  1  2 3  4 5
[1,-1,-2,4,-7,3], k = 2

1,-2,-7,3   >> -5   >> score
1,-1,4,-7,3 >> 0
1,-1,4,3    >> 7

          m                          t=1
  [1,0,-1,4,0,0]                    m=0
  [1,-1,-2,4,-7,3], k = 2
           i



 */


public class DPJumpGame {

    public static int maxScore(int[] arr, int distance){
        int[] results=new int[arr.length];
        results[0]=arr[0];// initial subset result

        // dynamic
        for(int index=1;index<arr.length;index++){
            int maxValue=results[index-1];// previous subset result reference for finding new one
            for(int travel=index-2;travel>=Math.max(0,index-distance);travel--){
                maxValue=Math.max(maxValue,results[travel]);
            }
            results[index]=maxValue+arr[index];
        }

        return results[results.length-1];
    }

    public static void main(String[] args) {
        int[] path={1,-1,-2,4,-7,3};
        int jump=2;
        System.out.println(maxScore(path,jump));
        int[] footPrint={10,-5,-2,4,0,3};
        jump=3;
        System.out.println(maxScore(footPrint,jump));
        int[] arr={1,-5,-20,4,-1,3,-6,-3};
        jump=2;
        System.out.println(maxScore(arr,jump));
    }
}
