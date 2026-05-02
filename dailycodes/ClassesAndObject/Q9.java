class Demo{

	int x = 10;
	String str = "Kanha";
	void fun(){
	
		System.out.println("In fun method ");
	}
	void gun(){
	
		System.out.println("In gun method");
	}
        public static void main(String[] args){

		int y = 20;
		String name = "Kanha";
		String str2 = new String("Kanha");
		Demo obj = new Demo();
		obj.fun();
		obj.gun();
        }
}
