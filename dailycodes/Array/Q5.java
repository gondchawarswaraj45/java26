class CacheDemo {
    public static void main(String[] args) {

        Integer a = 10;
        Integer b = 10;

        System.out.println(a == b); // true (cached)

        Integer x = 300;
        Integer y = 300;

        System.out.println(x == y); // false (not cached)
    }
}
