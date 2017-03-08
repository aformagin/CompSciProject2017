package ProjectSet3;

/**
 * Created by Austin on 2017-03-08.
 */
public class ChessGrains {

    public static void main (String[] args)
    {
        System.out.println(totalGrains(64));
        // Place your code here
    } // main method


    public static double totalGrains (int square)
    {
        //long ans;

        if (square == 1){
            return 1;
        }

        else{
            return Math.pow(2,square-1) + totalGrains (square-1);

        }


        ///x+ method(x*2,power-1) power is the square number, x is the number of grains
    }
}
