class Demo{

	int x = 10;
	static int y = 20;

        public static void main(String[] args){

		Demo obj1 = new Demo();
		System.out.println(obj1.x);
		System.out.println(obj2.y);

		Demo obj2 = new Demo();
		System.out.println(obj2.x);
		System.out.println(obj2.y);

		obj2.x = 50;
		obj2.y = 60;

		System.out.println(obj1.x);
                System.out.println(obj1.y);
		System.out.println(obj2.x);
		System.out.println(obj2.y);
        }
}
