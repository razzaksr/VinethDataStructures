package data.java.structures.qa;

/*
 0  1  2   3   4   5
15 89 123 124 256 1024
s      m           e

 0  1  2   3   4   5
15 89 123 124 256 1024
s,m e

-1 0  1  2   3   4   5
   15 89 123 124 256 1024
e  s,m




 */

public class DCFindMissingMinElement {

    public static int missed(int[] arr, int start, int end){
        if(start>end){
            return start;
        }
        else{
            int midPosition=start+(end-start)/2;
            int midData=arr[midPosition];
            if(midPosition<midData){
                end=midPosition-1;
            }
            else{
                start=midPosition+1;
            }
            return missed(arr,start,end);
        }
    }

    public static void main(String[] args) {
        int[] numbers={0,1,2,5,124,256,1024};
        System.out.println(missed(numbers,0, numbers.length-1));
    }
}
