class Demo {

	int x =10;

	Demo() {
	
		System.out.println("Demo Constructor");
	}

	void fun() {
	
		System.out.println("In fun Demo");
		System.out.println(x);
	}
}

class Memo {

	Memo(Demo obj){
	
		System.out.println("Para Memo Constructor");
		System.out.println(obj.x);
		obj.fun();
	}
}

class Temo {

	public static void main(String[] args){
	
		Demo obj1 = new Demo();
		Memo obj3 = new Memo(obj1);
	}
}
