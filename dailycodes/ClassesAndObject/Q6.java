class Demo{

        int a = 10;
       String name = "Kanha";	
	public static void main(String[] args){

		int x = 10;
		String str = "Kanha";
		Demo obj = new Demo();
		System.out.println(System.identityHashCode(str));
                System.out.println(System.identityHashCode(obj.name));
        }
}
