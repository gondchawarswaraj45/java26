class StringDemo {
    public static void main(String[] args) {

        String str1 = "Rahul";                 // SCP
        String str2 = new String("Rahul");     // Heap (new object)

        String str3 = str1 + "Piche";          // Heap

        str2 = str2 + "Aunch";                 // Heap (new object)
        str1 = str1 + "Modern";                // Heap (new object)

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
