	
/*
	7. Сформировать квадратную матрицу порядка N по правилу.
		и подсчитать количество положительных элементов в ней.
*/
	
package Task_2_7;
	
import java.math.BigDecimal;
import java.math.RoundingMode;
	
public class Task_2_7 {
	
	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА : ФОРМИРОВАНИЕ КВАДРАТНОЙ МАТРИЦЫ");
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		
		int check = 0;
		
		do {
			System.out.println("Введите размер массива A[X][Y] :");
			System.out.println("------------------------------------");
			System.out.println("X - Число строк. Y - Число столбцов.");
			System.out.println("------------------------------------");
			System.out.println("Матрица квадратная. Число строк равно числу столбцов");
			System.out.println("----------------------------------------------------");
			
			Task_2_7_res Inp = new Task_2_7_res();
			
			// Ввод числа строк и столбцов матрицы
			
			System.out.println("Введите число строк и столбцов квадратной матрицы :");
			System.out.println("---------------------------------------------------");
			
			int X = 0; // Число строк квадратной матрицы
			int Y = 0; // Число столбцов квадратной матрицы
			
				do {
					X = Inp.InputInt();
					
						if ( X <= 0 )
							{
							System.out.println("--------------------------------------------------");
							System.out.println("Введенные данные меньше или равно 0. Введите снова");
							System.out.println("--------------------------------------------------");
							}
							
					} while ( X <= 0 );
					
					Y = X;
					
			// Объявление двумерного массива
			double[][] array = new double[X][Y];
				
			// Заполнение двумерного массива 
			double value = 0;
			
				for (int i = 0; i < X; i++) {
					for (int j = 0; j < Y; j++) {
					
						value = Inp.Input(i, j, Y);
						BigDecimal result = new BigDecimal(value);
						result = result.setScale(3, RoundingMode.DOWN );
						array[i][j] = result.doubleValue();
					}
				}
				
			// Вывод двумерного массива на печать
				
			System.out.println("------------------------------------");
			System.out.println("Вывод двумерного массива на печать :");
			System.out.println("------------------------------------");
			
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			for (int i = 0; i < array.length; i++) { // X - Число строк
				
				for (int j = 0; j < array[i].length; j++) { // Y - Число столбцов
					
					System.out.printf( " %6.3f   ",array[i][j] );
					// System.out.print(array[i][j] + "\t");
					// System.out.print(array[i][j] + "  ( " + i + " " + j + " )  " + "\t");
				}
				System.out.println();
			}
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			
			// Подсчёт количества положительных элементов в квадратной матрице.
			
			int count = 0;
				
				for (int i = 0; i < array.length; i++) { // X - Число строк
					
					for (int j = 0; j < array[i].length; j++) { // Y - Число столбцов
						
						if ( array[i][j] > 0 ) {
							count = count + 1;
						}
					}
				}
				
				System.out.println("-------------------------------------------------------");
				System.out.println("Количество положительных элементов в матрице : " + count);
				System.out.println("-------------------------------------------------------");
				
				System.out.println("-----------------------------------------------");
				System.out.println("ПРОДОЛЖИТЬ РАБОТУ ПРОГРАММЫ ?   1 - ДА. 0 - НЕТ");
				System.out.println("-----------------------------------------------");
				
				do {
					System.out.println("Введите : 1 - Да или 0 - Нет");
					System.out.println("----------------------------");
					
					check = Inp.InputInt();
					
					if ( check < 0 | check > 1 )
						{
						System.out.println("------------------------------------------------");
						System.out.println("Введеные данные не равны 0 или 1. Введите снова.");
						System.out.println("------------------------------------------------");
						}
					
				} while ( check < 0 | check > 1 );
				
				try {
					Thread.sleep(1500);
					}
					catch(InterruptedException ex)
						{
						System.out.println("-------------------------");
						System.out.println("Ошибка в работе программы");
						System.out.println("-------------------------");
						}
				
			} while ( check == 1 );
			
		}
	
	}
