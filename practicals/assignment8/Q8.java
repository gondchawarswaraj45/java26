import java.util.*;

class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num; j++) {

                char ch;
                int num1;

                if (i % 2 == 1) {
                    ch = (char) ('A' + (num - j));
                    num1 = j;
                } else {
                    ch = (char) ('A' + (j - 1));
                    num1 = num - j + 1;
                }

                System.out.print(ch + "" + num1 + " ");
            }

            System.out.println();
        }
    }
}
