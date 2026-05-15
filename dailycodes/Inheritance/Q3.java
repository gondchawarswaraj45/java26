class Demo {

	int x = 10;

	Demo() {
	
		System.out.println("In Demo Constructor");
	}

	void fun() {
	
		System.out.println("In fun Demo");
		System.out.println(x);
	}
}

class Memo {

	Memo() {
	
		System.out.println("No arg -  Memo Constructor");
	}
	Memo(Demo obj){
	
		Syatem.out.println("Para Memo Constructor");

	}
}

class Temo {

	public static void main(String[] args){
	
		Demo obj1 = new Demo();

		Memo obj2 = new Memo();

		Memo obj3 = new Memo(obj1);
	}
}
