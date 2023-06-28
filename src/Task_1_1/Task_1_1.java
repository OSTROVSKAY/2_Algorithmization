	
/*
	1. В массив A [N] занесены натуральные числа.
		Найти сумму тех элементов, которые кратны данному К
*/
	
package Task_1_1;
	
public class Task_1_1 {
	
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("ПРОГРАММА : ВЫЧИСЛЕНИЕ СУММЫ ЭЛЕМЕНТОВ МАССИВА, КОТОРЫЕ КРАТНЫ К");
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("Введите размер массива A[N] : N");
		System.out.println("----------------------------------");
		
		int N = 0;
		
		do {
			N = Task_1_1_res.InputInt();
			
			if ( N <= 0 )
			{
			System.out.println("--------------------------------------------------");
			System.out.println("Введенные данные меньше или равно 0. Введите снова");
			System.out.println("--------------------------------------------------");
			}
			
		} while ( N <= 0 );
		
		
		System.out.println("Введите число K :  ");
		System.out.println("----------------------------------");
		
		int K = 0;
		
		do {
			K = Task_1_1_res.InputInt();
			
			if ( K <= 0 )
			{
			System.out.println("--------------------------------------------------");
			System.out.println("Введенные данные меньше или равно 0. Введите снова");
			System.out.println("--------------------------------------------------");
			}
			
		} while ( K <= 0 );
		
		
		// Объявление одномерного массива размерностью N
		int nums[] = new int[N];
		
		// Заполнение массива рандомно
		
		for ( int i = 0; i < N; i++ ) {
			
			nums[i] = 1 + (int) ( Math.random()*(100-1) );
			
		}
		
		// Вывод массива на печать
		System.out.println("----------------------------------");
		System.out.println("Вывод массива на печать :");
		System.out.println("--------------------------------------------------------------------");
		
		for ( int i = 0; i < nums.length; i++) {
			System.out.println("--------------------------------------------------------------------");
			
			System.out.printf("Номер элемента массива : %3d  ||  Значение элемента массива : %3d%n",i,nums[i]);
		// System.out.println("Номер элемента массива :  " +  i + "  ||  " + "Значение элемента массива :  " + nums[i] );
		}
		System.out.println("--------------------------------------------------------------------");
		
		
		// Найти сумму тех элементов, которые кратны данному К
		
		System.out.println("----------------------------------------------------");
		System.out.println("Элементы массива, которые кратны K. K равно :  " + K);
		
		int sum = 0;
		
		for ( int i = 0; i < nums.length; i++) {
			
			if ( (nums[i] % K) == 0 ) {
				
				sum = sum + nums[i];
				
				System.out.println("--------------------------------------------------------------------------------------------");
				System.out.printf("Номер элемента : %3d  ||  Значение элемента : %3d  ||  Делитель : %3d  ||  Результат : %3d%n" ,i ,nums[i] ,K ,(nums[i] / K) );
				//System.out.println("Номер элемента :  " + i + " || " + "Значение элемента :  " + nums[i] + " || "  +  "Делитель :  " + K + " || " + "Результат :  " + nums[i] / K);
			}
			
		}
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------");
		System.out.println("Сумма элементов массива, которые кратны K :  " + sum);
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		
	}
	
}
