package dsabootcamp.binearsearch.practice;

import dsabootcamp.opps.interfaces.extendDemo2.A;

import java.util.*;

public class DuplicateElement {
    public static void main(String[] args) {
        int[]arr = {2,9,4,3,3,2,4,4,3,7};
//        Arrays.sort(arr);
//        System.out.println(" actual Arrays is : "+ Arrays.toString(arr));
//
//        System.out.println("\nDuplicate arr is : ");
//        findDuplicates(arr);
//        System.out.println("Remove duplicate...\n Unique elements are>>>");
//        removeDuplicateElement(arr);
        /// using Map
//        getDuplicateUsingHashMap(arr);
        /// using Set
        getDuplicateUsingSet(arr);
    }
    static void findDuplicates(int[] arr) /// not optimize....
    {
        for (int i = 0;i<arr.length;i++)
        {
            for (int j = i+1 ;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    // using set data structure
    static  void getDuplicateUsingSet(int[] arr)
    {
        Set<Integer> set = new HashSet<>();
       for(int a: arr)
        {
            set.add(a);
        }
        System.out.println("All Unique elements are : "+set);
//        for(int b : arr)
//        {
//            if(!set.add(b))
//            {
//                System.out.println(b);
//            }
//        }
    }


    /// using hashMap....
    static void getDuplicateUsingHashMap(int[] arr)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int arr1 : arr)
        {
            if(map.containsKey(arr1))
            {
                map.put(arr1,map.get(arr1)+1);
            }
            else {
                map.put(arr1,1);
            }
        }
        // print data <key, value> pair from map
        System.out.println("Key and value are arr are : ");
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getValue() + " --- "+ entry.getKey());
        }
        System.out.println("Unique element of arr is : ");
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.print(entry.getKey()+ " ");
        }

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new Stack<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>1)
            {
                list.add(entry.getKey());
            }
            if(entry.getValue() == 1)
            {
                list1.add(entry.getKey());
            }
        }
        System.out.println("\nDuplicates  list Are : "+list );
        System.out.println("Unique elements are : "+ list1);

    }
    static void removeDuplicateElement(int [] arr)
    {
        int j = 0;
        for(int i = 0; i<arr.length-1;i++)
        {
            if(arr[i] != arr[i+1])
            {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length-1];
        // print all unique elements
        for (int k = 0;k<j;k++)
        {
            System.out.print(arr[k]+ " ");
        }
    }
}
