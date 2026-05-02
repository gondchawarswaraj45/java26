class Demo{

	void fun(long x , long y) {
	
		System.out.println(x);
		System.out.println(y);
	}
        public static void main(String[] args){

		Demo obj = new Demo();
		obj.fun('A' , 'B');
		obj.fun(10 , 20);
		obj.fun(10.5f , 20.5f);
		obj.fun(10.5 , 20.5);
        }
}
