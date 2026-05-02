import java.util.*;

class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int[] arr1 = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Array elements:");

        for (int i = 0; i < size; i++) {
            System.out.println(arr1[i]);
        }
    }
}
