class AlarmSnooze {
    public static void main(String[] SRG) {

        int snooze = 3;

        do {
            System.out.println("Alarm ringing! Snooze left: " + snooze);
        
	    snooze--;

        } while (snooze > 0);


        System.out.println("Wake up! No snooze left.");
 
    }
}
