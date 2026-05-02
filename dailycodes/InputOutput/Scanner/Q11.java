import java.util.*;

class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {

                System.out.println("character is vowel");
            } else {
                System.out.println("character is consonant");
            }

        } else {
            System.out.println("Invalid character");
        }
    }
}
