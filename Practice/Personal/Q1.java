// Reverse String



import java.util.*;

class StrRev{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your String : ");
		String str = sc.nextLine();
		int num1 = str.length() - 1;
		System.out.print("Your Reversed String : ");
		for( int j = num1 ; j >= 0 ; j-- ){
			
		System.out.print(str.charAt(j));

		}

		System.out.println();

	}
}
