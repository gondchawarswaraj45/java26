import java.io.*;

class ArrayPrint {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Size of Array: ");
        int num = Integer.parseInt(br.readLine());

        int[] arr = new int[num];

        for (int i = 0; i < num ; i++) {
            System.out.print("Enter Element " + i + ": ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Array Elements:");
        for (int i = 0; i < num ; i++) {
            System.out.print(arr[i] + " ");
        }
	System.out.println();
    }

}
