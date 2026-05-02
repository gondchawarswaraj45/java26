class Demo{

	int x;
	int y;
	Demo(){
	
		this(50,100);
		System.out.println("No arg Constructor");
		System.out.println(x);
		System.out.println(y);

		
	}
	Demo(int x, int y){
	
		this.x = x;
		this.y = y;
		System.out.println("Parameter Construntor");
	}
        public static void main(String[] args){

		Demo obj = new Demo();
        }
}
