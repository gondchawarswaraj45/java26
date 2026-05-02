import java.util.*;

class ArrayDemo{

        public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
                int[] arr = new int[size];
		for( int i = 0 ; i < 5 ; i++ ){
		
			System.out.println(arr[i]);
		}
		                
        }

}
