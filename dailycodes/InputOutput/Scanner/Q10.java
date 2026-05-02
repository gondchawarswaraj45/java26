import java.util.*;

class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);

        // check lowercase
        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("character is vowel");
            } else {
                System.out.println("character is consonant");
            }

        }
        // check uppercase
        else if (ch >= 'A' && ch <= 'Z') {

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("character is vowel");
            } else {
                System.out.println("character is consonant");
            }

        }
        // invalid
        else {
            System.out.println("Invalid character");
        }
    }
}
