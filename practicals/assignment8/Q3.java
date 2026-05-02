import java.util.*;

class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            char ch;
            if (i % 3 == 1)
                ch = '#';
            else if (i % 3 == 2)
                ch = '@';
            else
                ch = '$';

            for (int j = 1; j <= num ; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
