import java.io.*;

class Demo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int row = Integer.parseInt(br.readLine());

        int num = row;   // start from row value

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= row; j++) {
                System.out.print(num + " ");
            }

            System.out.println();
            num--;   // decrease after each row
        }
    }
}
