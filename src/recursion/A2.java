package recursion;

public class A2 {
    public static void main(String[] args) {

        int totalDices= 3;
        int dices = 1;
        int totalCoefficient = 0;
        int [] likingValues={-1,3,4};
        for(int i = 0 ; i<likingValues.length;i++)
        {
            totalCoefficient=  totalCoefficient+likingValues[i]*dices;
            dices++;
        }
        System.out.println(totalCoefficient);
    }
}
