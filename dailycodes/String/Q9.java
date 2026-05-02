class Demo {
    public static void main(String[] args) {

        String str1 = "Ashish";     // SCP
        String str2 = "Khare";      // SCP

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        String str3 = new String("Ashish"); // Heap

        System.out.println(System.identityHashCode(str3));

        str3 = str3.intern(); // move reference to SCP

        System.out.println(System.identityHashCode(str3));
    }
}
