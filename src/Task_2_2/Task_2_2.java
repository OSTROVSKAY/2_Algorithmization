	
/*
	2. Дана квадратная матрица.
	Вывести на экран элементы, стоящие на диагонали.
*/
	
package Task_2_2;
	
public class Task_2_2 {
	
	public static void main(String[] args) {
		
		System.out.println("----------------------------------");
		System.out.println("ПРОГРАММА : ВЫВОД МАТРИЦЫ НА ЭКРАН");
		System.out.println("----------------------------------");
		
		System.out.println("Введите размер массива A[X][Y] :");
		System.out.println("------------------------------------");
		System.out.println("X - Число строк. Y - Число столбцов.");
		System.out.println("------------------------------------");
		System.out.println("Матрица квадратная. Число строк равно числу столбцов");
		System.out.println("----------------------------------------------------");
		
		
		// Ввод числа строк и столбцов матрицы
		System.out.println("Введите число строк и столбцов квадратной матрицы :");
		
		int X = 0; // Число строк квадратной матрицы
		int Y = 0; // Число столбцов квадратной матрицы
		
		do {
			X = Task_2_2_res.InputInt();
			
			if ( X <= 0 )
				{
				System.out.println("--------------------------------------------------");
				System.out.println("Введенные данные меньше или равно 0. Введите снова");
				System.out.println("--------------------------------------------------");
				}
				
		} while ( X <= 0 );
		
		Y = X;
		
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
				
				System.out.printf( "%4d  (%2d %2d)  ",array[i][j],i,j );
				//System.out.print(array[i][j] + "  ( " + i + " " + j + " )  " + "\t");
				}
				
				System.out.println();
				
			}
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			
		// Вывод двумерного массива на печать : Вывод на экран элементов, стоящих на диагонали. 1 Вариант.
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		for (int i = 0; i < X; i++) {  // X - Число строк
			
			for (int j = 0; j < Y; j++) {  // Y - Число столбцов
				
				if ( i == j ) {
					
					System.out.printf( "%4d  (%2d %2d)  ",array[i][j],i,j );
					//System.out.print(array[i][j] + "  ( " + i + " " + j + " )  " + "\t");
					
					}
						else { System.out.print("               " + "\t"); }
				}
				
				System.out.println();
		}
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		
		// Вывод двумерного массива на печать : Вывод на экран элементов, стоящих на диагонали. 2 Вариант.
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		int Z = Y - 1;
		
		for (int i = 0; i < X; i++) {  // X - Число строк
			
			for (int j = 0; j < Y; j++) {  // Y - Число столбцов
				
				if ( j == Z )
					{
					
					System.out.printf( "%4d  (%2d %2d)  ",array[i][j],i,j );
					//System.out.print(array[i][j] + "  ( " + i + " " + j + " )  " + "\t");
					}
					else { System.out.print("               " + "\t"); }
					
				}
				Z = Z - 1;
				
				System.out.println();
			}
			
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
}
