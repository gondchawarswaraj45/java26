import java.util.*;

class Demo12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int A = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int B = sc.nextInt();

        System.out.print("Enter 3rd number: ");
        int C = sc.nextInt();

        if ((A*A == B*B + C*C) || 
            (B*B == A*A + C*C) || 
            (C*C == A*A + B*B)) {

            System.out.println("It is a Pythagorean Triplet");
        } 
        else {
            System.out.println("It is NOT a Pythagorean Triplet");
        }
    }
}
