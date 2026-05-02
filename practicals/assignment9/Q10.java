import java.io.*;

class ArrayMultiply {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Size of Array: ");
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element " + i + ": ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Elements after multiplying by 2:");
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * 2;
            System.out.println(arr[i]);
        }
    }
}
