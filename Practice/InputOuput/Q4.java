import java.util.*;

class Demo4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch1 = sc.next().charAt(0);

        if (ch1 >= 'a' && ch1 <= 'z') {
            System.out.println(ch1 + " is lowercase");
        } 
        else if (ch1 >= 'A' && ch1 <= 'Z') {
            System.out.println(ch1 + " is uppercase");
        } 
        else {
            System.out.println("Invalid character");
        }
    }
}
