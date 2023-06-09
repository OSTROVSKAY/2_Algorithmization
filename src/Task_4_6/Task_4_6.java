	
/*
	Написать метод (методы), проверяющий, являются ли данные три числа взаимно простыми
*/
	
package Task_4_6;
	
public class Task_4_6 {
	
	public static void main(String[] args) {
		
		System.out.println("--------------------------------------------------");
		System.out.println("ПРОГРАММА : ЯВЛЯЮТСЯ ЛИ ТРИ ЧИСЛА ВЗАИМНО ПРОСТЫМИ");
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		
		// Ввод четырёх натуральных чисел
		System.out.println("-----------------------------");
		System.out.println("Ввод трёх натуральных чисел :");
		System.out.println("-----------------------------");
		
		// Ввод ПЕРВОГО натурального числа
		System.out.println("Введите ПЕРВОЕ натуральное число : A");
		System.out.println("-------------------------------------");
		
		int A = 0;
		
		do {
			A = Task_4_6_res.InputInt();
			
			if ( A <= 0 )
				{
				System.out.println("--------------------------------------------------");
				System.out.println("Введенные данные меньше или равно 0. Введите снова");
				System.out.println("--------------------------------------------------");
				}
				
			} while ( A <= 0 );
			
			
		// Ввод ВТОРОГО натурального числа
		System.out.println("Введите ВТОРОЕ натуральное число : B");
		System.out.println("-------------------------------------");
		
		int B = 0;
		
		do {
			B = Task_4_6_res.InputInt();
			
			if ( B <= 0 )
				{
				System.out.println("--------------------------------------------------");
				System.out.println("Введенные данные меньше или равно 0. Введите снова");
				System.out.println("--------------------------------------------------");
				}
				
			} while ( B <= 0 );
			
			
		// Ввод ТРЕТЬЕГО натурального числа
		System.out.println("Введите ТРЕТЬЕ натуральное число : C");
		System.out.println("-------------------------------------");
		
		int C = 0;
		
		do {
			C = Task_4_6_res.InputInt();
			
			if ( C <= 0 )
				{
				System.out.println("--------------------------------------------------");
				System.out.println("Введенные данные меньше или равно 0. Введите снова");
				System.out.println("--------------------------------------------------");
				}
				
			} while ( C <= 0 );
		
		
		int NOD1 = Task_4_6_res.Nod3(A, B);
		
		int NOD2 = Task_4_6_res.Nod3(NOD1, C);
		
		if ( NOD2 == 1 )
			{
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("ТРИ ЧИСЛА ЯВЛЯЮТСЯ ВЗАИМНО ПРОСТЫМИ. НАИБОЛЬШИЙ ОБЩИЙ ДЕЛИТЕЛЬ РАВЕН : " + NOD2);
			System.out.println("---------------------------------------------------------------------------");
			}
			
			else
				{
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("ТРИ ЧИСЛА НЕ ЯВЛЯЮТСЯ ВЗАИМНО ПРОСТЫМИ. НАИБОЛЬШИЙ ОБЩИЙ ДЕЛИТЕЛЬ РАВЕН : " + NOD2);
				System.out.println("------------------------------------------------------------------------------");
				}
			
		}
	
	}
