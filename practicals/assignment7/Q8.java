import java.util.*;
class Q8{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter day : ");
                int num1 = sc.nextInt();
                
                System.out.println();
                if(num1>=0){
                        while(num1>0 ){
				
                                System.out.println(num1+"days remaining ");
				num1--;
                        }
			System.out.println("0 days Assignment is Overdue");

                }  else
                        System.out.println("Enter vaild input");

                System.out.println();
        }
}
