import java.util.*;

class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        int num2 = num1 * num1;

        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= num1; j++) {
                System.out.print(num2 + " ");
                num2--;
            }
            System.out.println();
        }
    }
}
