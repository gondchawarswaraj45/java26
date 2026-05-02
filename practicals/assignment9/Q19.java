import java.io.*;

class StringDifference {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter First String: ");
        String s1 = br.readLine();

        System.out.print("Enter Second String: ");
        String s2 = br.readLine();

        if (s1.equals(s2)) {
            System.out.println(0);
        } else {
            int minLen = Math.min(s1.length(), s2.length());
            int diff = 0;
            boolean found = false;

            for (int i = 0; i < minLen; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    diff = s1.charAt(i) - s2.charAt(i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                diff = s1.length() - s2.length();
            }

            System.out.println("Difference = " + diff);
        }
    }
}
