	
/*
	5. Сортировка вставками. Дана последовательность чисел : a1, a2, ..., an. Требуется переставить числа в порядке
		возрастания. Делается это следующим образом. Пусть : a1, a2, ..., ai - упорядоченная последовательность, т. е.
		a1 <= a2 <= ... <= an. Берется следующее число : ai+1 и вставляется в последовательность так, чтобы новая
		последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от : i+1 до n
		не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
		с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
		Сортировка вставками является устойчивой. Одинаковые элементы последовательности не меняют свой порядок.
*/
	
package Task_3_5;
	
public class Task_3_5 {
	
	public static void main(String[] args) {
		
		System.out.println("------------------------------------------------------");
		System.out.println("ПРОГРАММА : СОРТИРОВКА ПО ВОЗРАСТАНИЮ СПОСОБОМ ВСТАВОК");
		System.out.println("------------------------------------------------------");
		System.out.println("------------------------------------------------------");
		
		// Ввод одномерного массива
		System.out.println("Ввод одномерного массива A[X] :");
		System.out.println("-------------------------------");
		
		// Ввод одномерного массива
		System.out.println("Введите размер одномерного массива : X");
		System.out.println("--------------------------------------");
		
		int X = 0;
		
		do {
			X = Task_3_5_res.InputInt();
			
		if ( X <= 0 )
			{
			System.out.println("--------------------------------------------------");
			System.out.println("Введенные данные меньше или равно 0. Введите снова");
			System.out.println("--------------------------------------------------");
			}
			
		} while ( X <= 0 );
		
		// Объявление одномерного массива A[X]
		int array[] = new int[X];
		
		//Заполнение одномерного массива
		array = Task_3_5_res.WriteMass(array, X);
		
		// Вывод на печать НЕСОРТИРОВАННОГО массива
		System.out.println("--------------------------------------------------------------");
		System.out.println("Вывод на печать НЕСОРТИРОВАННОГО массива. Размер массива : " + array.length);
		System.out.println("--------------------------------------------------------------");
		Task_3_5_res.PrintMass(array);
		
		
		// СОРТИРОВКА МАССИВА ПО ВОЗРАСТАНИЮ СПОСОБОМ ВСТАВОК
		
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
		
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Вывод на печать СОРТИРОВАННОГО МАССИВА МЕТОДОМ ВСТАВОК. Размер массива : " + array.length);
		System.out.println("----------------------------------------------------------------------------");
		Task_3_5_res.PrintMass(array);
		
	}
	
}
