	
package Task_3_6;
	
import java.math.BigDecimal;
	
import java.math.RoundingMode;
	
import java.util.Scanner;
	
public class Task_3_6_res {
	
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
	
	
	// Заполнение одномерного массива рандомно
	public static double[] WriteMass ( double[] array, int X ) {
		
		double value = 0;
		
		// Заполнение массива рандомно
		for ( int i = 0; i < X; i++ ) {
			
			value = -10 + ( Math.random() * (10 - (-10) ) );
			
			BigDecimal result = new BigDecimal(value);
			
			result = result.setScale(3, RoundingMode.UP );
			
			array[i] = result.doubleValue();
			
			}
			
			return array;
		}
		
		
	// СОРТИРОВКА МАССИВА ПО ВОЗРАСТАНИЮ СПОСОБОМ ШЕЛЛА : 1 Вариант
	public static double[] SortMass1( double[] array ) {
		
		/*
		 Эта сортировка похожа на сортировку пузырьком, но каждую итерацию имеется разный промежуток
		 между сравниваемыми элементами. Каждую итерацию промежуток уменьшается вдвое.
		*/
		
		// Расчёт промежутка между проверяемыми элементами
		int gap = array.length / 2;
		
		double temp;
		// Пока промежуток между проверяемыми элементами есть, программа работает
		
		while (gap >= 1) {
			
			for (int right = 0; right < array.length; right++) {
			
			/*
				Смещается правый указатель, пока не найдётся такой, что
				между ним и элементом до него не будет нужного промежутка
			*/
				
				for (int c = right - gap; c >= 0; c -= gap) {
					
					if (array[c] > array[c + gap]) {
						
						temp =  array[c];
						
						array[c] = array[c + gap];
						
						array[c + gap] = temp;
						
						temp = 0;
					}
				}
			}
			
			// Пересчёт разрыва
			gap = gap / 2;
		}
		
		return array;
		
	}
	
	
	// СОРТИРОВКА МАССИВА ПО ВОЗРАСТАНИЮ СПОСОБОМ ШЕЛЛА : 2 Вариант
	public static double[] SortMass2( double[] array ) {
		
		double temp = 0;
		int i = 0;
		int check = 0;
		
		do {
			check = 0;
			
			i = 0;
			
			do {
				
				temp = 0;
				
				if ( array[i] <= array[i+1] ) { i++; }
					
					else {
						
						temp = array[i];
						
						array[i] = array[i+1];
						
						array[i+1] = temp;
						
						i = (i+1)-1;
						}
						
			} while ( i < array.length-1);
			
			
			for ( int j = 0; j < array.length-1; j++ ) {
				
				if ( array[j+1] < array[j] ) {
					
					check++;
					}
					
				}
				
		} while (check > 0 );
		
		
		return array;
	}
	
	
	// Вывод на печать одномерного массива
	public static void PrintMass (double[] array) {
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		for ( int i = 0; i < array.length; i++) {
			
			System.out.printf( "%5.3f ", array[i] );
			
			System.out.printf( "(%d)  ", i);
			
		}
		
		System.out.println("");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
}
