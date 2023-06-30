	
package Task_3_3;
	
import java.util.Scanner;
	
public class Task_3_3_res {
	
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
					
			System.out.println("----------------------------------");
			
		} while ( check == 0 );
		
		return x;
	}
	
	
	// Заполнение массива рандомно
	public static int[] WriteMass ( int[] array, int X ) {
		
		for (int i = 0; i < X; i++) {
			
			array[i] = -100 + (int) ( Math.random()*(100-(-100)) );
			
			}
			
			return array;
		}
	
	
	// Вывод на печать одномерного массива
	public static void PrintMass (int[] array) {
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		for ( int i = 0; i < array.length; i++) {
			
			System.out.printf( "%4d ", array[i] );
			
			System.out.printf( "(%d)  ", i);
			
		}
		
		System.out.println("");
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
}
