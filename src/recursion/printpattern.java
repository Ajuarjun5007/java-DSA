package recursion;

public class printpattern {

        static void printPattern(int n)
        {

            // Base case (When n becomes 0 or
            // negative)
            if (n == 0 || n < 0) {

                System.out.print(n + " ");

                return;
            }

            // First print decreasing order
            System.out.print(n + " ");

            printPattern(n - 5);

            // Then print increasing order
            System.out.print(n + " ");
        }

        // Driver code
        public static void main(String[] args)
        {

            int n = 16;

            // Function call
            printPattern(n);
        }
    }

