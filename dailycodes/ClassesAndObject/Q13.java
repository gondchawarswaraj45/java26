import java.util.*;


class Demo{

	void fun(int x , int y){
	
		System.out.println("In fun");
		int val = x + y;
		System.out.println(val);
	}
        public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
                
		System.out.println("Enter values : ");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		Demo obj = new Demo();

		obj.fun(num1 , num2);
        }
}
