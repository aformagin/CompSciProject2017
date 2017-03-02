package ProjectSet3;

/**
 * Created by Austin on 2017-03-02.
 */
public class PineTrees {
    public static void main (String[] args)
    {
        System.out.println(numTrees(6500, 14));
        // Place your code here
    } // main method


    public static long numTrees (double trees, int years)
    {
        //Sells 12% of total trees, plants 600 new
        long answer;
        if (years == 0){
            answer = 0;
        }
        else{
            answer = (long)(numTrees((trees), (years - 1))*(1-0.13)+700);
        }
        return answer;
    }
}
