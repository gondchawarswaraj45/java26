import java.util.*;

class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter percentage:");
        double per = sc.nextDouble();

        if (per > 85) {
            System.out.println("Medical");
        }
        else if (per <= 85 && per > 75) {
            System.out.println("Engineering");
        }
        else if (per <= 75 && per > 65) {
            System.out.println("Pharmacy or BSc");
        }
        else {
            System.out.println("Other field");
        }
    }
}
