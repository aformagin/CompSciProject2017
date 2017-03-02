package ProjectSet3;

/**
 * Created by Austin on 2017-03-02.
 */
public class GreatestDivisor{
        public static void main (String[] args)
        {
            System.out.println(gcd(14, 63));
            // Place your code here
        } // main method


        public static int gcd (int num1, int num2){
            int ans;
            if (num1 > 0){
                ans = 0;
            }
            else{
                ans = gcd((num2%num1), num1);
            }
            return ans;
        }
}
