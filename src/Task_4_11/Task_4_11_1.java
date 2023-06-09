	
/*
	11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр
*/
	
package Task_4_11;
	
public class Task_4_11_1 {
	
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------------------");
		System.out.println("ПРОГРАММА : ОПРЕДЕЛЕНИЕ, В КАКОМ ИЗ ДВУХ ЧИСЕЛ БОЛЬШЕ ЦИФР");
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		
		// Ввод ПЕРВОГО натурального числа : A
		System.out.println("Введите ПЕРВОЕ натуральное число : A");
		System.out.println("------------------------------------");
		
		String A = Task_4_11_res.InputString();
		
		// Ввод ВТОРОГО натурального числа : B
		System.out.println("Введите ВТОРОЕ натуральное число : B");
		System.out.println("------------------------------------");
		
		String B = Task_4_11_res.InputString();
		
		// Вывод на печать : Первое число A и второе число B, Цифры, входящие в первое число A и второе число B, количества цифр в числе A и числе B
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Первое число A : " + A);
		System.out.println("------------------------------------------------------------------------");
		System.out.print("Цифры, входящие в первое число A : ");  Task_4_11_res.PrintString(A);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Количество цифр в числе A : " + A.length());
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");
		
		System.out.println("Второе число B : " + B);
		System.out.println("------------------------------------------------------------------------");
		System.out.print("Цифры, входящие во второе число B : ");   Task_4_11_res.PrintString(B);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Количество цифр в числе B : " + B.length());
		System.out.println("------------------------------------------------------------------------");
		
		
		// Сравнение чисел A и B
		if ( A.length() > B.length() )
			{
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println("Количество цифр, входящих в число A больше количества цифр, входящих в число B на : " + (A.length() - B.length()));
			System.out.println("--------------------------------------------------------------------------------------");
			}
			
		else if ( A.length() == B.length() )
				{
				System.out.println("-----------------------------------------------------------------------------");
				System.out.println("Количество цифр, входящих в число A равно количеству цифр, входящих в число B");
				System.out.println("-----------------------------------------------------------------------------");
				}
				
		else if ( A.length() < B.length() )
				{
				System.out.println("--------------------------------------------------------------------------------------");
				System.out.println("Количество цифр, входящих в число B больше количества цифр, входящих в число A на : " + (B.length() - A.length()));
				System.out.println("--------------------------------------------------------------------------------------");
				}
	}
	
}
