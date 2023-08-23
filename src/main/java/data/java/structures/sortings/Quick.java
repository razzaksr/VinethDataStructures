package data.java.structures.sortings;

/*
pivotalPoint>> divide
start, end, middle

pivotPoint=end:

sorting:
1. pivotalData=endValue
2. initialPosition=start-1
3. traverse through array pointer of current = start to end

 */

import java.util.Arrays;

public class Quick {

    public int getPivotalPoint(String[] arr, int start, int end){
        int initial=start-1;
        String pivotalData=arr[end];

        for(int current=start;current<end;current++){
            if(arr[current].compareTo(pivotalData)>0){
                initial++;
                String temp=arr[initial];
                arr[initial]=arr[current];
                arr[current]=temp;
            }
        }

        String temp=arr[initial+1];
        arr[initial+1]=arr[end];
        arr[end]=temp;

        return initial+1;
    }

    public void sort(String[] arr, int start, int end){
        if(start<end){
            int pivotalPoint=getPivotalPoint(arr,start,end);
            sort(arr,start,pivotalPoint-1);
            sort(arr,pivotalPoint+1,end);
        }
    }

    public static void main(String[] args) {
        String[] frameworks={"Node", "Django", "Vue", "Express", "Spring", "Flask", "Angular", "React", "Hibernate"};
        Quick quick=new Quick();
        quick.sort(frameworks,0,frameworks.length-1);
        System.out.println(Arrays.toString(frameworks));
    }
}
