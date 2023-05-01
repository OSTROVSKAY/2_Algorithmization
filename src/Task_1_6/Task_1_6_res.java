package Task_1_6;

import java.util.Scanner;

public class Task_1_6_res {
	
	// Ввод данных
	
	public int InputInt() {
				  
	      int check = 1;
		  int x  = 0;
			     
			 do {
				  Scanner scanner = new Scanner(System.in);
				  System.out.print("Введите Данные :.............:" + "  ");
		          String xx = scanner.nextLine();

		          check = 1;

		            try {
		          	    x = Integer.parseInt(xx);
		                } 
		                  catch (NumberFormatException e) {
		                  
		   	            check = 0;
			                System.out.println("------------------------------------------");
			                System.out.println("Данные введены не правильно. Введите снова");
			                System.out.println("------------------------------------------");
		                }
		            
		      System.out.println("----------------------------------");

		    } while ( check == 0 );
				     return x; 
		  }
	
	
	

}
