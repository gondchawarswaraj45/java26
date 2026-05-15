import java.util.Scanner;

class Demo {
    public static void main(String[] args) {

        System.out.println("Enter rows :");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        int num = (row * (row+1)/2);

        for (int i = 1; i <= row; i++) {

            for (int sp = 1; sp <= row - i; sp++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(num-- + "\t");
            }

            System.out.println();
	    num++;
	

	}
    }
}
