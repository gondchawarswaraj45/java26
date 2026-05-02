import java.util.*;

class PatternPrint {

    	public static void main(String[] args) {
    
	    	Scanner sc = new Scanner(System.in);

        
		System.out.print("Enter number of rows: ");
        
		int n = sc.nextInt();

     
	     	for (int i = 1; i <= n; i++) {
            
			int num = i;
            
			for (int j = 1; j <= n; j++) {
                
				System.out.print(num + " ");
              			num += n;
            		}
            		System.out.println();
        	}

    }
}
