class Demo {
    public static void main(String[] args) {

        // Declaration
        int arr[];

        // Creation
        arr = new int[3];

        // Initialization (method 1)
        int arr1[] = {10, 20, 30, 40, 50};

        // Initialization (method 2)
        int arr2[] = new int[]{10, 20, 30, 40, 50};

        // Only creation (default values = 0)
        int arr3[] = new int[5];

        // Printing default values
        for(int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
