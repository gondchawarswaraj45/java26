class StringDemo {
    public static void main(String[] args) {

        String str1 = "kanha";
        String str2 = "kale";
        String str3 = "kanhakale";

        String str4 = str1 + str2;

        System.out.println(str4);

        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }
}
