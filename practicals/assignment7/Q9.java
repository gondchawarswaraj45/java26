import java.util.*;
class Q9{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the number : ");
                int num1 = sc.nextInt();
                int i=1;
                System.out.println();
                if(num1>=0){
                        while(i<=num1 ){

                                System.out.print(i*i*i+" ");
				i++;
                        }

                }  else
                        System.out.println("Enter vaild input");

                System.out.println();
        }
}
