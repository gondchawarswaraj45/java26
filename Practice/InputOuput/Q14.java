class Demo14 {
    public static void main(String[] args) {

        char ch = 'a';

        while (ch <= 'z') {

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                System.out.println(ch);
            }

            ch++;
        }
    }
}
