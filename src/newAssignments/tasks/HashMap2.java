package newAssignments.tasks;


import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMap2 {

    public static int[] sittingArrangement(int[] roll_no, int[] sitting_position){

        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i= 0;i<roll_no.length;i++)
        {
            map.put(roll_no[i],sitting_position[i]);
        }

        System.out.println();

        int count=0;
        for(int i=0;i<roll_no.length;i++)
        {
            count=0;
            for(int j=0;j<roll_no.length;j++)
            {
               if(roll_no[i] !=sitting_position[j])
               {
                   count++;
               }
               else {
                   roll_no[i]=count;
                   break;
               }
            }
        }
        return roll_no;
    }
    public static void main(String[] args) {
       int[]  roll_no = new int[]{20,24,46,42,60};
       int[] sitting_position = new int[]{60,20,42,46,24};
       int[] list = sittingArrangement(roll_no,sitting_position);
       System.out.println(Arrays.toString(list));

    }
}
