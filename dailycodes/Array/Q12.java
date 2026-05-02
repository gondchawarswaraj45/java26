import java.io.*;

class Demo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int row = Integer.parseInt(br.readLine());

        char ch = (char)(96 + row);   // e.g. 3 → 'c'

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= row; j++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}
