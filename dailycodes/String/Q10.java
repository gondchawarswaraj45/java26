class ConcatDemo {
    public static void main(String[] args) {

        String str1 = "Ashish";   // SCP
        String str2 = "Khare";    // SCP

        // Before concat
        System.out.println("Before concat:");
        System.out.println("str1 = " + str1);
        System.out.println("Hash str1 = " + System.identityHashCode(str1));

        // concat operation
        str1 = str1.concat(str2);

        // After concat
        System.out.println("\nAfter concat:");
        System.out.println("str1 = " + str1);
        System.out.println("Hash str1 = " + System.identityHashCode(str1));
    }
}
