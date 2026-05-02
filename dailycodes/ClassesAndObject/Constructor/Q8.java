class Demo{

	int x = 10;
	Demo(){
	
		System.out.println("No Arg Constructor");
	}
	Demo(int x){
	
		System.out.println("Parameter Constructor");

	}

        public static void main(String[] args){

		Demo obj1 = new Demo();
		Demo obj2 = new Demo();
		
        }
}
