import java.util.*;

class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();   

        int cols = num; 

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= cols; j++) {

                if (j % 2 == 1)
                    System.out.print("# ");
                else
                    System.out.print("@ ");

            }
            System.out.println();
        }
    }
}
