import java.io.*;

class StringDemo {
    public static void main(String[] args) {

        String str1 = "kanha";          // SCP
        String str2 = "kale";           // SCP

        String str3 = "kanhakale";      // SCP

        String str4 = str1 + str2;      // Heap (runtime)
        String str5 = str1 + "kale";    // Heap (runtime)
        String str6 = "kanha" + str2;   // Heap (runtime)
        String str7 = "kanha" + "kale"; // SCP (compile-time)

        // Print values
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);
        System.out.println("str5: " + str5);
        System.out.println("str6: " + str6);
        System.out.println("str7: " + str7);

        System.out.println();

        // Reference comparison
        System.out.println("str3 == str4: " + (str3 == str4)); // false
        System.out.println("str3 == str7: " + (str3 == str7)); // true

        System.out.println();

        // Identity Hash Codes (to see memory difference)
        System.out.println("str3 hash: " + System.identityHashCode(str3));
        System.out.println("str4 hash: " + System.identityHashCode(str4));
        System.out.println("str7 hash: " + System.identityHashCode(str7));
    }
}
