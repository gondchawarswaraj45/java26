class SmartCar {
    public static void main(String[] args) {

        int speed, distance;

        for (int i = 1; i <= 5; i++) {

            speed = i * 30;     
            distance = 100 - (i * 15);

	    if (speed > 80 && distance < 40){

                
		System.out.println("Danger! Slow Down Immediately");
	} 
	    else if (speed > 60 && distance < 60){
            
		    System.out.println("Warning: Maintain Distance");
	    } else {
                
		    System.out.println("Safe Driving");
		}
        }
    }
}
