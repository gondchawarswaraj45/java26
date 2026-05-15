class Demo{

	int x = 10;
		Demo() {
			System.out.println("Demo Constructor");
		}

		void fun() {
			System.out.println("In fun - Demo");
		}
}

class Memo {

	int x = 10;
	Memo() {
		System.out.println("Memo - Constructor");
	}

	void fun () {
	
		System.out.println("In fun - Memo");
	}

	public static void main (String[] args){
	
		System.out.println("Start Main");

		Demo obj1 = new Demo();

		obj1.fun();
		
		Memo obj2 = new Memo();

		obj2.fun();
		System.out.println("End Main");
	}

}
