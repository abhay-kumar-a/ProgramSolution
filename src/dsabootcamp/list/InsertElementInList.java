package dsabootcamp.list;

import java.util.ArrayList;
import java.util.List;

public class InsertElementInList {
    public static void main(String[] args) {
//        System.out.println("phone_blue_pixel_computer_silver_lenovo_phone_gold_iphone");
        int n = 3;
        List<List<String>> alist = new ArrayList<>();

        List<String> list1 = new ArrayList<>();
        list1.add("phone");
        list1.add("blue");
        list1.add("pixel");
//        System.out.println(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("computer");
        list2.add("silver");
        list2.add("lenovo");
//        System.out.println(list2);

        List<String> list3 = new ArrayList<>();
        list3.add("phone");
        list3.add("gold");
        list3.add("iphone");
//        System.out.println(list3);
        alist.add(list1);
        alist.add(list2);
        alist.add(list3);
//        System.out.print(alist);

        // get element using for loop from alist
        System.out.println();
        for (int i = 0; i < alist.size(); i++) {
            for (int j = 0; j < alist.get(i).size(); j++) {
                System.out.print(alist.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
