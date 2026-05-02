class Demo{

	Demo(){
	
		System.out.println(this);
		System.out.println("In Constructor");
	}
	void fun(){
	
		System.out.println(this);
		System.out.println("In Fun");

	}

        public static void main(String[] args){

		Demo obj = new Demo();
		//Memory allocation
		//Demo (obj)
		obj.fun();

                System.out.println(obj);
        }
}
