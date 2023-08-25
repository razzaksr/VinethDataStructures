package data.java.structures.qa;

/*
012345
kitten
0123456
sitting
                columns
                s   i   t   t   i   n   g
    rows    0   1   2   3   4   5   6   7
    0       0   1   2   3   4   5   6   7
 k  1       1   1   2   3   4   5   6   7
 i  2       2   2   1   2   3   4   5   6
 t  3       3   3   2   1   2   3   4   5
 t  4       4   4   3   2   1   2   3   4
 e  5       5   5   4   3   2   2   3   4
 n  6       6   6   5   4   3   3   2   3
 */

import java.util.Arrays;

public class DPCountConversionSteps {

    public static int noOfSteps(String alpha, String beta){
        int[][] possibilities=new int[alpha.length()+1][beta.length()+1];

        for(int row=0;row<possibilities.length;row++){
            possibilities[row][0]=row;
        }

        for(int column=0;column<possibilities[0].length;column++){
            possibilities[0][column]=column;
        }

        for(int row=1;row<=alpha.length();row++){
            for(int column=1;column<=beta.length();column++){
                if(alpha.charAt(row-1)==beta.charAt(column-1)){
                    possibilities[row][column]=possibilities[row-1][column-1];
                }
                else{
                    possibilities[row][column]=1+(Math.min(Math.min(possibilities[row-1][column],possibilities[row-1][column-1]),possibilities[row][column-1]));
                }
            }
        }

//        for(int[] row:possibilities){
//            System.out.println(Arrays.toString(row));
//        }

        return possibilities[alpha.length()][beta.length()];
    }

    public static void main(String[] args) {
        System.out.println(noOfSteps("kitten","sitting"));
        System.out.println(noOfSteps("horse","ros"));
        System.out.println(noOfSteps("madam","mam"));
    }
}
