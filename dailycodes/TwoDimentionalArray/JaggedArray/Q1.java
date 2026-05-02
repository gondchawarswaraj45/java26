import java.util.*;

class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row and column size:");
        int rowSize = sc.nextInt();
        int colSize = sc.nextInt();

        int arr[][] = new int[rowSize][colSize];

        System.out.println("Enter array data:");

        // Input
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Output
        System.out.println("Array elements:");
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
