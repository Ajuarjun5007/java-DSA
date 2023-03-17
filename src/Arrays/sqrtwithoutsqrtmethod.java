package Arrays;

public class sqrtwithoutsqrtmethod {
    public static void main(String[] args)
    {
        double n = 23;

        findSqrt(n);
    }
    static double Square(double n, double i, double j)
    {
        double mid = (i + j) / 2;// 4.8125
        double mul = mid * mid; // 23.76

        // If mid itself is the square root,
        // return mid
        if ((mul == n) ||
                (Math.abs(mul - n) < 0.00001))//-
            return mid;

            // If mul is less than n,
            // recur second half
        else if (mul < n)//20.25<23
            return Square(n, mid, j);//23,4.75,5

            // Else recur first half
        else
            return Square(n, i, mid);//23,4.75,4.875
    }

    // Function to find the square root of n
    static void findSqrt(double n)
    {
        double i = 1;

        // While the square root is not found
        boolean found = false;
        while (!found)
        {

            // If n is a perfect square
            if (i * i == n)//
            {
                System.out.println(i);
                found = true;
            }

            else if (i * i > n)
            {

                // Square root will lie in the
                // interval i-1 and i
                double res = Square(n, i - 1, i);
                System.out.printf("%.5f", res);
                found = true;
            }
            i++;
        }
    }

}
