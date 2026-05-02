import java.io.*;

class StringConcat {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter First String: ");
        String s1 = br.readLine();

        System.out.print("Enter Second String: ");
        String s2 = br.readLine();

        String result = s1.concat(s2);

        System.out.println("Result: " + result);
        System.out.println("Length: " + result.length());
    }
}
