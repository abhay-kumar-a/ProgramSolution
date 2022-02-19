package dsabootcamp.practice;
import java.util.*;

public class ArrayListInSideArrayList {
    public static void main(String[] args) {
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

        int a = countMatches3(alist, "type", "phone");
        System.out.println(a);

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            for (int j = 0; j < items.get(i).size(); j++) {
                if ((ruleKey == "type" || ruleKey == "color" || ruleKey == "name") && ruleValue == items.get(i).get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static int countMatches1(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleIndex;
        if (ruleKey.equals("type"))
            ruleIndex = 0;
        else if (ruleKey.equals("color"))
            ruleIndex = 1;
        else
            ruleIndex = 2;

        //iterating over the items list and counting number of items having
        //the given ruleValue at the ruleIndex position

        int count = 0;
        int n = items.size();
        for (int item = 0; item < n; item++) {
            if (items.get(item).get(ruleIndex).equals(ruleValue))
                count++;
        }

        return count;
    }

    public static int countMatches3(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleIndex = 0;

        int count = 0;
        switch (ruleKey) {
            case "type":
                ruleIndex = 0;
                break;
            case "color":
                ruleIndex = 1;
                break;

            case "name":
                ruleIndex = 2;
                break;

        }

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(ruleIndex).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }

    public static int countMatches5(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0, count = 0;
        //Switch is used to search for specific index.i,e if ruleKey="type" we only search 0 indexes
        switch (ruleKey) {
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
        }

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}

