import java.io.*;

class TwoDArray {
    public static void main(String[] args) throws IOException {

        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < 3; i++) {          // rows
            for (int j = 0; j < 3; j++) {      // columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
