public class Ex2Solutions {
    
    public static void main(String[] args) {
        {
            // Q1: Fill in the code so that the for loops stops after printing 3.

            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                if (i == 3) {
                    break;
                }
            }
        }
        {
            // Q2: Print the integer coordinates from (0, 0) to (x, y) (inclusive).
            // An example has been given below to print (a, b):
            // int a = 2;
            // int b = 7;
            // System.out.printf("(%d, %d)\n", a,b);

            int x = 3;
            int y = 4;
            for (int i = 0; i <= x; i++) {
                for (int j = 0; j <= y; j++) {
                    System.out.printf("(%d,%d)\n", i, j);
                }
            }

            // Alternative solution that looks better
            for (int j = y; j >= 0; j--) {
                for (int i = 0; i <= x; i++) {
                    System.out.printf("(%d,%d)", i, j);
                }
                System.out.println();
            }
        }
        {
            // Q3a: Given n, create an array with values 0 to n-1

            int n = 10;
            int[] array1 = new int[n];
            for(int i = 0; i < n; i++) {
                array1[i] = i;
            }

            // Check
            for(int i = 0; i < n; i++) {
                System.out.printf("%d ", array1[i]);
            }
            System.out.println();

            // Q3b: Create another array with values 1 to n

            int[] array2 = new int[n];
            for(int i = 0; i < n; i++) {
                array2[i] = i + 1;
            }

            // Check
            for(int i = 0; i < n; i++) {
                System.out.printf("%d ", array2[i]);
            }
            System.out.println();
        }
        {
            // (Homework) Q4: Construct a matrix with i rows and j columns, with each entry
            // being the sum of its column index and row index.
            // i.e. A 2 by 3 matrix should look like this:
            // [[0, 1, 2],
            //  [1, 2, 3]]

            int i = 6;
            int j = 8;
            int[][] array = new int[i][j];
            for (int a = 0; a < i; a++) {
                for (int b = 0; b < j; b++) {
                    array[a][b] = a + b;
                }
            }

            // Check
            for (int a = 0; a < i; a++) {
                System.out.println();
                for (int b = 0; b < j; b++) {
                    System.out.printf("%2d ", array[a][b]);
                }
            }
        }
    }

}
