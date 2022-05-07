package practice.generics;
import java.util.*;

public class PrintData {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Hello");
        name.add("Head");
        name.add("Abhay");
        name.add("Aarushi");
        name.add("Manju");
        name.add("Doctor");
        // for sort ArrayList
        Collections.sort(name);
        IteratorClass.iterateList(name);
        System.out.println("-------------------------------------");

//        ArrayList<Integer> rollNumber = new ArrayList<>();

//        rollNumber.add(4);
//        rollNumber.add(5);
//        IteratorClass1.iterateList(rollNumber);

        DataModel m =new DataModel("Abhay",9,90.4f);
        DataModel m1 = new DataModel("Vivek",8,80.9f);
        DataModel m2 = new DataModel("Raju", 4,80.5f);

        ArrayList<DataModel> dataModels = new ArrayList<>();
        dataModels.add(m);
        dataModels.add(m1);
        dataModels.add(m2);
        dataModels.add(new DataModel("Deepak",5,89.3f));
        dataModels.add(new DataModel("Anil",7,60.9f));
        DataModel d1 = new DataModel();

        // sort using comparable sort method
       // Collections.sort(dataModels);


        // sort using Comparator dataModel
       // Collections.sort(dataModels , d1);  // here we can give object at place of d1
        // like in ascending order...
        Collections.sort(dataModels,new DataModel().reversed());

        // for reverse data
       // Collections.sort(dataModels, new DataModel().reversed());  // we also use reversed method for reversed whole data instead of  minus(-).


// use for iterator
        IteratorClass.iterateList(dataModels);



        // for iterator
       // Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }

    }
}
