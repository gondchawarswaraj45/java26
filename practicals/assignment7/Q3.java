import java.util.*;
class Q3{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the number : ");
                int A = sc.nextInt();

                System.out.println();
                if(A>=0){

                        for(int i = 1 ; i<=A ; i++){
				if(i%2==0)
                                System.out.print(i+" ");
                        }
                }  else
                        System.out.println("Enter vaild input");

                System.out.println();
        }
}
