package dsabootcamp.opps.generics;

import dsabootcamp.arrays.ArrayLists;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private  int size;
    static int DEFAULT_SIZE = 5;
    CustomArrayList()
    {
        this.data = new int[DEFAULT_SIZE];
    }
    void add(int num)               /// for adding data;
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
     int[] temp  = new int[DEFAULT_SIZE];
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
        int[] temp = new int[data.length];
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
    int get(int index)   // get method to access element;
    {
        return data[index];
    }
    int size()
    {
        return size;
    }
    public void set(int index,int value)
    {
        data[index]=value;
    }
    @Override
    public String toString() {         // override toString Method
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", ElementsSize=" + size + ", ArrayLength= "+data.length+
                '}';
    }


    public static void main(String[] args) {
        CustomArrayList arrayList = new CustomArrayList();
           for (int i = 0;i<6;i++)
             {
                   arrayList.add(i);
             }
        System.out.println(arrayList);
        arrayList.remove(3);
        System.out.println(arrayList);
        System.out.println(arrayList.get(4));
        System.out.println(arrayList.size);
        arrayList.set(4,34);
        System.out.println("set value is "+ arrayList);

    }
}
