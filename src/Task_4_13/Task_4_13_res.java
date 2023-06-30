	
package Task_4_13;
	
import java.util.Scanner;
	
public class Task_4_13_res {
	
/*
	Два простых числа p и q, p > q называются числами-близнецами, если p – q = 2
	Например: p = 7, q = 5 – числа-близнецы,
	p = 31, q = 29 тоже являются числами-близнецами и так далее.
*/
/*
	При проектировании сложных программных систем необходимо ее разделять на все меньшие и меньшие подсистемы,
	каждую из которых можно создать и совершенствовать независимо. Такой процесс называется декомпозиция.
*/
	
	// Ввод данных
	public static int InputInt() {
		
		int check = 1;
		int x = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Введите Данные :.............: " + "  ");
			String xx = scanner.nextLine();
			
			check = 1;
					
				try {
					x = Integer.parseInt(xx);
					}
					catch (NumberFormatException e) {
						
						check = 0;
						System.out.println("------------------------------------------");
						System.out.println("Данные введены не правильно. Введите снова");
						System.out.println("------------------------------------------");
						}
						
					System.out.println("-----------------------------------");
					
				} while ( check == 0 );
				
			return x;
		}
		
		
	// Расчёт и печать всех пар «чисел - близнецов» на отрезке [n,2n], где n - заданное натуральное число больше 2
	public static void PrintPair( int N, int N1 ) {
		
		for ( int i = N; i <= N1; i++ ) {
			
			if ( i + 2 <= N1 )
				{
				System.out.println("---------------------------------------");
				System.out.println("Пары чисел-близнецов : " + i + " и " + (i +2));
				}
				
				else
				{
				System.out.println("---------------------------------------");
				System.out.println("Для числа : " + i + "  " + "Нет числа близнеца");
				}
		}
		
		System.out.println("---------------------------------------");
	}
	
}
