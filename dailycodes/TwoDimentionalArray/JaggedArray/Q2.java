class JADemo {
    public static void main(String[] args) {

        int arr[][] = new int[3][];

        arr[0] = new int[3];  // row 0 → 3 columns
        arr[1] = new int[1];  // row 1 → 1 column
        arr[2] = new int[2];  // row 2 → 2 columns

        // Assign values
        arr[0][0] = 10; arr[0][1] = 20; arr[0][2] = 30;
        arr[1][0] = 40;
        arr[2][0] = 50; arr[2][1] = 60;

        // Print
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
