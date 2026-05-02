import java.io.*;

class StringEquality {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter First String: ");
        String s1 = br.readLine();

        System.out.print("Enter Second String: ");
        String s2 = br.readLine();

        boolean result = s1.equals(s2);

        System.out.println(result);
    }
}
