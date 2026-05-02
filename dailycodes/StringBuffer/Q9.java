import java.io.*;

class BRDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size:");
        int size = Integer.parseInt(br.readLine());

        String friendName[] = new String[size];

        System.out.println("Enter friend names:");

        for (int i = 0; i < size; i++) {
            friendName[i] = br.readLine();
        }

        System.out.println("Friend names are:");

        for (int i = 0; i < size; i++) {
            System.out.println(friendName[i]);
        }
    }
}
