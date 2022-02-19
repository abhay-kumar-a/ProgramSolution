package dsabootcamp.opps.generics;

import javax.management.ObjectName;
import java.util.Arrays;
// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects
public class GenericSolutionCustomArrayList<T> {
    private Object[] data;
    private  int size;
    static int DEFAULT_SIZE = 5;
    GenericSolutionCustomArrayList()
    {
        this.data = new Object[DEFAULT_SIZE];
    } //Type parameter 'T' cannot be instantiated directly
    void add(T num)               /// for adding data;
    {
        if(isFull())
        {
            resize();
        }
        data[size++]=num;
    }
     void resize()
    {
        DEFAULT_SIZE=DEFAULT_SIZE*2;
     Object[] temp  = new Object[DEFAULT_SIZE];
     for(int i=0;i<data.length;i++)
     {
         temp[i]=data[i];
     }
     data= temp;

    }

    boolean isFull()
    {
        return size == data.length;
    }

    void remove(int index)             /// remove element from at any index
    {
        Object[] temp = new Object[data.length];
        for(int i = 0,k=0;i<data.length;i++)
        {
            if(i==index)
            {
                --size;
              continue;
            }temp[k++]=data[i];
        }
        data=temp;
    }
    T get(int index)   // get method to access element;
    {
        return (T)data[index];   /// here cast is required : Required type: T,  Provided: Object,so cast objects to T;
    }
    int size()
    {
        return size;
    }
    public void set(int index,T value)
    {
        data[index]=value; // here no need for cast because T store in Objects and Objects is bigger than type parameter (casting required when store big to small)
    }
    @Override
    public String toString() {         // override toString Method
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", ElementsSize=" + size + ", ArrayLength= "+data.length+
                '}';
    }


    public static void main(String[] args) {
        GenericSolutionCustomArrayList arrayList = new GenericSolutionCustomArrayList(); // now can use any reference type like integer, String , Float etc;
           for (int i = 0;i<6;i++)
             {
                   arrayList.add(i);
             }
           arrayList.add("Abhay");
           arrayList.add(34.6f);
        System.out.println(arrayList);
//        arrayList.remove(3);
//        System.out.println(arrayList);
//        System.out.println(arrayList.get(4));
//        System.out.println(arrayList.size);
//        arrayList.set(4,34);
//        System.out.println("set value is "+ arrayList);

        // we cont add string; because it supports only int  types, but in Actually array list we can pass any data types
         /// so for solving this problem use generics;

        // Note: we can also give restriction of arrayList to use only specific reference type which I will mention ///so for this restriction use generic
        // WildCards
    }
}
