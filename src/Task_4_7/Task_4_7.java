	
/*
	Написать метод (методы) для вычисления суммы факториалов всех нечётных чисел от 1 до 9.
*/
	
package Task_4_7;
	
public class Task_4_7 {
	
	public static void main(String[] args) {
	
		System.out.println("----------------------------------------------------------------------");
		System.out.println("ПРОГРАММА : ВЫЧИСЛЕНИЕ СУММЫ ФАКТОРИАЛОВ ВСЕХ НЕЧЕТНЫХ ЧИСЕЛ ОТ 1 ДО 9");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------");
		
		Task_4_7_res Inp = new Task_4_7_res();
		
		// Вычисление суммы факториалов всех нечетных чисел от 1 до 9
		
		int fact = 0;
		int sum = 0;
		
		for ( int i = 1; i <= 9; i = i + 2 ) {
			
			fact = Inp.Factorial(i);
			System.out.println("ФАКТОРИАЛ НЕЧЁТНОГО ЧИСЛА : " + i + "  " + "РАВЕН : " + fact);
			System.out.println("-----------------------------------------------");
			sum = sum + fact;
			
		}
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("СУММА ФАКТОРИАЛОВ ВСЕХ НЕЧЕТНЫХ ЧИСЕЛ ОТ 1 ДО 9 РАВНА : " + sum );
		System.out.println("---------------------------------------------------------------");
		
	}

}