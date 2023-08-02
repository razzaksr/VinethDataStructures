package data.java.structures.sortings;

/*
String:
    compareTo>> alpha, Alpha
    97-65   >> 32

    index >> 0 < 8
    bubble >> 0 < 9-index-1
    0,1 ; 1,2 ; 2,3 ; 3,4 ; 4,5 ; 5,6 ; 6,7 ; 7,8 >> bubble, bubble+1
    0,1 ; 1,2 ; 2,3 ; 3,4 ; 4,5 ; 5,6 ; 6,7 ;
     0    1     2    3      4      5     6       7        8
    Node Django Vue Express Spring Flask Angular React Hibernate
      b    b+1

      0    1     2    3      4      5     6       7        8
    Django Node Vue Express Spring Flask Angular React Hibernate
                b   b+1

      0    1     2      3      4      5     6       7        8
    Django Node Express Vue Spring Flask Angular React Hibernate
                         b   b+1

      0    1     2      3      4      5     6       7        8
    Django Node Express Spring Vue Flask Angular React Hibernate
                               b    b+1

      0    1     2      3      4      5     6       7        8
    Django Node Express Spring Flask Vue Angular React Hibernate
                                      b     b+1

      0    1     2      3      4      5      6       7        8
    Django Node Express Spring Flask Angular Vue React Hibernate
                                               b   b+1

      0    1     2      3      4      5      6       7        8
    Django Node Express Spring Flask Angular React Vue Hibernate
                                                    b    b+1

      0    1     2      3      4      5      6       7        8
    Django Node Express Spring Flask Angular React Hibernate Vue
                                                      b      b+1

 */

import java.util.Arrays;

public class Bubble {

    // O(n2)
    public static void sortBubble(String[] arr){
        // 0,1,2,3,4,5,6,7
        for(int index=0;index<arr.length-1;index++){
            // index=0; 0,1,2,3,4,5,6,7 >> index=1; 0,1,2,3,4,5,6
            for(int bubble=0;bubble<arr.length-index-1;bubble++){
                if(arr[bubble].compareTo(arr[bubble+1])>0){
                    String third=arr[bubble];
                    arr[bubble]=arr[bubble+1];
                    arr[bubble+1]=third;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] frameworks={"Node", "Django", "Vue", "Express", "Spring", "Flask", "Angular", "React", "Hibernate"};
        sortBubble(frameworks);
        System.out.println(Arrays.toString(frameworks));
    }
}
