import java.util.*;

class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = num ; i >= 1; i--) {
		int sum = num - i;


           	 for (int j = 1; j <= num; j++) {

                if (sum % 2 == 0) {
                    char ch = (char) ('A' + i - 1);
                    System.out.print(ch + " ");
                } else {
                    System.out.print(i + " ");
                }

            }
            System.out.println();
        }
    }
}
