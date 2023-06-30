	
package Task_3_7;
	
import java.math.BigDecimal;
	
import java.math.RoundingMode;
	
import java.util.ArrayList;
	
import java.util.Scanner;
	
public class Task_3_7_res {
	
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
		
		double value1 = 0;
		
		value1 = -10 + ( Math.random() * (10 - (-10) ) );
		
		BigDecimal result = new BigDecimal(value1);
		
		result = result.setScale(3, RoundingMode.UP );
		
		array[0] = result.doubleValue();
		
		// Заполнение массива рандомно
		value1 = 0;
		
		for ( int i = 1; i < X; i++ ) {
			
			do {
				value1 = -10 + ( Math.random() * (10 - (-10) ) );
				
				BigDecimal result1 = new BigDecimal(value1);
				
				result1 = result1.setScale(3, RoundingMode.UP );
				
				array[i] = result1.doubleValue();
				
				} while ( array[i-1] > array[i] );
				
			}
			
			return array;
		}
		
		
		
	// ПОИСК МЕСТ ДЛЯ ВСТАВКИ ЭЛЕМЕНТОВ ВТОРОЙ ПОСЛЕДОВАТЕЛЬНОСТИ В ПЕРВУЮ ПОСЛЕДОВАТЕЛЬНОСТЬ
	
	public static ArrayList<Double> merge(double[] a, double[] b) {
			
			if((a == null) || (b == null)) {
				
				throw new IllegalArgumentException("Последовательности не могут быть нулевыми");
			}
			
			double maxLength = a.length + b.length;
			
			ArrayList<Double> mergedSequence = new ArrayList<Double>();
			
			int indexA = 0, indexB = 0;
			int curIndex = 0;
			
			while (curIndex < maxLength) {
				
				if((indexA < a.length) && (indexB < b.length)) {
					
					if (a[indexA] == b[indexB] ) {
						
						mergedSequence.add( a[indexA++]);
						
						indexB++;
						curIndex += 2;
					}
					
					else if (a[indexA] < b[indexB] ) {
						
						mergedSequence.add( a[indexA++]);
						curIndex++;
					}
					
					else if (b[indexB] < a[indexA]) {
						
						mergedSequence.add( b[indexB++]);
						curIndex++;
					}
					
				}
				
				
				if ((indexB >= b.length) && (indexA < a.length) ) {
					
					mergedSequence.add( a[indexA++]);
					curIndex++;
				}
				
				else if ((indexA >= a.length) && (indexB < b.length)) {
					
					mergedSequence.add( b[indexB++]);
					curIndex++;
				}
				
			}
			
			return mergedSequence;
	}
	
	
	
	// Вывод на печать одномерного массива
	public static void PrintMass1 (ArrayList<Double> array) {
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		for ( int i = 0; i < array.size(); i++)
			{
			System.out.printf( "%5.3f ", array.get(i) );
			System.out.printf( "(%d)  ", i);
			}
			
		System.out.println("");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	
	
	// Вывод на печать одномерного массива
	public static void PrintMass (double[] X) {
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		for ( int i = 0; i < X.length; i++)
			{
			System.out.printf( "%5.3f ", X[i] );
			System.out.printf( "(%d)  ", i);
			}
			
		System.out.println("");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
}
