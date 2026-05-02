import java.util.*;
class Q6{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the Two digit number : ");
                int A = sc.nextInt();
                int num2 = A + 100;
                System.out.println();
		int i = 100;
                if(A>=0){
                        while( i < num2 ){

                                System.out.print(i+" ");
                        	i++;
			}

                }  else
                        System.out.println("Enter vaild input");

                System.out.println();
        }
}
