	
package Task_4_11;
	
import java.util.ArrayList;
	
import java.util.Scanner;
	
public class Task_4_11_res {
	
	// Ввод данных 1
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
				
				if( ! ReturnValue) {
					
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
						
					System.out.println("----------------------------------------");
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
	
	
	// Ввод данных 2
	public static String InputString() {
		
		int check = 1;
		
		int check1 = 0;
		
		String x = null;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Введите Данные :.............: " + "  ");
			
			String xx = scanner.nextLine();
			
			check1 = 0;
			
			for ( int Count = 0; Count < xx.length(); Count++ ) {
				
				Boolean ReturnValue = Character.isDigit(xx.charAt(Count));
				
				if( ! ReturnValue) {
					
					check1++;
					
				}
			}
			
			check = 1;
			
			if (check1 == 0 ) {
				
				try {
					x = xx;
					}
					catch (NumberFormatException e) {
						
						check = 0;
						System.out.println("------------------------------------------");
						System.out.println("Данные введены не правильно. Введите снова");
						System.out.println("------------------------------------------");
						}
						
					System.out.println("----------------------------------------");
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
	
	
	// Метод для формирования массива, элементами которого являются цифры числа N
	public static ArrayList<Integer> numberEnter( double A ) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
			
			while(A > 0) {
			
			int i = 0;
			
			double temp = A % 10;
			
			array.add(i, (int) temp);
			
			A = ( A - temp ) / 10;
			
			i++;
			
			}
			
		return array;
	}
	
	
	// Вывод числа на печать по отдельной цифре
	public static void PrintString( String a ) {
		
		System.out.print("[");
		
		for ( int i = 0; i < a.length(); i++ ) {
			
			System.out.print(" " + a.charAt(i) + " ");
			
		}
		
		System.out.print("]");
		
		System.out.println("");
		
	}
	
}
