class SBDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("shashi");

        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));

        sb.append("Bagal");
        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.append("Incubators");
        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.append("CZRD");
        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.trimToSize();
        System.out.println(sb.capacity());

        System.out.println(System.identityHashCode(sb));
    }
}
