class StringDemo {
    public static void main(String[] args) {

        String s1 = "hello";

        String s2 = new String("hello");
        s2 = "hello";

        String s3 = "hello";

        System.out.println(s2 == s3);
        System.out.println(s2 == s1);
    }
}
