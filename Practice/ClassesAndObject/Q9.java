import java.util.*;

class polyDemo{

	void add(short x) {
	
		System.out.println("Short para");
	}

	void add(int x){
	
		System.out.println("Int para");
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		Demo obj1 = new Demo();


		System.out.print("Entter a number : ");
		short num = sc.nextShort();

		
		obj1.add(num);
	}
}
