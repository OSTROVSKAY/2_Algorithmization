	
package Task_4_8;
	
import java.util.Scanner;
	
public class Task_4_8_res {
	
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
		
		
	// Заполнение одномерного массива рандомно
	public static int[] WriteMass ( int[] array ) {
		
		for ( int i = 0; i < array.length; i++ ) {
			
			array[i] = -100 + (int) ( Math.random()*(100-(-100)) );
			
		}
		
		return array;
	}
	
	
	// Вывод массива на печать
	public static void PrintMass ( int array[]) {
		
		for ( int i = 0; i < array.length; i++)
			{
			System.out.println("---------------------------------------------------------------------");
			System.out.printf( "Номер элемента массива : %2d  ||  Значение элемента массива : %4d%n", i, array[i] );
			// System.out.println("Номер элемента массива :  " +  i + "  ||  " + "Значение элемента массива :  " + nums[i] );
			System.out.println("---------------------------------------------------------------------");
			}
			
		System.out.println("---------------------------------------------------------------------");
	}
	
	
	// Вычисление сумм трёх последовательно расположенных элементов массива с номерами от k до m
	public static void SummMass ( int array[], int K, int M) {
		
		if( K <= array.length & M <= array.length & M > K &  ( ( M - K) + 1 ) % 3 == 0 & K != M ) {
			
			int K1 = K - 1;
			
			int M1 = M - 1;
			
			int K2 = 0;
			
			int sum = 0;
			
			int count = 1;
			
			System.out.println("-------------------------------------------------------------------------------------");
			
			for ( int i = K1; i <= M1; i = i + 3) {
				
				K2 = i;
				
				System.out.printf( "Строка № : %1d  Элементы массива : ", count);
				
				// System.out.print("Строка № : " + count + "  " + "Элементы массива :  ");
				
				for ( int j = K2; j < K2 + 3; j++)
					{
					System.out.printf( "%4d  (%2d) ", array[j], j);
					// System.out.print(array[j] + " (" + j + " ) ");
					
					sum = sum + array[j];
					}
					
				System.out.printf( " ||  СУММА : %4d", sum );
				// System.out.print("  СУММА : " + sum);
				
				System.out.println("");
				
				System.out.println("-------------------------------------------------------------------------------------");
				
				K2 = 0;
				
				sum = 0;
				
				count++;
				
			}
			
		}
			else if ( K == M )
				{
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("Номер Начального элемента массива - k равен номеру Конечного элемента массива - m");
				System.out.println("---------------------------------------------------------------------------------");
				}
				
			else if (K > array.length | M > array.length)
				{
				System.out.println("-------------------------------------------------");
				System.out.println("Введённый номер элемента превышает размер массива");
				System.out.println("-------------------------------------------------");
				}
				
			else if ( ( ( M - K) + 1 ) % 3 != 0 )
				{
				System.out.println("-----------------------------------------------------");
				System.out.println("Выбранное количество элементов массива не кратно ТРЁМ");
				System.out.println("-----------------------------------------------------");
				}
	}
	
	
	// Вычисление сумм трёх последовательно расположенных элементов массива
	public static void SummMass1 ( int array[], int K, int M, int L) {
		
		int L1 = L - 1;
		
		int sum;
		
		if( K <= array.length & M <= array.length & M > K  & K != M & L >= K & (L+3) <= M)
			{
			sum = array[L1] + array[L1+1] + array[L1+2];
			
			System.out.printf( "%4d (%2d)  %4d (%2d)  %4d (%2d)  ||  СУММА : %4d",array[L1], L1, array[L1+1], (L1+1), array[L1+2], (L1+2), sum );
			System.out.println("");
			System.out.println("---------------------------------------------------");
			}
			
			else if ( K == M )
				{
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("Номер Начального элемента массива - k равен номеру Конечного элемента массива - m");
				System.out.println("---------------------------------------------------------------------------------");
				}
				
			else if (K > array.length | M > array.length)
				{
				System.out.println("-------------------------------------------------");
				System.out.println("Введённый номер элемента превышает размер массива");
				System.out.println("-------------------------------------------------");
				}
				
			else if (M < K)
				{
				System.out.println("--------------------------------------------------------------------------------------------------------");
				System.out.println("Значение номера Начального элемента массива - k превышает Значение номера Конечного элемента массива - m");
				System.out.println("--------------------------------------------------------------------------------------------------------");
				}
				
			else if (L < K | (L+3) > M)
				{
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("Номер элемента массива для вычисления суммы трёх последовательно расположенных элементов массива задан неправильно");
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				}
	}
	
	
	// Повторная работа программы
	public static int Repeat() {
		
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
			
		return check;
	}
	
}
