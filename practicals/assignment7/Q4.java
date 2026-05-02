import java.util.*;
class Q4{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the Whole number : ");
                int A = sc.nextInt();

                System.out.println();
                if(A>=0){

                        for(int i = 1 ; i<=10 ; i++){
				
                                System.out.print((A*i)+" ");
                        }
                }  else
                        System.out.println("Enter vaild input");

                System.out.println();
        }
}
