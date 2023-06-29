	
package Task_2_15;
	
import java.util.Scanner;
	
public class Task_2_15_res {
	
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
	
	
	// Заполнение двумерного массива
	public static void FillMass( int[][] array, int X, int Y) {
		
		for ( int i = 0; i < X; i++ ) {
			
			for ( int j = 0; j < Y; j++ ) {
				
				array[i][j] = -100 + (int) ( Math.random()*(100-(-100)) );
			}
		}
		
	}
	
	
	// Найти наибольший элемент матрицы
	public static int FindMass ( int[][] array, int X, int Y) {
		
		int max = array[0][0]; // Максимальный элемент массива
		
		for ( int i = 0; i < X; i++ ) {
			
			for ( int j = 0; j < Y; j++ ) {
				
				if ( array[i][j] > max ) { max = array[i][j]; }
			}
		}
		
		return max;
	}
	
	
	// Замена всех нечетных элементов матрицы на наибольший элемент матрицы
	public static void Exchange( int[][] array, int X, int Y, int max) {
		
		int is = 0;
		
		for ( int i = 0; i < X; i++ ) {
			
			for ( int j = 0; j < Y; j++ ) {
				
				if ( Math.abs(array[i][j]) % 2 != 0 ) {
					
					is = array[i][j];
					
					array[i][j] = max;
					
					System.out.println("----------------------------------------------------------------------------------------------------------------------------");
					
					System.out.printf( "Первоначальный элемент массива : %4d  ||  Изменённый элемент массива : %4d  ||  Координаты элемента массива : (%2d %2d)%n",is,array[i][j],i,j );
					
					// System.out.println("Первоначальный элемент массива : " + is + "  ||  " + "Изменённый элемент массива : " +  array[i][j] + "  ||  " + "Координаты элемента массива : " + " ( " + i + "  " + j + " ) ");
					System.out.println("----------------------------------------------------------------------------------------------------------------------------");
					
				}
			}
		}
		
	}
	
	
	// Вывод двумерного массива на печать
	public static void PrintMass( int[][] array ) {
		
		for (int i = 0; i < array.length; i++) {  // X - Число строк
			
			for (int j = 0; j < array[i].length; j++) {  // Y - Число столбцов
				
				// System.out.print(array[i][j] + "\t");
				System.out.printf( "%4d  (%2d %2d)  ",array[i][j],i,j );
				// System.out.print(array[i][j] + "  ( " + i + " " + j + " )  " + "\t" );
				
				}
				
				System.out.println("");
			}
		}
	}
