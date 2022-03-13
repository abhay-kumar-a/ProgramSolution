package dsabootcamp.opps.generics;

public class Main {
    public static void main(String[] args) {
        CustomArrayList arr= new CustomArrayList();
        for(int  i = 1;i<=10;i++)
        {
            arr.add(i);
        }
        System.out.println(arr);
        System.out.println(arr.size());
        arr.addAtIndex(2,45);
        System.out.println(arr);
        System.out.println(arr.size());

//        System.out.println(arr);
//        System.out.println(arr.get(0));
//        System.out.println(arr.get(6));
//        System.out.println("size is : "+ arr.size());
//        //
//        arr.addLast(34);
//        System.out.println(arr);
//        System.out.println(arr.size());
//        System.out.println(arr.removeFirst());
//        System.out.println(arr);
//        System.out.println(arr.removeLast());
//        System.out.println(arr);
    }
}
