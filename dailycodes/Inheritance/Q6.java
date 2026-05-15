class EvenOdd{

	void evenOdd(int x){
	
		if(x%2 == 0){
		
			System.out.println(x + "is even");
		}
		else
			System.out.println(x + "is odd");
	}

	public static void main(String[] args){
	
		int num = 12;
		EvenOdd obj = new EvenOdd();

		obj.evenOdd(num);
	}
}
