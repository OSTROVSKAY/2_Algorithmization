	
package Task_4_5;
	
import java.math.BigDecimal;
	
import java.math.RoundingMode;
	
import java.util.Scanner;
	
public class Task_4_5_res {
	
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
					
				System.out.println("------------------------------------");
				
			} while ( check == 0 );
			
			return x;
		}
	
	
	// Заполнение двумерного массива
	public double[] WriteMass ( double array[]) {
		
		// Заполнение двумерного массива
		double value = 0;
		
		for ( int i = 0; i < array.length; i++ ) {
			
			value = -100 + ( Math.random() * (100 - (-100) ) );
			BigDecimal result = new BigDecimal(value);
			
			result = result.setScale(3, RoundingMode.UP );
			array[i] = result.doubleValue();
			}
		return array;
	}
	
	
	// СОРТИРОВКА МАССИВА ПО ВОЗРАСТАНИЮ СПОСОБОМ ВСТАВОК
	// Сортировка вставками является устойчивой. Одинаковые элементы последовательности не меняют свой порядок.
	
	public double[] SortMass ( double array[]) {
		
		for (int left = 0; left < array.length; left++) {
			
			// Получение значения следующего элемента
			double value = array[left];
			
			// Двоичный поиск места помещения очередного элемента в отсортированную часть массива
			// Перемещение по элементам, которые стоят перед полученным элементом
			
			int i = 0;
			for (i = left - 1; i >= 0; i--) {
				
				// Если получено значение меньшее — передвигается больший элемент дальше
				if (value < array[i]) {
					
					array[i + 1] = array[i];
					
				} else {
					
					// Если полученный элемент больше — нужно останавиться
					break;
				}
			}
			
			// В освободившееся место вставляется полученное значение
			array[i + 1] = value;
		}
		
		return array;
	}
	
	
	// Вывод массива на печать
	public void PrintMass ( double array[]) {
		for ( int i = 0; i < array.length; i++) {
			
			System.out.println("---------------------------------------------------------------------");
			System.out.printf( "Номер элемента массива : %2d  ||  Значение элемента массива : %5.3f%n", i, array[i] );
			// System.out.println("Номер элемента массива :  " +  i + "  ||  " + "Значение элемента массива :  " + nums[i] );
			System.out.println("---------------------------------------------------------------------");
			}
		
		System.out.println("---------------------------------------------------------------------");
	}
	
}
