import java.io.*;

class Demo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter no. of rows: ");
        int row = Integer.parseInt(br.readLine());

        for (int i = 1; i <= row; i++) {

            int num = i;

            for (int j = 1; j <= row; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
}
