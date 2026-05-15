import java.util.*;

class Demo{

	static void gcd(int x, int y){
	
		if(x>y){
		
			for(int i=y ; i>=1 ; i--){
			
				if(y%i == 0 && x%i==0){
				
					System.out.println(i);
					break;
				}
			}
		}

		else{
		
			for(int i = x ; i>=1 ; i--){
			
				if(x%i == 0 && y%i == 0){
				
					System.out.println(i);
					break;
				}
			}
		}
	}

	static void lcm(int x, int y){
	
		int num = 0;

		if(x>y)
			num = y;
		else
			num = x;

		for(int i = 2 ; i<=num ; i++){
		
			if(x%i == 0 && y%i == 0){
			
				System.out.println(i);
				break;
			}
		}
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Choice 1 for GCD");
		System.out.println("Choice 2 for LCM");

		System.out.println("Enter a Choice : ");

		int choice = sc.nextInt();

		System.out.println("Enter Two numbers : ");
		int num1 = sc.nextInt();

		int num2 = sc.nextInt();

		switch(choice){
			case 1:
				Demo.gcd(num1 , num2);
				break;
			case 2:
				Demo.lcm(num1 , num2);
				break;
		}

	}
}
