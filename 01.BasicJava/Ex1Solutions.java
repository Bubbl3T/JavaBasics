public class Ex1Solutions {
    
    public static void main(String[] args) {
        {
            // Q1 Given an integer n, print out the sum of 1 to n.
            int n = 10;
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
        {
            // Alternative solution
            int n = 10;
            System.out.println(n * (n + 1) / 2);
        }
        {
            // Q2 Given an integer n, print numbers from 1 to 10 that are NOT equal to n.
            int n = 3;
            for (int i = 1; i <= 10; i++) {
                if (i != n) {
                    System.out.println(i);
                }
            }
        }
        {
            // Q3 Complete the while loop so that it terminates when i == 3.
            int i = 10;
            while (true) {
                if (i == 3) {
                    break;
                }
                System.out.printf("Current i = %d\n", i);
                i--;
            }
        }
    }

}
