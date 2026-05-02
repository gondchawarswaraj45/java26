import java.io.*;

class FirstLastChar {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter File Name: ");
        String str = br.readLine();

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }
}
