class Demo{

	int x = 10;
	int y = 20;
	Demo(){
	
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println("In Constructor"):
	}
	void fun(){
	
		System.out.println(x);
		System.out.println(y);
		System.out.println("In fun");
	}

        public static void main(String[] args){

		Demo obj = new Demo();
		obj.fun();
        }
}
