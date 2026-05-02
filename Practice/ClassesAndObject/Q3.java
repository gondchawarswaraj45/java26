import java.util.Scanner;

class Interest {

    void calculateSI(double pri, double rate, double time) {
        double sint = (pri * rate * time) / 100;
        System.out.println("Simple Interest = " + sint);
    }

    static void displayDetails(double pri, double rate, double time) {
        System.out.println("Principal = " + pri);
        System.out.println("Rate = " + rate);
        System.out.println("Time = " + time);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal : " );
	double pri = sc.nextDouble();
	System.out.println("Enter Rate  : " );
        double rate = sc.nextDouble();
	System.out.println("Enter Time : " );
        double time = sc.nextDouble();

        Interest obj = new Interest();

        displayDetails(pri, rate, time);
        obj.calculateSI(pri, rate, time);
    }
}
