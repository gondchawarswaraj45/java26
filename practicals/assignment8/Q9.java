import java.util.*;

class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num; j++) {

                int val;

                if (i % 2 == 1) {
                    val = num - j + 1;   
                } else {
                    val = j;           
                }

                if (j % 2 == 1) {
                    
                    char ch = (char) ('A' + val - 1);
                    System.out.print(ch + " ");
                } else {
                    
                    System.out.print(val + " ");
                }

            }

            System.out.println();
        }
    }
}
