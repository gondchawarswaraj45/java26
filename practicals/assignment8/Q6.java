import java.util.*;

class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            if (i % 2 == 1) {
                
                for (int j = num ; j >= 1; j--) {
                    char ch = (char) ('A' + j - 1);
                    System.out.print(ch + " ");
                }
            } else {
                
                for (int j = 1; j <= num ; j++) {
                    char ch = (char) ('A' + j - 1);
                    System.out.print(ch + " ");
                }
            }

            System.out.println();
        }
    }
}
