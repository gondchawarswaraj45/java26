import java.io.*;

class FirstOccurrence {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter String: ");
        String str = br.readLine();

        int index = str.indexOf('a'); 

        if (index != -1) {
            System.out.println("First occurrence of 'a' at index: " + index);
        } else {
            System.out.println("'a' not found in the string.");
        }
    }
}
