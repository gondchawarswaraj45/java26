class Demo {

        public static void main(String[] args){

                double amount = 6000;
		boolean isMember = true;

                if(amount >=5000){
			
			if(isMember){
			
				 System.out.println("You get 20% discount ");
			}
			else{
			
				 System.out.println("You get 10% discount ");
			}

                }
                else {               
                 	if(isMember){

                        System.out.println("You get 5% discount");
                }
                 else {

                        System.out.println("No Discount");
                }
        }
}
}
