class Demo{

	void fun(float x , float y){
	
		System.ou.println(x);
		System.out.println(y);
	}
        public static void main(String[] args){

		Demo obj = new Demo();

		obj.fun(10 , 20);
		obj.fun(10.5f, 20.5f);
		obj.fun(10.5 , 20.5);
                System.out.println();
        }
}
