import java.io.*;

class UsernameCompare {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter First Username: ");
        String uName1 = br.readLine();

        System.out.print("Enter Second Username: ");
        String uName2 = br.readLine();

	char ch = 
        if (uName1.equalsIgnoreCase(uName2)) {
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }
}
