import java.util.*;

class StringMethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

 	System.out.print("Enter a string: ");
        
	String str = sc.nextLine();

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        
	System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Trim: " + str.trim());

        System.out.print("Enter substring to check: ");
        
	String sub = sc.nextLine();
        System.out.println("Contains: " + str.contains(sub));

        System.out.println("Replace a with @: " + str.replace('a', '@'));

        System.out.print("Enter start index: ");
        int s = sc.nextInt();
        System.out.print("Enter end index: ");
        int e = sc.nextInt();
        System.out.println("Substring: " + str.substring(s, e));

        System.out.println("Split words:");
        String[] words = str.split(" ");
        for(String w : words) {
            System.out.println(w);
        }

        String joined = String.join("-", words);
        System.out.println("Joined: " + joined);

        System.out.print("Enter another string: ");
        sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("Concat: " + str.concat(str2));

        System.out.println("Replace first word: " + str.replaceFirst(words[0], "FIRST"));
    }
}
