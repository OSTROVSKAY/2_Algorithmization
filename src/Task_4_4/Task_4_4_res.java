	
package Task_4_4;
	
import java.util.Scanner;
	
public class Task_4_4_res {
	
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
					
				System.out.println("-------------------------------------");
				
			} while ( check == 0 );
			
			return x;
		}
	
	
	// Ввод данных
	public static double InputDouble() {
		
		int check = 1;
		double x = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Введите Данные :.............: " + "  ");
			String xx = scanner.nextLine();
			
			check = 1;
			
			try {
				x = Double.parseDouble(xx);
				}
				catch (NumberFormatException e) {
					
					check = 0;
					System.out.println("------------------------------------------");
					System.out.println("Данные введены не правильно. Введите снова");
					System.out.println("------------------------------------------");
					}
					
					
			} while ( check == 0 );
			
			return x;
		}
	
	
	// Вычисление расстояния между ДВУМЯ точками
	public static double distance( double x_a, double x_b, double y_a, double y_b) {
		
		double dist = Math. sqrt( Math.pow( ( x_b - x_a ), 2) + Math.pow( ( y_b - y_a ), 2) );
		
		return dist;
	}
	
}
