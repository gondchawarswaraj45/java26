import java.util.*;

class Interest {

    // Instance method to calculate Simple Interest
    void calculateSI(double p, double r, double t) {
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
    }

    // Static method to display details
    static void displayDetails(double p, double r, double t) {
        System.out.println("Principal: " + p);
        System.out.println("Rate: " + r);
        System.out.println("Time: " + t);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        Interest obj = new Interest();

        displayDetails(p, r, t);
        obj.calculateSI(p, r, t);
    }
}
