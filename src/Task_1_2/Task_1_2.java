	
/*
	2. Дана последовательность действительных чисел а1, а2, ..., аn
		Заменить все ее члены, большие данного Z,
		этим числом. Подсчитать количество замен.
*/
	
package Task_1_2;
	
import java.math.BigDecimal;
import java.math.RoundingMode;
	
public class Task_1_2 {
	
	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА : ЗАМЕНА ЧЛЕНОВ ПОСЛЕДОВАТЕЛЬНОСТИ, КОТОРЫЕ БОЛЬШЕ Z, ЧИСЛОМ Z");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");
		
		System.out.println("Введите размер массива A[N] : N");
		System.out.println("----------------------------------");
		
		Task_1_2_res Inp = new Task_1_2_res();
		
		int N = 0;
		
		do {
			N = Inp.InputInt();
			
			if ( N <= 0 )
			{
			System.out.println("--------------------------------------------------");
			System.out.println("Введенные данные меньше или равно 0. Введите снова");
			System.out.println("--------------------------------------------------");
			}
			
		} while ( N <= 0 );
		
		System.out.println("Введите число Z :  ");
		System.out.println("----------------------------------");
		
		int Z = Inp.InputInt();
		
		// Объявление одномерного массива размерностью N
		double nums[] = new double[N];
		
		// Заполнение массива рандомно
		double value = 0;
		
		for ( int i = 0; i < N; i++ ) {
			
			value = -100 + ( Math.random() * (100 - (-100) ) );
			BigDecimal result = new BigDecimal(value);
				
			result = result.setScale(3, RoundingMode.UP );
			nums[i] = result.doubleValue();
			}
			
		// Вывод первоначального массива на печать
		System.out.println("-----------------------------------------");
		System.out.println("Вывод первоначального массива на печать :");
		System.out.println("-----------------------------------------");
			
		for ( int i = 0; i < nums.length; i++) {
			
			System.out.println("---------------------------------------------------------------------");
			System.out.printf( "Номер элемента массива : %2d  ||  Значение элемента массива : %5.3f%n", i, nums[i] );
			// System.out.println("Номер элемента массива :  " +  i + "  ||  " + "Значение элемента массива :  " + nums[i] );
			System.out.println("---------------------------------------------------------------------");
			}
			
		System.out.println("---------------------------------------------------------");
		
		// Заменить все члены последовательности, которые больше данного Z, этим числом. Подсчитать количество замен
		
		int a = 0; // Количество замен
		double b = 0; // Первоначальное значение члена последовательности
		
		System.out.println("Вывод на печать замен элементов последовательности на Z :");
		System.out.println("---------------------------------------------------------");
		
		for ( int i = 0; i < nums.length; i++) {
			if ( nums[i] > Z )
				{
				b = nums[i];
				nums[i] = Z;
				a = a + 1;
				System.out.println("----------------------------------------------------------------------------------------------------------------------------");
				System.out.printf("Номер элемента массива :  %2d  ||  Новое значение элемента массива :  %5.3f  ||  Старое значение элемента массива :  %5.3f%n", i, nums[i], b);
				// System.out.println("Номер элемента массива :  " +  i + "  ||  " + "Новое значение элемента массива :  " + nums[i] + "  ||  "  + "Старое значение элемента массива :  " + b);
				System.out.println("----------------------------------------------------------------------------------------------------------------------------");
				}
		}
		System.out.println("-----------------------------------------------");
		
		System.out.println("Вывод на печать изменённой последовательности :");
		System.out.println("-----------------------------------------------");
		
		
		for ( int i = 0; i < nums.length; i++) {
			
			System.out.println("---------------------------------------------------------------------");
			// System.out.println("Номер элемента массива :  " +  i + "  ||  " + "Значение элемента массива :  " + nums[i] );
			System.out.printf( "Номер элемента массива : %2d  ||  Значение элемента массива : %5.3f%n", i, nums[i] );
			System.out.println("---------------------------------------------------------------------");
			}
			
			System.out.println("------------------------");
			System.out.println("Количество замен :  " + a);
			System.out.println("------------------------");
	}
	
}
