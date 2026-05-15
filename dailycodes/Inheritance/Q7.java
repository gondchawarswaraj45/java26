import java.util.*;

class FactorNo{

	void factor(int x){
	
		for(int i = 1 ; i<=x ; i++){
		
			if(x%i == 0){
			
				System.out.println(i + " is factor of " + x);
			}
		}
		public static void main(String[] args){
		
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			FactorNo obj = new FactorNo();

			obj.factor(num);
		}
	}
}
