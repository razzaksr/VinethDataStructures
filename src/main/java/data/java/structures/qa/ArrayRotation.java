package data.java.structures.qa;

import java.util.Arrays;

public class ArrayRotation {

    public void clockWise(String[] arr, int count){
        String[] temp=new String[arr.length];
        for(int index=0;index<arr.length;index++){
            // temp[8+2%9]>> temp[2]=arr[0]
            temp[(index+count)%arr.length]=arr[index];
        }
        for(int index=0;index<arr.length;index++){
            arr[index]=temp[index];
        }
    }

    public static void main(String[] args) {
        String[] frameworks={"Node", "Django", "Vue", "Express", "Spring", "Flask", "Angular", "React", "Hibernate"};
        ArrayRotation rotation=new ArrayRotation();
        System.out.println(Arrays.toString(frameworks));
        rotation.clockWise(frameworks,2);
        System.out.println(Arrays.toString(frameworks));
    }
}
