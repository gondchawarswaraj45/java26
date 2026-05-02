import java.util.*;

class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {   

            for (int j = 1; j <= num; j++) {   

                int sum = num - j + 1;

                if (j % 2 == 1) {
                    char ch = (char) ('A' + sum - 1);
                    System.out.print(ch + " ");
                } else {
                    
                    System.out.print(sum + " ");
                }

            }

            System.out.println();
        }
    }
}
