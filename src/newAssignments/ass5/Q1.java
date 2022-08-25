package newAssignments.ass5;

 /* 1. Create a functional interface OilPump with following fields.
int fuelQuantity
boolean isPower (true if power petrol; false if not)
 Using Lambda Expressions print the bill amount based on following cases
a. For regular petrol , cost  =  fuelQuantity x 100
b. For power petrol, add Rs.5 extra to the total cost of regular petrol.
2. Create an anonymous implementation of the SquareRoot interface and use it to find the square root value of a given double value.
*/

interface OilPump {
    int fuelQuantity=5;
    public boolean isPower();

}
public class Q1 {
     public static void main(String[] args) {
         OilPump oilPump = new OilPump() {
             @Override
             public boolean isPower() {
                 return true;
             }
         };

     OilPump pump = () -> {
         return true;
     };
     /// a
         System.out.println("regular petrol cost is : "+ oilPump.fuelQuantity *100);

         if(oilPump.isPower())
         {
             //b
             System.out.println(oilPump.fuelQuantity*100+5);
         }

 }
}
