import java.io.*;

class Demo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter no. of rows: ");
        int row = Integer.parseInt(br.readLine());

	int num;
	char ch = (char)(64 + row);
	for (int i = 1; i <= row; i++) {
		num = 1;
            for (int j = 1; j <= row; j++) {
                System.out.print(""+ch + num + " ");
                num++;   // move to next character
            }

            	System.out.println();
       		ch--;
       	}
    }
}
