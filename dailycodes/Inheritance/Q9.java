import java.util.*;

class Demo{

        static void gcd(int x, int y){

                int min;

                if(x > y)
                        min = y;
                else
                        min = x;

                for(int i = min ; i >= 1 ; i--){

                        if(x % i == 0 && y % i == 0){

                                System.out.println("GCD = " + i);
                                break;
                        }
                }
        }

        static void lcm(int x, int y){

                int max;

                if(x > y)
                        max = x;
                else
                        max = y;

                while(true){

                        if(max % x == 0 && max % y == 0){

                                System.out.println("LCM = " + max);
                                break;
                        }

                        max++;
                }
        }

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Choice 1 for GCD");
                System.out.println("Choice 2 for LCM");

                System.out.print("Enter a Choice : ");
                int choice = sc.nextInt();

                System.out.print("Enter 1st number : ");
                int num1 = sc.nextInt();
                System.out.print("Enter 2nd number : ");
                int num2 = sc.nextInt();

                switch(choice){

                        case 1:
                                Demo.gcd(num1, num2);
                                break;

                        case 2:
                                Demo.lcm(num1, num2);
                                break;

                        default:
                                System.out.println("Invalid Choice");
                }

        }
}
