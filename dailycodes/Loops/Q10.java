class Day {
    public static void main(String[] args) {

        for (int time = 0; time <= 24; time++) {

            if (time <= 6) {
                System.out.println("Wake up");
            } 
            else if (time <= 10) {
                System.out.println("Getting ready");
            } 
            else if (time <= 18) {
                System.out.println("Working");
            } 
            else if (time <= 22) {
                System.out.println("Self time");
            } 
            else {
                System.out.println("Time to sleep");
            }
        }
    }
}
