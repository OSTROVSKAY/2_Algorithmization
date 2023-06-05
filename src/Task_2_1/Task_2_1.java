	
/*
	1. Дана матрица. Вывести на экран все нечетные столбцы,
		у которых первый элемент больше последнего.
*/
	
package Task_2_1;
	
public class Task_2_1 {
	
	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА : ВЫВОД МАТРИЦЫ НА ЭКРАН");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		System.out.println("Введите размер массива A[X][Y] :");
		System.out.println("------------------------------------");
		System.out.println("X - Число строк. Y - Число столбцов.");
		System.out.println("------------------------------------");
		
		Task_2_1_res Inp = new Task_2_1_res();
		
		// Ввод числа строк матрицы
		
		System.out.println("Введите :  X - Число строк : ");
		int X = 0;
		
		do {
			X = Inp.InputInt();
			
			if ( X <= 0 )
				{
				System.out.println("--------------------------------------------------");
				System.out.println("Введенные данные меньше или равно 0. Введите снова");
				System.out.println("--------------------------------------------------");
				}
				
		} while ( X <= 0 );
			
			
		// Ввод числа столбцов матрицы
		System.out.println("Введите : Y - Число столбцов : ");
		
		int Y = 0;
		
		do {
			Y = Inp.InputInt();
			
			if ( Y <= 0 )
				{
				System.out.println("--------------------------------------------------");
				System.out.println("Введенные данные меньше или равно 0. Введите снова");
				System.out.println("--------------------------------------------------");
				}
				
		} while ( Y <= 0 );
		
		
		// Объявление двумерного массива
		int[][] array = new int[X][Y];
		
		// Заполнение двумерного массива рандомно
		for (int i = 0; i < X; i++) {
			for (int j = 0; j < Y; j++) {
				array[i][j] = -100 + (int) ( Math.random()*(100-(-100)) );
			}
		}
		
		
		// Вывод двумерного массива на печать
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < array.length; i++) {  // X - Число строк
			for (int j = 0; j < array[i].length; j++) {  // Y - Число столбцов
				
				//System.out.print(array[i][j] + "  ( " + i + " " + j + " )  " + "\t");
				System.out.printf( "%4d  (%2d %2d)  ",array[i][j],i,j );
				}
				System.out.println();
		}
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		
		// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
		
		for (int i = 0; i < X; i++) {  // X - Число строк
			for (int j = 0; j < Y; j++) {  // Y - Число столбцов
				
				if ( array[0][j] > array[X - 1][j] & j % 2 == 0 ) {
					
				//	System.out.print(array[i][j] + "  ( " + i + " " + j + " )  " + "\t");
					System.out.printf( "%4d  (%2d %2d)  ",array[i][j],i,j );
					}
					else {
						System.out.printf( "               " );
						}
				}
				System.out.println();
			}
			
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
	}
	
}
