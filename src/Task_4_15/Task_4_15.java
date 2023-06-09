	
/*
	15. Найти все натуральные n-значные числа,
	цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).
	Для решения задачи использовать декомпозицию.
*/
	
package Task_4_15;
	
public class Task_4_15 {
	
	public static void main(String[] args) {
	
	System.out.println("--------------------------------------------------------------------------------------------------------------------");
	System.out.println("ПРОГРАММА : НАЙТИ ВСЕ НАТУРАЛЬНЫЕ N - ЗНАЧНЫЕ ЧИСЛА, ЦИФРЫ В КОТОРЫХ ОБРАЗУЮТ СТРОГО ВОЗРАСТАЮЩУЮ ПОСЛЕДОВАТЕЛЬНОСТЬ");
	System.out.println("--------------------------------------------------------------------------------------------------------------------");
	System.out.println("--------------------------------------------------------------------------------------------------------------------");
	
	// Ввод натурального числа N : Число разрядов в n-значном числе
	System.out.println("Введите число разрядов в n-значном числе : N");
	System.out.println("--------------------------------------------");
	
	int N = 0;
		
		do {
			N = Task_4_15_res.InputInt();
			
			if ( N <= 0 )
				{
				System.out.println("--------------------------------------------------");
				System.out.println("Введенные данные меньше или равны 0. Введите снова");
				System.out.println("--------------------------------------------------");
				}
				
			} while ( N <= 0 );
			
		// Расчёт самого малого и самого большого n-значного числа
		System.out.println("----------------------------------------------------------");
		System.out.println("Получение самого малого и самого большого n-значного числа");
		System.out.println("----------------------------------------------------------");
		
		// Расчёт самого малого n-значного числа
		double Num_min = (Math.pow(10, (N-1)));
		
		// Расчёт самого большого n-значного числа
		double Num_max = Task_4_15_res.Number(N);
		
		System.out.printf("Самое малое n-значное число : %9.0f   Самое большое n-значное число :  %9.0f   Количество разрядов в числе : %3d%n", Num_min, Num_max, N );
		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
		
		// Поиск всех натуральных n-значных чисел, цифры в которых образуют строго возрастающую последовательность
		Task_4_15_res.Num_search( Num_min, Num_max );
		
	}
	
}
