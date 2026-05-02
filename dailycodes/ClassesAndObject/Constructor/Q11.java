import java.util.*;

class Demo{

	int x;
	int y;
	Demo(int x, int y){
	
		this.x = x;
		this.y = y;
		System.out.println("In Constrctor");
	}
        public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
                System.out.println("Enter Values");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		Demo obj1 = new Demo(num1 , num2);

		System.out.println(obj1.x);
		System.out.println(obj1.y);
        }
}
