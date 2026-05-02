class Demo{

	int x;
	int y;
	Demo(){
	
		System.out.println("No Arg Constructor");
	}
	Demo(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("Para constructor");
	}
        public static void main(String[] args){

		Demo obj1 = new Demo();
		System.out.println(obj1.x);
                System.out.println(obj1.y);

		Demo obj2 = new Demo(50,100);
		System.out.println(obj2.x);
		System.out.println(obj2.y);
        }
}
