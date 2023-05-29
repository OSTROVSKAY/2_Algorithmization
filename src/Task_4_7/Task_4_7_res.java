	
package Task_4_7;
	
public class Task_4_7_res {
	
	// Вычисление факториала числа
	/*
	Факториалом числа называют произведение всех натуральных чисел до него включительно.
	Например, факториал числа 5 равен произведению : 1 * 2 * 3 * 4 * 5 = 120.
	*/
	
	public int Factorial ( int x ) {
		
		int fact = 1;
		
		for ( int i = 1; i <= x; i++ ) {
			
			fact = fact * i;
		}
		
		return fact;
	}

}
