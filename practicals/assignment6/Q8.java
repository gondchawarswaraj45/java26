import java.util.*;

class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting character:");
        char start = sc.next().charAt(0);

        System.out.println("Enter ending character:");
        char end = sc.next().charAt(0);

        char ch = start;

        while (ch <= end) {

            if (ch!='A' && ch!='E' && ch!='I' &&
                ch!='O' && ch!='U' &&
                ch!='a' && ch!='e' && ch!='i' &&
                ch!='o' && ch!='u') {

                System.out.print(ch + " ");
            }

            ch++;
        }
    }
}
