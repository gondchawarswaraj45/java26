class SwitchDemo{

        public static void main(String[] args){

                char choice= 'a';
                switch(choice) {

                        case 'a' :
                                System.out.println("Choice is : a");
                                continue;
                        case 'b' :
                                System.out.println("Choice is : b");
                                break;
			case 'c' :
                                System.out.println("Choice is : c");
                                break;
			case 'd' :
                                System.out.println("Choice is : d");
                                break;
                        default:

                                System.out.println("Default");


                }
        }
}
