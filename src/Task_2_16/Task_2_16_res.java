	
package Task_2_16;
	
import java.util.Arrays;
	
import java.util.Scanner;
	
public class Task_2_16_res {
	
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
					
				System.out.println("-----------------------------------");
				
			} while ( check == 0 );
			
		return x;
	}
	
	
	// Повтор работы программы
	public static int repeat() {
		
		int check = 0;
		
		do {
			System.out.println("Введите : 1 - Да или 0 - Нет");
			System.out.println("----------------------------");
			
			check = InputInt();
			
			if ( check < 0 | check > 1 )
				{
				System.out.println("------------------------------------------------");
				System.out.println("Введеные данные не равны 0 или 1. Введите снова.");
				System.out.println("------------------------------------------------");
				}
				
			} while ( check < 0 | check > 1 );
			
		try {
			Thread.sleep(500);
			}
			catch(InterruptedException ex)
				{
				System.out.println("-------------------------");
				System.out.println("Ошибка в работе программы");
				System.out.println("-------------------------");
				}
				
		return check;
	}
	
	
	// Вычисление Магической константы нормального волшебного квадрата M
	public static int MagConst( int N ) {
		
		int M;
		
		M = ( N * ( N*N + 1 ) ) / 2;
		
		return M;
	}
	
	
	// Построение магического квадрата нечётного порядка : 3, 7, 9, 11, 13 и так далее.
	public static int[][] magicSquareOfOddOrder(int n) {
		
		// Пять правил составления магических квадратов нечётного порядка :
		// Правило 1. Число 1 ставится в средний столбец первой строки.
		// Правило 2. Следующее число ставится, если возможно в ячейку, соседнюю с текущей по диагонали правее и выше.
		// Правило 3. Если новая ячейка выходит за пределы квадрата сверху, то число ставится в самую нижнюю строку и в следующий столбец.
		// Правило 4. Если ячейка выходит за пределы квадрата справа, то число ставится в самую первую колонку и в предыдущий столбец.
		// Правило 5. Если ячейка уже занята, то очередное число ставится под текущей ячейкой.
		// Далее нужно переходить к Правилу 2.
		// Далее выполняются Правила 3, 4, 5 до полного составления всего квадрата.
		// Данный метод Cоставления магического квадрата нечётного порядка называется - "Сиамский метод".
		
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < n; i++)
				{
				Arrays.fill(matrix[i], 0);
				}
				
			int count = 1, y = 0, x = matrix.length/2;
			
			while (true) {
				
				matrix[y][x] = count;
				
				count ++;
				
				if (((y == 0) && (x >= n-1)) && (matrix[n-1][0] != 0))
					{
					y++;
					}
					
				else {
					
					y--;
					
					if (y < 0)
						{
						y = n - 1;
						}
						
					x++;
					
					if (x == n)
						{
						x = 0;
						}
						
					if(matrix[y][x] != 0)
						{
						y+=2;
						x--;
						}
				}
				
				if(count == n*n+1) { break; }
			}
			
			return matrix;
	}
	
	
	// Построение магического квадрата чётного порядка. ( Метод для N четно-нечетной размерности (N кратно 2, но не кратно 4) : 6, 10, 14, 18, 22 и так далее.
	public static int[][] magicSquareOfEvenOddOrder(int n) {
		
		int half = n/2;
		
		int[][] matrix = new int[n][n];
		
		int[][] tempMatrix;
		
		tempMatrix = magicSquareOfOddOrder(half);
		
		
		// 1/4 матрицы
		for (int i = 0; i < half; i++) {
			
			for (int j = 0; j < half; j++) {
				
				matrix[i][j] = tempMatrix[i][j];
			}
		}
		
		
		// 2/4 матрицы
		for (int i = 0; i < half; i++) {
			
			for (int j = half; j < n; j++) {
				
				int x = j-half;
				
				matrix[i][j] = (tempMatrix[i][x] + 2*half*half);
			}
		}
		
		
		// 3/4 матрицы
		for (int i = half; i < n; i++) {
			
			for (int j = 0; j < half; j++) {
				
				int x = i-half;
				
				matrix[i][j] = (tempMatrix[x][j] + 3*half*half);
			}
		}
		
		
		// 4/4 матрицы
		for (int i = half; i < n; i++) {
			
			for (int j = half; j < n; j++) {
				
				int x = i-half, y = j-half;
				
				matrix[i][j] = (tempMatrix[x][y] + half*half);
			}
		}
		
		
		int move = 0;
		
		
		for (int i = 6; i < n; i++)
			{
			if((i%4!=0)&&(i%2==0)) { move ++; }
			}
			
			
		for (int j = matrix.length/2-move; j <= matrix.length/2+move-1; j++) {
			
			for (int i = 0; i < tempMatrix.length; i++) {
				
				int key = matrix[i][j];
				
				matrix[i][j] = matrix[half+i][j];
				
				matrix[half+i][j] = key;
			}
		}
		
		
		for (int j = 0; j <= 1; j++) {
			
			if (j == 0) {
				
				int key = matrix[0][0];
				
				matrix[0][0] = matrix[half][0];
				
				matrix[half][0] = key;
			}
			
			if (j == 1) {
				
				int key = matrix[half - 1][0];
				
				matrix[half - 1][0] = matrix[n - 1][0];
				
				matrix[n - 1][0] = key;
			}
		}
		
		
		for (int j = half+1; j < n-1; j++) {
			
			for (int i = 1; i < half-1; i++) {
				
				int key = matrix[i][1];
				
				matrix[i][1] = matrix[half+i][1];
				
				matrix[half+i][1] = key;
			}
		}
		
		return matrix;
	}
	
	
	// Построение магического квадрата чётного порядка. (N кратно 2 и 4) : 4, 8, 12, 16, 20 и так далее
	public static int[][] evenMatrixSquare(int n) {
		
		// Метод Раус-Болла.
		
		int[][] matrix = new int[n][n];
		
		// Заполнение начальной матрицы от 1 по возростанию
		int count = n*n;
		
		int count1 = 1;
		
		
		for ( int i = 0; i < n; i++) {
			
			for ( int j = 0; j < n; j++) {
				
				if ( count1 < (count +1 ) )
					{
					matrix[i][j] = count1;
					}
					
				count1 ++;
			}
		}
		
		
		// Заполнение временной матрицы от n*n по убыванию
		
		int[][] tempMatrix = new int[n][n];
		
		count = n*n;
		
		count1 = 1;
		
		for ( int i= 0; i < n; i++) {
			
			for ( int j = 0; j < n; j++) {
				
				if ( count > (count1 - 1 ) ) {
				
				tempMatrix[i][j] = count;
				
				}
				
				count --;
			}
		}
		
		
		int size = 4; // Размерность каждого квадрата (4х4 - Минимум)
		
		int x = 0; // x, y - Движение по квадратам ( x, y изменяются в ходе программы)
		int y = 0;
		
		for (int i = 0; i < (n*n/16); i++) {  // Столько квадратов 4х4 помещается в матрице nxn
			
			if (x == (int) Math.sqrt(n*n/16)) {  // x, y переменные для движения по квадратам 4х4
				
				// х проходит по первому ряду квадратов, достигая последнего - обнуляется, а y увеличивается
				
				x = 0;
				
				y++;
			}
			
			// x и y должны обеспечивать проход по квадратам
			
			for (int j = 0; j < 4; j++) {
				
				matrix[size*y+j][size*x+j] = tempMatrix[size*y+j][size*x+j];  // главная диагональ квадратов 4х4
				
				matrix[size*y+j][size*x+size-1-j] = tempMatrix[size*y+j][size*x+size-1-j]; // побочная диагональ
			}
			
			x++;
		}
		return matrix;
	}
	
	
	// Вывод двумерного массива на печать
	public static void PrintMass( int[][] array ) {
		
		for (int i = 0; i < array.length; i++) {  // X - Число строк
			
			for (int j = 0; j < array[i].length; j++) {  // Y - Число столбцов
				
				System.out.printf("%5d  ",array[i][j]);
				// System.out.printf("%5d  (%3d %3d)  ",array[i][j],i,j);
				}
				
				System.out.println("");
			}
		}
		
		
	// Проверка : Является ли квадрат магическим
	public static int TestMass( int[][] array, int M, int N ) {
		
		int check = 1;
		
		// 1. Проверка суммы элементов в каждой строке матрицы
		
		int line = 0;
		
		for (int i = 0; i < array.length; i++) {  // X - Число строк
			
			line = 0;
			
			for (int j = 0; j < array[i].length; j++) {  // Y - Число столбцов
					
					line = line + array[i][j];
				}
				
				if ( line != M ) { check = 0; }
		}
		
		
		// 2. Проверка суммы элементов в каждом столбце матрицы
		
		int column = 0;
		
		for (int j = 0; j < N; j++) {
			
			column = 0;
			
			for (int i = 0; i < N; i++) {
				
				column = column + array[i][j];
			}
			
			if ( column != M ) { check = 0; }
			
		}
		
		// 3. Проверка суммы элементов в главной диагонали матрицы
		int firstDiag = 0;
		
		for (int i = 0; i < N; i++) {  // X - Число строк
			
			for (int j = 0; j < N; j++) {  // Y - Число столбцов
			
			if ( i == j ) {
				
				firstDiag = firstDiag + array[i][j];
				
				}
			}
			
		}
		
		if (firstDiag != M ) { check = 0; }
		
		
		// Проверка суммы элементов во второй диагонали матрицы
		int secDiag = 0;
		
		int Z = N - 1;
		
		for (int i = 0; i < N; i++) {  // X - Число строк
			
			for (int j = 0; j < N; j++) {  // Y - Число столбцов
				
				if ( j == Z ) {
					
					secDiag = secDiag + array[i][j];
				
				}
			}
			
			Z = Z - 1;
		}
		
		if (secDiag != M ) { check = 0; }
		
		return check;
	}
	
}
