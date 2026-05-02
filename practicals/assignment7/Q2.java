import java.util.*;
class Q2{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the Two digit number : ");
                int A = sc.nextInt();
		int num2 = A + 100;
                System.out.println();
                if(A>=0){
			for(int i = 100 ; i< num2 ; i++){
			
				System.out.print(i+" ");
			}
                    
                }  else
                        System.out.println("Enter vaild input");

                System.out.println();
        }
}
