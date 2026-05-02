import java.io.*;

class UsernameLength {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Username: ");
        String username = br.readLine();

        System.out.println("Username length: " + username.length());
    }
}
