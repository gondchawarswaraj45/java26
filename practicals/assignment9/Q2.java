import java.io.*;

class Circle {
    void calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Radius: ");
        double radius = Double.parseDouble(br.readLine());

        Circle c = new Circle();
        c.calculateArea(radius);
    }
}
