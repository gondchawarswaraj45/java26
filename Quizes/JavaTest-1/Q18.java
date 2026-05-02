class DoWhileDemo{

	public static void main(String[] args){
	
		int choice = 0;

		do{
		
			System.out.println("1 : CPP");
			System.out.println("2 : JAVA");
			System.out.println("3 : OS");
			System.out.println("4 : DSA");
			System.out.println("5 : C ");
		
		
			choice = 4;
			if(choice==1){
			System.out.println("CPP Selected");
			}
			else if(choice==2){
                        System.out.println(" JAVA Selected");
                        }
			else if(choice==3){
                        System.out.println("OS Selected");
                        }
			else if(choice==4){
                        System.out.println("DSA Selected");
                        }
			else if(choice==5){
                        System.out.println("C Selected");
                        }
			else{
                        System.out.println("Invaild choice");
                        }
		}while(choice==0);

	}
}
