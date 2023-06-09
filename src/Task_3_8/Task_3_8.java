
/*
	8.Даны дроби : ( p1 / q1 ), ( p2 / q2 ), ... ,( pn / qn)  ( pi, qi - натуральные числа ).
	 Натуральные числа - ( 1, 2, 3, 4, 5, 6, 7 и так далее )
	 Составить программу, которая приводит эти дроби к общему
	 знаменателю и упорядочивает их в порядке возрастания.
*/

package Task_3_8;
	
public class Task_3_8 {
	
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------------");
		System.out.println("ПРОГРАММА : УПОРЯДОЧИВАНИЕ ПОСЛЕДОВАТЕЛЬНОСТИ ДРОБЕЙ");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		
		// Ввод количества ЧИСЛИТЕЛЕЙ и ЗНАМЕНАТЕЛЕЙ
		System.out.println("Ввод количества ЧИСЛИТЕЛЕЙ и ЗНАМЕНАТЕЛЕЙ : N");
		System.out.println("---------------------------------------------");
		
		int N = 0;
		
		do {
			N = Task_3_8_res.InputInt();
			
		if ( N <= 0 )
			{
			System.out.println("--------------------------------------------------");
			System.out.println("Введенные данные меньше или равно 0. Введите снова");
			System.out.println("--------------------------------------------------");
			}
			
		} while ( N <= 0 );
		
		// Объявление ПЕРВОГО массива P[N] : Массив ЧИСЛИТЕЛЕЙ.
		int[] P = new int[N];
		
		// Объявление ВТОРОГО массива Q[N] : Массив ЗНАМЕНАТЕЛЕЙ.
		int[] Q = new int[N];
		
		// Заполнение ПЕРВОГО массива P[N] : Массив ЧИСЛИТЕЛЕЙ.
		P = Task_3_8_res.WriteMass(P, N);
		
		// Заполнение ВТОРОГО массива Q[N] : Массив ЗНАМЕНАТЕЛЕЙ.
		Q = Task_3_8_res.WriteMass(Q, N);
		
		// Вывод на печать НАЧАЛЬНОГО массива дробей
		System.out.println("----------------------------------------------------------------");
		System.out.println("Вывод на печать НАЧАЛЬНОГО массива дробей. Размер массива : " +  N);
		System.out.println("----------------------------------------------------------------");
		
		for ( int i = 0; i < N; i++)
			{
			System.out.println("----------------------------------------");
			System.out.println("№ дроби : " + (i+1) +"   " + "Дробь : " + " " + P[i] + " / " +  Q[i] + "    ");
			System.out.println("----------------------------------------");
			}
		
		
		// НАХОЖДЕНИЕ НАИМЕНЬШЕГО ОБЩЕГО КРАТНОГО МАССИВА ЗНАМЕНАТЕЛЕЙ ДРОБЕЙ
		
		int Nok1 = Task_3_8_res.Nok(Q[0],Q[1]);
		
		for ( int i = 2; i < Q.length; i++ )
			{
			Nok1 = Task_3_8_res.Nok(Nok1,Q[i]);
			}
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("НАИМЕНЬШЕЕЕ ОБЩЕЕ КРАТНОЕ МАССИВА ЗНАМЕНАТЕЛЕЙ ДРОБЕЙ : " + Nok1);
		System.out.println("----------------------------------------------------------------");
		
		int temp = 0;
		
		for ( int i = 0; i < Q.length; i++ ) {
			
			temp = P[i] * (Nok1 / Q[i]);
			
			P[i] = temp;
			
			temp = 0;
			
		}
		
		
		// Вывод на печать ИТОГОВОГО массива дробей
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Вывод на печать ИТОГОВОГО НЕСОРТИРОВАННОГО массива дробей. Размер массива : " +  N);
		System.out.println("-------------------------------------------------------------------------------");
		
		for ( int i = 0; i < N; i++)
			{
			System.out.println("------------------------------------------");
			System.out.println("№ дроби : " + (i+1) +"   " + "Дробь : " + " " + P[i] + " / " +  Nok1 + "    ");
			System.out.println("------------------------------------------");
			}
		
		
		// Сортировка ИТОГОВОГО массива методом ВСТАВОК
		P = Task_3_8_res.SortMass(P);
		
		// Вывод на печать ИТОГОВОГО СОРТИРОВАННОГО СОРТИРОВАННОГО массива дробей
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Вывод на печать ИТОГОВОГО СОРТИРОВАННОГО массива дробей. Размер массива : " +  N);
		System.out.println("------------------------------------------------------------------------------");
		
		for ( int i = 0; i < N; i++) {
		
		System.out.println("------------------------------------------");
		System.out.println("№ дроби : " + (i+1) +"   " + "Дробь : " + " " + P[i] + " / " +  Nok1 + "    ");
		System.out.println("------------------------------------------");
		}
		
	}
	
}
