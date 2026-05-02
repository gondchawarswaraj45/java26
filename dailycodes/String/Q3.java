class StringDemo {
    public static void main(String[] args) {

        String str1 = "Kanha";
        String str2 = "Kanha";

        String str3 = "Ashish";
        String str4 = "Ashish";

        // identity hash code (to check reference)
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

        System.out.println(str1 == str2);  // true
        System.out.println(str3 == str4);  // true
    }
}
