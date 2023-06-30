	
package Task_4_12;
	
import java.util.Scanner;
	
public class Task_4_12_res {
	
	// Ввод данных
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
						
					System.out.println("-----------------------------------");
					
				} while ( check == 0 );
				
			return x;
		}
		
		
	// Вычисление суммы цифр в числе
	public static int Sum ( int number ) {
		
		int sum = 0;
		
		while ( number > 0 ) {
		
		int temp = number % 10;
		
		sum = sum + temp;
		
		number = ( number - temp ) / 10;
		}
		
		return sum;
	}
	
}
