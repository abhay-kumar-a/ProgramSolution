package practice.generics;

import javax.xml.crypto.Data;
import java.util.Comparator;

public class DataModel implements Comparable<DataModel> , Comparator<DataModel> {
   private String name;
   private int rollNumber;
   private float percentage;
   DataModel()
   {

   }

    DataModel(String name , int rollNumber , float percentage)
    {
        this.name = name;
        this.rollNumber = rollNumber ;
        this.percentage = percentage;
    }

    public String  getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Integer getRollNumber()
    {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber)
    {
        this.rollNumber = rollNumber;
    }
    public Float getPercentage()
    {
        return percentage;
    }
    public void setPercentage(float percentage)
    {
        this.percentage = percentage;
    }
    @Override
    public String toString()
    {
        //return "name : "+ name + " ,rollNumber: "+ rollNumber + " ,percentage : "+ percentage;
        return name + " "+ rollNumber + " "+ percentage;
    }

    // method of comparable Interface
    @Override
    public int compareTo(DataModel otherData) {
        return -this.getName().compareTo(otherData.getName());  // this compareTo method , that work only with Wrapper classes. , -(minus) is used for reverse the whole data.


        // above return work like
        // own implementation
//        if(this.getRollNumber() > otherData.getRollNumber())  // this is used for current object
//        {
//            return +1;
//        }
//        if(this.getRollNumber()< otherData.getRollNumber())
//        {
//            return -1;
//        }
//        return 0;

    }


    // here we can provide our own implementation
    @Override
    public int compare(DataModel o1, DataModel o2) {

       // ------ First way ------
//        if(o1.getRollNumber() > o2.getRollNumber())   // sort according to rollNumber
//        {
//            return +1;
//        }
//        if(o1.getRollNumber() < o2.getRollNumber())
//        {
//            return -1;
//        }
//        return 0;

        // ------ second Way-------------------
        return o1.getName().compareTo(o2.getName());  // sort according to name
    }


    // setter and getter
  /*  HELLO ABHAY HOW ARE YOU I AM FINE SIR HOW ARE YOU , HELLO  sir its my pleasure to introduce my self
    . my name is Abhay Kumar , I belong to Purwa Unnao ,
    Now coming to my family there are five member in my family , my father , my mother , one elder sister , one elder brother
    and me
    Now coming to me .I am smart, confident and hardworking person . I am cool hearted person so usually see any difficulty
    with my positive site and kee my self always smiling that make me stronger even more .
    I can take any task which assign to me without any hesitation .
    My hobbies are problem-solving , play online games , internet suffering , and watch news and movies in my separate
    time.
    my strength are my intelligence and my thoughtfulness  ,I believe that  in any work environment , we need to de every step
    and get detailed knowledge.
    What is your biggest accomplishment
    my biggest achievement  is overcoming of fear of failure. that give me complete sense to live in the word.


   */
}
