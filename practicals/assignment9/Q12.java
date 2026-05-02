import java.io.*;

class CharAtPosition {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter String: ");
        String str = br.readLine();

        System.out.print("Enter Index: ");
        int index = Integer.parseInt(br.readLine());

        char ch = str.charAt(index);

        System.out.println("Character at index " + index + ": " + ch);
    }
}
