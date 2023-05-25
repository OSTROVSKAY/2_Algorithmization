	
package Task_3_8;
	
import java.util.ArrayList;
	
import java.util.Scanner;
	
public class Task_3_8_res {
	
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
					
				System.out.println("-----------------------------------");
				
		} while ( check == 0 );
		return x;
	}
	
	
	// Заполнение одномерного массива рандомно
	public static int[] WriteMass ( int[] array, int X ) {
			
			for ( int i = 0; i < X; i++ ) {
				
				array[i] = 1 + (int) ( Math.random()*(10-1) );
				
			}
		return array;
	}
	
	
	// Нахождение наибольшего общего делителя : НОД
	public int Nod ( int a, int b ) {
		
		int Nod = 0;
		
		while ( a != b ) {
			
			if ( a > b ) { a = a - b; }
			
			else { b = b - a; }
		}
		
		Nod = a;
		
		return Nod;
	}
	
	
	// Нахождение наименьшего общего кратного : НОК
	public int Nok ( int x, int y ) {
		
		int Nok = 0;
		
		Nok = ( x / Nod(x, y) ) * y;
		
		return Nok;
	}
	
	
	// Сортировка массива методом ВСТАВОК
	public int[] SortMass (int array []) {
		
		for (int left = 0; left < array.length; left++) {
			
			// Получение значения следующего элемента
			int value = array[left];
			
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
	
}
