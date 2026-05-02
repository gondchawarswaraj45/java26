import java.io.*;

class IODemo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Enter number, character, string and float:");

        int num1 = Integer.parseInt(br.readLine());

        char ch1 = br.readLine().charAt(0);

        String st = br.readLine();

        float num2 = Float.parseFloat(br.readLine());

        System.out.println(num1);
        System.out.println(ch1);
        System.out.println(st);
        System.out.println(num2);
    }
}
