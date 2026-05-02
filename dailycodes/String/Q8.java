class StringDemo {
    public static void main(String[] args) {

        String str1 = "Datta";                 // SCP
        String str2 = new String("Datta");     // Heap

        System.out.println(str1 == str2);          // false
        System.out.println(str1.equals(str2));     // true
    }
}
