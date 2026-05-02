import java.io.*;

class Demo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter no. of rows: ");
        int row = Integer.parseInt(br.readLine());

        char ch = (char)(96 + row);   // 3 → 'c'

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= row; j++) {
                System.out.print(ch + " ");
            }

            System.out.println();
            ch--;   // move to previous character
        }
    }
}
