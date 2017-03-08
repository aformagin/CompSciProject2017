package ProjectSet3;

/**
 * Created by Austin on 2017-03-03.
 */
public class CollatzConjecture
{
    public static void main (String[] args)
    {
        System.out.println (collatz (100));
        // Place your code here
    } // main method


    public static String collatz (double num)
    {
        //String ans;
        if (num == 1)
        {
            return num + "";
        }
        else
        {
            if (num % 2 == 0)
                return num + " " +collatz (num / 2) + " ";

            else
                return num + " " + collatz ((num * 3) + 1) + " ";
        }
        //ans = num;
        //return ans + " ";
    }
}
