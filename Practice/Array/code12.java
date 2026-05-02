import java.io.*;

class ArrayDemo{

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter array size");
                int size = Integer.parseInt(br.readLine());
                int arr[] = new int[size];
		System.out.println("Every array elements : ");
		for(int i=0 ; i<size ; i++){
		
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("array elements :");
		for( int i = 0  ; i < size ; i++ ){
		
			System.out.println(arr[i]);
		}
        }

}
