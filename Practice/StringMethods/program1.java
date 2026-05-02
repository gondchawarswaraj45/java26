import java.util.*;

class RevStr{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the String : ");
		String str = sc.nextLine();

		StringBuffer sb = new StringBuffer( str);

		sb = sb.reverse();

		str = sb.toString();

		System.out.println("Your Reversed String : "+str);
	}
}

