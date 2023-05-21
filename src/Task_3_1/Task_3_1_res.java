
package Task_3_1;

import java.util.Scanner;

public class Task_3_1_res {
	
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
	public static int[] WriteMass ( int[] array, int N ) {
		
		// Заполнение массива рандомно
		for ( int i = 0; i < N; i++ ) {
			
		array[i] = -100 + (int) ( Math.random()*(100-(-100)) );
			
		}
		
		return array;
	}
	
	
	// Вывод на печать одномерного массива
	public void PrintMass (int[] array) {
		
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		for ( int i = 0; i < array.length; i++) {
			
			
			System.out.printf( "%4d ", array[i] );
			System.out.printf( "(%d) ", i);
			
			//System.out.printf( "%2d  ||  %3d%n", i, array[i] );
			//System.out.printf( "Номер элемента массива : %2d  ||  Значение элемента массива : %3d%n", i, array[i] );
			// System.out.println("Номер элемента массива :  " +  i + "  ||  " + "Значение элемента массива :  " + nums[i] );
			//System.out.println("-------------------------------------------------------------------");
			}
			
		System.out.println("");
		System.out.println("-----------------------------------------------------------------------------------------------------------");
	}
	
	
}
