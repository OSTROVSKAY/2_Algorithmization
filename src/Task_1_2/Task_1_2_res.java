	
package Task_1_2;
	
import java.util.Scanner;
	
public class Task_1_2_res {
	
	// Ввод Данных
	public static int InputInt() {
	
	int check = 1;
	int x = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	do {
		System.out.print("Введите Данные :.............: " + "  ");
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
