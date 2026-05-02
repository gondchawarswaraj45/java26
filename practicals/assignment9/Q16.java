import java.io.*;

class StartsWithHello {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Message: ");
        String str = br.readLine();

        boolean result = str.startsWith("Hello");

        System.out.println(result);
    }
}
