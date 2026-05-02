import java.util.*;

class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a*a + b*b == c*c || 
            a*a + c*c == b*b || 
            b*b + c*c == a*a) {

            System.out.println("It is a Pythagorean triplet");
        } else {
            System.out.println("Not a Pythagorean triplet");
        }
    }
}
