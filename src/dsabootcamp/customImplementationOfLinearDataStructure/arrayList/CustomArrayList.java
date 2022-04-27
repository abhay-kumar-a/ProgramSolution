package dsabootcamp.customImplementationOfLinearDataStructure.arrayList;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private  int size;
    static int DEFAULT_SIZE = 5;
//    void methods()
//    {
//        System.out.println(size);
//        System.out.println(size++);
//        System.out.println(size);
//    } 
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
    void addLast(int value)
    {
        if(isFull())
        {
            resize();
        }
        data[size]= value;
        size++;
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

    int removeFirst()
    {
        int deleteValue=data[0];
        int[] temp = new int[DEFAULT_SIZE];
        for(int i = 0;i<size-1;i++)
        {
            temp[i] = data[i+1];
        }
        data=temp;
        size--;
        return deleteValue;
    }

    int removeLast()
    {
        int deleteValue = data[size-1];
        int[] temp = new int[DEFAULT_SIZE];
        for(int i = 0;i<size-1;i++)
        {
            temp[i] = data[i];
        }
        data = temp;
        size--;
        return deleteValue;
    }
    void addAtIndex(int index,int value)
    {
        if(isFull())
        {
            resize();
        }
        int[] temp = new int[DEFAULT_SIZE];

        for(int i = 0 ;i<index;i++) {   // copy element of data arr before index

            temp[i] = data[i];
          }
        temp[index] = value;   // add element at index

        size++;
            for(int  i = index ;i<size;i++)  // copy element of data arr after index
            {
                temp[i+1]=data[i];
            }
//        size++; v
        data=temp;  //  give access of temp  to data;

    }
    void removeAtIndex(int index)             /// remove element from at any index
    {
        int[] temp = new int[data.length];
        for(int i = 0,k=0;i<data.length;i++)
        {
            if(i==index)
            {
                --size;
//              continue;
              i++;
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
           for (int i = 1;i<6;i++)
             {
                   arrayList.add(i);
             }
        System.out.println(arrayList);
           arrayList.addAtIndex(3,67);
//        System.out.println(arrayList.removeFirst());
        System.out.println(arrayList);
        arrayList.removeAtIndex(3);
        System.out.println(arrayList);

//        arrayList.remove(3);
//        System.out.println(arrayList);
//        System.out.println(arrayList.get(4));
//        System.out.println(arrayList.size);
//        arrayList.set(4,34);
//        System.out.println("set value is "+ arrayList);

    }
}
