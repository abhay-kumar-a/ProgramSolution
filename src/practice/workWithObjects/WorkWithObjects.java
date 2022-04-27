package practice.workWithObjects;

import com.sun.security.auth.NTSid;

import javax.swing.plaf.metal.MetalIconFactory;

public class WorkWithObjects {
        String name ;
        int rollNumber ;
        int id ;

        String Hello;
        Integer i1;
        Integer i2;
        Float f1 ;
        WorkWithObjects( WorkWithObjects other)
        {
                this.Hello = other.Hello;
                this.i1 = other.i1;
                this.i2 = other.i2;
                this.f1 =other.f1;
        }
        WorkWithObjects(String Hello , Integer i1, Integer i2,Float f1)
        {
                this.Hello =Hello;
                this.i1 =i1;
                this.i2 = i2;
                this.f1 = f1;
        }

        WorkWithObjects s ;
        WorkWithObjects newObject;
        WorkWithObjects()
        {
                this.newObject = new WorkWithObjects(null,rollNumber,id);
        }

        WorkWithObjects(String name , int rollNumber , int id)
        {
                this.name = name;
                this.rollNumber = rollNumber;
                this.id = id;
        }
        void getDetails()
        {
                int a ;
                System.out.println("name : "+name+ "\nrollNumber : "+rollNumber+ "\nid: "+ id);
        }
        @Override
       public String toString()
        {
                return s+"";
        }


}
