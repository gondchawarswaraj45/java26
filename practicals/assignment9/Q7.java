import java.io.*;

class Voting {
    void checkEligibility(int age) {
        if (age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Age: ");
        int age = Integer.parseInt(br.readLine());

        Voting v = new Voting();
        v.checkEligibility(age);
    }
}
