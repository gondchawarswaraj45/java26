class Demo {
    public static void main(String[] args) {

        Integer x = 10;
        Integer y = 10;

        Integer a = new Integer(10);
        Integer b = new Integer(10);

        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
    }
}
