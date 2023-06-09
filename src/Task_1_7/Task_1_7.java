	
/*
	7. Даны действительные числа: a1, a2, ..., an.
		Найти :
		max( a1+a2n, a2+a2n-1, ..., an+an+1 )
*/
	
/*								ПРИМЕР :
		Массив действительных чисел : A[N]. Размер массива : N.
		Пусть N=10. Тогда массив будет иметь вид - [a1,a2,a3,a4,a5,a6,a7,a8,a9,a10].
		Согласно заданию необходимо найти максимальное число из чисел :
		[a1+a10,a2+a9,a3+a8,a4+a7,a5+a6].
		Учитывая переместительное свойство сложения в вычислении чисел
		[a10+a1,a9+a2,a8+a3,a7+a4,a6+a5] нет смысла.
		Соотвественно достаточно пройти в цикле только половину массива N/2 и
		вычислять позицию второго слагаемого основываясь на длине массива - N-i.
*/
	
package Task_1_7;
	
import java.math.BigDecimal;
	
import java.math.RoundingMode;
	
public class Task_1_7 {
	
	public static void main(String[] args) {
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("ПРОГРАММА : ВЫЧИСЛЕНИЕ МАКСИМАЛЬНОЙ ИЗ СУММ ЧЛЕНОВ ЭЛЕМЕНТОВ ПОСЛЕДОВАТЕЛЬНОСТИ");
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("Введите размер массива A[N] : N - чётное число");
		System.out.println("----------------------------------------------");
		
		int N = 0;
		
		do {
			N = Task_1_7_res.InputInt();
			
			if ( N <= 0 )
			{
			System.out.println("--------------------------------------------------");
			System.out.println("Введенные данные меньше или равно 0. Введите снова");
			System.out.println("--------------------------------------------------");
			}
				
				if ( N%2 != 0 &  N >= 0)
					{
					System.out.println("-------------------------------------------");
					System.out.println("Введенные данные не кратны 2. Введите снова");
					System.out.println("-------------------------------------------");
					}
					
			} while ( N <= 0 | N%2 != 0 );
			
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
				
			System.out.println("---------------------------------------------------------------------");
			
			
					// ВЫЧИСЛЕНИЕ МАКСИМАЛЬНОЙ ИЗ СУММ ЧЛЕНОВ ЭЛЕМЕНТОВ ПОСЛЕДОВАТЕЛЬНОСТИ
			
			int num = nums.length-1;
			double sum = 0;
			
			System.out.println("-------------------------------------------");
			System.out.println("Суммы членов элементов последовательности :");
			System.out.println("-------------------------------------------");
			
			sum  = (nums[0] + nums[num]);
			
			for ( int i = 0; i < (nums.length/2); i++ ) {
				
				System.out.println("----------------------------------------------------------------------------------------");
				
				System.out.printf( "Номер элемента c начала массива : %3d         ||  Номер элемента с конца массива : %3d%n", i, num );
				// System.out.println("Номер элемента c начала массива : " + i + "  ||   " + "Номер элемента с конца массива : " + num);
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
				System.out.printf( "Значение элемента с начала массива : %7.3f  ||  Значение элемента с конца массива : %7.3f  ||  Сумма элементов массива : %5.3f%n", nums[i], nums[num], (nums[i] + nums[num]) );
				// System.out.println("Значение элемента с начала массива : " + nums[i] + "  ||  " +  "Значение элемента с конца массива : "  +   nums[num] + "  ||  " + "Сумма элементов массива : " + (nums[i] + nums[num]) );
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
				
				
				if ( sum  < (nums[i] + nums[num]) )
					{
					sum = (nums[i] + nums[num]);
					}
				num = num - 1;
			}
			
			// Вычисление суммы последнего и второго члена последовательности
			double sum1 = nums[nums.length-1] + nums[1];
			
			System.out.println("------------------------------------------------------------------");
			System.out.printf("Сумма последнего и второго члена последовательности : %5.3f%n", sum1);
			System.out.println("------------------------------------------------------------------");
			
			if ( sum1 > sum ) {
				
				sum = sum1;
			}
			
			System.out.println("------------------------------------------------------------------");
			System.out.printf( "МАКСИМАЛЬНАЯ ИЗ СУММ ЧЛЕНОВ ЭЛЕМЕНТОВ ПОСЛЕДОВАТЕЛЬНОСТИ : %5.3f%n", sum );
			// System.out.println("МАКСИМАЛЬНАЯ ИЗ СУММ ЧЛЕНОВ ЭЛЕМЕНТОВ ПОСЛЕДОВАТЕЛЬНОСТИ :  " + sum);
			System.out.println("------------------------------------------------------------------");
	}
	
}
