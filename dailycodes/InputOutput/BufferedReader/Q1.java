import java.io.*;

class IODemo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name:");
        String name = br.readLine();
        System.out.println("Name: " + name);

        System.out.println("Enter your age:");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Enter your salary:");
        double sal = Double.parseDouble(br.readLine());

        System.out.println("Salary: " + sal);
        System.out.println("Age: " + age);

        // Character input
        System.out.println("Enter a character:");
        char ch = (char) br.read();

        br.skip(1); // skip newline

        System.out.println("Character: " + ch);
    }
}
