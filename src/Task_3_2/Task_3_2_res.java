	
package Task_3_2;
	
import java.math.BigDecimal;
	
import java.math.RoundingMode;
	
import java.util.Scanner;
	
public class Task_3_2_res {
	
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
				
				System.out.println("----------------------------------");
				
			} while ( check == 0 );
				return x;
		}
	
	
	// Заполнение одномерного массива рандомно
	public static double[] WriteMass ( double[] array, int X ) {
		
		double value = 0;
		
		value = -10 + ( Math.random() * (10 - (-10) ) );
		BigDecimal result = new BigDecimal(value);
		result = result.setScale(3, RoundingMode.UP );
		
		array[0] = result.doubleValue();
		
		// Заполнение массива рандомно
		value = 0;
		
		for ( int i = 1; i < X; i++ ) {
			
			do {
				value = -10 + ( Math.random() * (10 - (-10) ) );
				BigDecimal result1 = new BigDecimal(value);
				result = result1.setScale(3, RoundingMode.UP );
				
				array[i] = result1.doubleValue();
				
			} while ( array[i-1] > array[i] );
			
		}
		
		return array;
	}
	
	
	// Вывод на печать одномерного массива
	public void PrintMass (double[] array) {
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for ( int i = 0; i < array.length; i++) {
			
			System.out.printf( "%5.3f ", array[i] );
			System.out.printf( "(%d)  ", i);
			
			}
			
		System.out.println("");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
}
