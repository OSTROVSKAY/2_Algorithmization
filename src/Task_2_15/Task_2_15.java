	
	// 15. Найти наибольший элемент матрицы и заменить все нечетные элементы на него.
	
package Task_2_15;
	
public class Task_2_15 {
	
	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА : ФОРМИРОВАНИЕ МАТРИЦЫ");
		System.out.println("--------------------------------");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Вычисление наибольшего элемента матрицы и замена всех нечетных элементов матрицы на него.");
		System.out.println("-----------------------------------------------------------------------------------------");
		
		System.out.println("Введите размер массива A[X][Y] :");
		System.out.println("------------------------------------");
		System.out.println("X - Число строк. Y - Число столбцов.");
		System.out.println("------------------------------------");
		
		Task_2_15_res object = new Task_2_15_res();
		
		// Ввод числа строк матрицы
		System.out.println("Введите :  X - Число строк : ");
		int X = 0;
		
		do {
			X = object.InputInt();
			
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
				Y = object.InputInt();
				
				if ( Y <= 0 )
					{
					System.out.println("--------------------------------------------------");
					System.out.println("Введенные данные меньше или равно 0. Введите снова");
					System.out.println("--------------------------------------------------");
					}
				
			} while ( Y <= 0 );
			
			
			// Объявление двумерного массива
			int[][] array = new int[X][Y];
			
			// Заполнение двумерного массива
			object.FillMass( array, X, Y);
			
			// Вывод двумерного массива на печать
			System.out.println("------------------------------------");
			System.out.println("Вывод двумерного массива на печать :");
			System.out.println("------------------------------------");
			
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
			object.PrintMass(array);
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			
			// Найти наибольший элемент матрицы и заменить все нечетные элементы на него.
			int max = object.FindMass( array, X, Y);
			System.out.println("---------------------------------");
			System.out.printf("Наибольший элемент матрицы : %3d%n", max);
			System.out.println("---------------------------------");
			
			for ( int i = 0; i < X; i++ ) {
				
				for ( int j = 0; j < Y; j++ ) {
					
					if ( array[i][j] == max )
						{
						System.out.println("------------------------------------------------------------------------------");
						
						System.out.printf( "Наибольший элемент матрицы : %4d  ||  Координаты элемента матрицы : (%2d %2d)%n",array[i][j],i,j);
						
						// System.out.println("Наибольший элемент матрицы :  " + array[i][j] + "  ||  " + "Координаты элемента матрицы : " + " ( " + i + "  " + j + " ) ");
						System.out.println("------------------------------------------------------------------------------");
						}
					}
				}
			
			
			// Замена всех нечетных элементов матрицы на наибольший элемент матрицы
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Замена всех нечетных элементов матрицы на наибольший элемент матрицы :");
			System.out.println("----------------------------------------------------------------------");
			object.Exchange( array, X, Y, max);
			
			
			// Вывод двумерного массива на печать
			System.out.println("------------------------------------------------");
			System.out.println("Вывод изменённого двумерного массива на печать :");
			System.out.println("------------------------------------------------");
			
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
			object.PrintMass(array);
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
}
