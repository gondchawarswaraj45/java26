import java.util.*;

class StringMethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.println("Using trim()");
        System.out.println(str.trim());

        System.out.println("Using intern()");
        System.out.println(new String(str.trim()).intern());

        System.out.println("Using toString()");
        System.out.println(str.toString());

        System.out.println("Using contains()");
        System.out.println(str.contains(words));

        System.out.print("Enter character to replace: ");
        char oldChar = sc.next().charAt(0);
        System.out.print("Enter new character: ");
        char newChar = sc.next().charAt(0);
        System.out.println("Using replace()");
        System.out.println(str.replace(oldChar, newChar));

        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        System.out.println("Using substring()");
        System.out.println(str.substring(start, end));

        sc.nextLine();
        System.out.print("Enter another string: ");
        String str2 = sc.nextLine();
        System.out.println("Using concat()");
        System.out.println(str.concat(str2));

        System.out.println("Using split()");
        String[] words = str.split(" ");
        for (String w : words) {
            System.out.println(w);
        }

        System.out.println("Using join()");
        System.out.println(String.join("-", words));
    }
}
