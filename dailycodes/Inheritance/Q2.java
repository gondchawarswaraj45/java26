class Demo {

	int x = 10;
	static int y = 20;

	Demo() {
	
		System.out.println("Demo Constructor");
	}
	void fun() {
	
		System.out.println("In fun Demo");
	}
	static void gun() {
	
		System.out.println("In gun Demo");
	}
}

class Memo {

	public static void main(String[] args){
	
		System.out.println(Demo.y);
		Demo.gun();
	}
}
