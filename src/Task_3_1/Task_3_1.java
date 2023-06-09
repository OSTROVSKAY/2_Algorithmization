	
/*
	1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
	один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
	дополнительный массив.
*/
	
package Task_3_1;
	
public class Task_3_1 {
	
	public static void main(String[] args) {
		
		System.out.println("------------------------------------------------");
		System.out.println("ПРОГРАММА : ОБЪЕДИНЕНИЕ ДВУХ ОДНОМЕРНЫХ МАССИВОВ");
		System.out.println("------------------------------------------------");
		System.out.println("------------------------------------------------");
		
		// Ввод первого одномерного массива
		System.out.println("Ввод первого одномерного массива A[X] :");
		System.out.println("---------------------------------------");
		
		// Ввод первого одномерного массива
		System.out.println("Введите размер первого одномерного массива : X");
		System.out.println("----------------------------------------------");
		
		int X = 0;
		
		do {
			X = Task_3_1_res.InputInt();
			
		if ( X <= 0 )
			{
			System.out.println("--------------------------------------------------");
			System.out.println("Введенные данные меньше или равно 0. Введите снова");
			System.out.println("--------------------------------------------------");
			}
			
		} while ( X <= 0 );
		
		// Объявление одномерного массива A[X]
		int A[] = new int[X];
		
		A = Task_3_1_res.WriteMass(A, X);
		
		// Ввод второго одномерного массива
		System.out.println("Ввод второго одномерного массива B[Y] :");
		System.out.println("---------------------------------------");
		
		// Ввод второго одномерного массива
		System.out.println("Введите размер второго одномерного массива : Y");
		System.out.println("----------------------------------------------");
		
		int Y = 0;
		
		do {
			Y = Task_3_1_res.InputInt();
			
			if ( Y <= 0 )
				{
				System.out.println("--------------------------------------------------");
				System.out.println("Введенные данные меньше или равно 0. Введите снова");
				System.out.println("--------------------------------------------------");
				}
				
		} while ( Y <= 0 );
		
		int B[] = new int[Y];
		
		B = Task_3_1_res.WriteMass(B, Y);
		
		// Ввод натурального числа k
		System.out.println("Ввод натурального числа k :");
		System.out.println("---------------------------");
		
		// Ввод натурального числа k
		System.out.println("Введите натуральное число k :");
		System.out.println("-----------------------------");
		
		int K = 0;
		
		do {
			K = Task_3_1_res.InputInt();
			
		if ( K <= 0 )
			{
			System.out.println("--------------------------------------------------");
			System.out.println("Введенные данные меньше или равно 0. Введите снова");
			System.out.println("--------------------------------------------------");
			}
			
		if ( K > A.length )
			{
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("Натуральное число k больше размера первого одномерного массива A[X]. Введите снова");
			System.out.println("----------------------------------------------------------------------------------");
			}
			
		} while ( K <= 0 | K > A.length);
		
		// Вывод на печать ПЕРВОГО массива
		System.out.println("------------------------------------------------------");
		System.out.println("Вывод на печать ПЕРВОГО массива. Размер массива : " + X);
		System.out.println("------------------------------------------------------");
		
		Task_3_1_res.PrintMass(A);
		
		// Вывод на печать ВТОРОГО массива
		System.out.println("------------------------------------------------------");
		System.out.println("Вывод на печать ВТОРОГО массива. Размер массива : " + Y);
		System.out.println("------------------------------------------------------");
		
		Task_3_1_res.PrintMass(B);
		
		// Объединение двух массивов в один массив, включив второй массив между k-м и (k+1)-м элементами первого.
		
		// Объявление итогового одномерного массива C[X+Y]
		int[] C = new int[A.length + B.length];
		
		
		for ( int i = 0; i < C.length; i++ ) {
			
			if ( i < K ) { C[i] = A[i]; }
			
		}
		
		
		for ( int i = K; i < C.length; i++ ) {
			
			if ( (i - K ) < B.length) { C[i] = B[i - K ]; }
		}
		
		
		for ( int i = K + B.length ; i < C.length; i++ ) {
			
			if ( (i - B.length ) < A.length)  { C[i] = A[i- B.length]; }
			
		}
		
		
		// Вывод на печать ИТОГОВОГО массива
		System.out.println("--------------------------------------------------------");
		System.out.println("Вывод на печать ИТОГОВОГО массива. Размер массива : " + C.length);
		System.out.println("--------------------------------------------------------");
		
		Task_3_1_res.PrintMass(C);
		
	}
	
}
