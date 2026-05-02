import java.io.*;

class Movie {
    String title;
    String director;
    double rating;

    void setDetails(String t, String d, double r) {
        title = t;
        director = d;
        rating = r;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Rating: " + rating);
    }

    static void checkHit(double rating) {
        if (rating >= 7) {
            System.out.println("Hit Movie");
        } else {
            System.out.println("Average Movie");
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Title: ");
        String title = br.readLine();

        System.out.print("Enter Director: ");
        String director = br.readLine();

        System.out.print("Enter Rating: ");
        double rating = Double.parseDouble(br.readLine());

        Movie m = new Movie();
        m.setDetails(title, director, rating);
        m.displayDetails();
        Movie.checkHit(rating);
    }
}
