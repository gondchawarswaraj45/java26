import java.util.*;
class Q10{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter Range from : ");
                int num1 = sc.nextInt();
		System.out.print("Enter Range to : ");
                int num2 = sc.nextInt();
                System.out.println();
		if(num2>num1){
 		
			for(int i = num2 ; i >= num1 ; i--){
				if(i%4==0 && i%5==0){	
				System.out.print(i + " ");
				}
			}
		}
		else{
		
                        for(int i = num1 ; i >= num2 ; i--){
				if(i%4==0 && i%5==0){
                                System.out.print(i + " ");
				}
                        }
                

		}
                System.out.println();
        }
}
