import java.util.*;

class EvenNo{

	static void evenNo(int x){
	
		if(x%2==0){	
			System.out.println(x);
		}
	}
	static void oddNo(int y){
		if(y%2!=0){
			System.out.println(y);
		}

	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		evenNo(num);
		oddNo(num);

	}
}
