import java.io.*;

class ForDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Enter number of rows:");
        int row = Integer.parseInt(br.readLine());

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= row; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
