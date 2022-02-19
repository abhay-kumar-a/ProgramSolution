package recursion;

import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {
        String s = "I believe in quality , so that building are well crafted as well as well ";
        String strArray[] = s.split(" ");
        int count =0;
        int temp=0;
        String[] arr = new String[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            count = 0;
            temp=0;
            for (int j = 0; j < strArray.length; j++) {
                temp++;
                if (strArray[i].equals(strArray[j])) {
                    count++;
                    if (count > 1) {
                        arr[i] = strArray[i];
                    }
                }
            }
            System.out.println(count);
            System.out.println(temp);
        }
        System.out.println(Arrays.toString(arr));
    }
}

