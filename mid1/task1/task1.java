package mid1.task1;

import java.util.Collections;
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {

//        int[] nums = {3,2,4};
//         int target = 6;
//
//         for (int i = 0; i < nums.length; i++){
//             for(int j = 1; j < nums.length; j++){
//                 if ((nums[i] + nums[j]) == target) {
//                     System.out.println(i);
//                 }
//             }
//        }

        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();

        l1.add(2);
        l1.add(3);
        l1.add(4);

        l2.add(5);
        l2.add(6);
        l2.add(7);

        Collections.reverse(l1);
        Collections.reverse(l2);

        







    }
}