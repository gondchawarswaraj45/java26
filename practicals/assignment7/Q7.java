import java.util.*;
class Q7{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter Range from : ");
                int num1 = sc.nextInt();
		System.out.println();
		System.out.print("Enter Range to : ");
                int num2 = sc.nextInt();
                System.out.println();
		int i = num1;
                while( i<=num2 ){
		
			if(i%4==0 || i%7==0){
			
				System.out.print(i +" ");
			}
			i++;

		}
		

                System.out.println();
        }
}
