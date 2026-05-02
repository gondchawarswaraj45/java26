// Reverse String using StringBuffer


import java.util.*;

class StrReve{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your String : ");
		StringBuffer str = new StringBuffer(sc.nextLine());
		int num1 = str.length() - 1;
		
		System.out.print("Your Reversed String : " + str.reverse());
		
		System.out.println();
	}
}
