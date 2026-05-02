class Demo{

	int x = 10;

	Demo() {
	
		System.out.println("In Constructor");
	}

        public static void main(String[] args){

		Demo obj1 = new Demo();
		Demo obj2 = new Demo();
		System.out.println(obj1.x);
		System.out.println(obj2.x);

		obj1.x = 30;
		System.out.println(obj1.x);
		System.out.println(obj2.x);
		
        }
}
