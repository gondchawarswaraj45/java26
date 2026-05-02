class StringDemo {
    public static void main(String[] args) {

        String s1 = new String("a");
        String s2 = new String("b");

        String s3 = s1 + s2;      // "ab" (heap)
        String s4 = s3 + "c";     // "abc" (heap)

        String s5 = s4.intern();  // reference from SCP
        String s6 = "abc";        // SCP

        System.out.println(s4 == s6.intern());
        System.out.println(s5 == s6);
    }
}
