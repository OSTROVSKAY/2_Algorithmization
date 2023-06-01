	
package Task_4_14;
	
import java.util.Scanner;
	
public class Task_4_14_res {
	
	// Ввод данных
	public int InputInt() {
		
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
					
					System.out.println("--------------------------------------");
					
				} while ( check == 0 );
				
			return x;
		}
	
	
	// Вычисление суммы цифр в числе
	public int Sum ( int number, int N ) {
		
		int sum = 0;
		
		while ( number > 0 ) {
		
		int temp = number % 10;
		
		sum = (int) (sum + Math.pow( temp, N ));
		
		number = ( number - temp ) / 10;
		}
		
		return sum;
	}
	
	
	// Вычисление количества цифр в числе
	public int Count ( int number ) {
		
		int count = 0;
		
		while ( number > 0 ) {
		
		int temp = number % 10;
		
		count = count + 1;
		
		number = ( number - temp ) / 10;
		}
		
		return count;
	}
	
}
