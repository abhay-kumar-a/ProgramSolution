package dsabootcamp.sortingalgorithms;

public class BubbleSort2 {
    public static void main(String [] aStrings){
        //Bubble Sort
        int a[]= {1,2,3,4};
        int n= a.length;
        System.out.println("Given elements are : ");
        for(int i=0;i<=n-1;i++)
        {
            System.out.print(" "+a[i]);
        }
        System.out.println("  ");

        System.out.println("All Iterations Step by Step : ");
        // Bubble sort::::::::::::::::::::::::::::::::::
        for(int i=0; i<n-1;i++){                             // Logic For Swap Values
            for(int j=0;j<n-1;j++)
            {
                if(a[j+1]<a[j])            // right number > leFt
                {
                    int temp = a[j+1];
                    a[j+1]= a[j];
                    a[j] = temp;
                }
            }
            System.out.print(i+1 + " ...");            // Print all Iterations
            for(int k=0;k<n;k++)
            {
                System.out.print(a[k]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Sorted Elements are  ");    //Print all Sorted Elements
        for(int j=0;j<n;j++)
        {
            System.out.print(  " "+ a[j]);
        }
    }

}