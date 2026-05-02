import java.util.*;
class Q1{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Whole number : ");
		int A = sc.nextInt();
		
		System.out.println();
		if(A>=0){
		
			for(int i = 0 ; i<=A ; i++){
			
				System.out.print(i+" ");
			}
		}  else 
			System.out.println("Enter vaild input");
		
		System.out.println();
	}
}
