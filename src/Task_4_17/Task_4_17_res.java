	
package Task_4_17;
	
import java.util.Scanner;
	
public class Task_4_17_res {
	
	// Ввод данных
	public static double InputDouble() {
		
		int check = 1;
		int check1 = 0;
		
		double x = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Введите Данные :.............: " + "  ");
			
			String xx = scanner.nextLine();
			
			check1 = 0;
			
			for ( int Count = 0; Count < xx.length(); Count++ ) {
				
				Boolean ReturnValue = Character.isDigit(xx.charAt(Count));
				
				if( ! ReturnValue ) {
					
					check1++;
					
				}
			}
			
			check = 1;
			
			if ( check1 == 0 ) {
				
				try {
					x = Double.parseDouble(xx);
					}
					catch (NumberFormatException e) {
						
						check = 0;
						System.out.println("------------------------------------------");
						System.out.println("Данные введены не правильно. Введите снова");
						System.out.println("------------------------------------------");
						}
						
					System.out.println("-----------------------------------");
				}
				
			else
				{
				System.out.println("------------------------------------------");
				System.out.println("Данные введены не правильно. Введите снова");
				System.out.println("------------------------------------------");
				}
				
			} while ( check == 0 | check1 > 0 );
			
		return x;
		
	}
	
	
	// Сумма цифр заданного числа N
	public static double SumNumber( double N ) {
			
			double Sum = 0;
			
			while (N > 0) {
				
				double temp = N % 10;
				
				Sum = Sum + temp;
				
				N = ( N - temp ) / 10;
				
				}
				
				return Sum;
		}
		
	
/*
	Из заданного числа вычитается сумма его цифр. Из результата вновь вычитается сумма цифр числа и так далее до получения нуля.
	Расчёт количества этих действий.
*/
	public static void Subtraction( double N ) {
		
		int count = 0;
		
		while (N > 0) {
			
			double Sum = SumNumber(N);
			
			count++;
			
			System.out.println("------------------------------------------------------------------------------------------------------");
			
			System.out.printf("Номер вычитания : %3d  Число : %4d  Сумма цифр числа : %3d  Разность числа и суммы цифр числа : %3d%n", count, (int)N, (int)Sum, (int)(N -Sum) );
			//System.out.println("Число : " + (int)N + "   " + "Сумма цифр числа : " + (int)Sum + "   " + "Разность числа и суммы цифр числа : " + (int)(N -Sum));
			
			N = N - Sum;
			
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("Количество вычитаний из заданного числа суммы его цифр : " + count);
		System.out.println("-------------------------------------------------------------");
	}
	
}
