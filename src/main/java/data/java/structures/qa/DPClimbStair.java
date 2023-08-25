package data.java.structures.qa;

public class DPClimbStair {

    // 4>> 1+1+1+1, 1+2+1, 2+1+1, 1+1+2, 2+2
    // 5>> 1+1+1+1+1, 2+2+1, 1+2+2, 2+1+2, 1+1+2+1, 1+2+1+1, 2+1+1+1, 1+1+1+2
    public static int findCount(int stairs){
        if(stairs<=2){
            return stairs;
        }
        else{
            int[] arr=new int[stairs+1];//5>> 0,1,2,3,4

            arr[1]=1;arr[2]=2;
            for(int index=3;index<arr.length;index++){
                arr[index]=arr[index-1]+arr[index-2];
            }

            return arr[stairs];
        }
    }

    public static void main(String[] args) {
        System.out.println(findCount(4));
        System.out.println(findCount(2));
        System.out.println(findCount(1));
        System.out.println(findCount(5));
    }
}
