import java.util.*;

class Alpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                char ch = (char)('A' + n - 1);
                int num = n - 1;

                for (int j = 1; j <= n; j++) {
                    if (j % 2 != 0) {
                        System.out.print(ch + " ");
                        ch -= 2;
                    } else {
                        System.out.print(num + " ");
                        num -= 2;
                    }
                }
            }

            else {
                char ch = 'A';
                int num = 2;

                for (int j = 1; j <= n; j++) {
                    if (j % 2 != 0) {
                        System.out.print(ch + " ");
                        ch += 2;
                    } else {
                        System.out.print(num + " ");
                        num += 2;
                    }
                }
            }

            System.out.println();
        }

    }
}
