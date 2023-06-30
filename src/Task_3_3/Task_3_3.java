	
/*
	3. Сортировка выбором. Дана последовательность чисел : a1 <= a2 ... <= an. Требуется переставить элементы так,
		чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
		элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
		повторяется. Написать алгоритм сортировки выбором.
*/
	
package Task_3_3;
	
public class Task_3_3 {
	
	public static void main(String[] args) {
		
		System.out.println("--------------------------------------------------");
		System.out.println("ПРОГРАММА : СОРТИРОВКА ПО УБЫВАНИЮ СПОСОБОМ ВЫБОРА");
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		
		// Ввод одномерного массива
		System.out.println("Ввод первого одномерного массива A[X] :");
		System.out.println("---------------------------------------");
		
		// Ввод одномерного массива
		System.out.println("Введите размер одномерного массива : X");
		System.out.println("--------------------------------------");
		int X = 0;
		
		do {
			X = Task_3_3_res.InputInt();
			
		if ( X <= 0 )
			{
			System.out.println("--------------------------------------------------");
			System.out.println("Введенные данные меньше или равно 0. Введите снова");
			System.out.println("--------------------------------------------------");
			}
			
		} while ( X <= 0 );
		
		// Объявление одномерного массива A[X]
		int A[] = new int[X];
		
		//Заполнение одномерного массива
		A = Task_3_3_res.WriteMass(A, X);
		
		// Вывод на печать НЕСОРТИРОВАННОГО массива
		System.out.println("--------------------------------------------------------------");
		System.out.println("Вывод на печать НЕСОРТИРОВАННОГО массива. Размер массива : " + A.length);
		System.out.println("--------------------------------------------------------------");
		Task_3_3_res.PrintMass(A);
		
		// СОРТИРОВКА МАССИВА
		
		int max = 0;
		int max1 = 0;
		int indmax = 0;
		int move = 0;
		
		for ( int i = 0; i < A.length; i++ ) {
		
		max = A[i];
		max1 = A[i];
		
		indmax = i;
			
			for ( int j = i; j < A.length; j++ ) {
				
				if ( A[j] > max ) {
					
					max = A[j]; indmax = j;
					
					}
				}
			
			
			if ( max != max1) { move ++; }
			
			A[i] = max;
			A[indmax] = max1;
			
			max = 0;
			indmax = 0;
			max1 = 0;
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("Число перестановок элементов массива :  " + move);
		System.out.println("--------------------------------------------");
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Вывод на печать массива СОРТИРОВАННОГО МЕТОДОМ ВЫБОРА. Размер массива : " + A.length);
		System.out.println("----------------------------------------------------------------------------");
		Task_3_3_res.PrintMass(A);
		
	}
	
}
