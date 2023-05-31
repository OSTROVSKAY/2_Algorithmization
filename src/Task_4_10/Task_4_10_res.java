	
package Task_4_10;
	
import java.util.ArrayList;
	
import java.util.Scanner;
	
public class Task_4_10_res {
	
	// Натуральные числа — числа, возникающие естественным образом при счёте (1, 2, 3, 4, 5, 6, 7 и так далее)
	
	// Ввод данных
	public double InputDouble() {
		
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
					
					check1 ++;
					
				}
			}
			
			check = 1;
			
			if (check1 == 0 ) {
				
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
	
	
	// Метод для формирования массива, элементами которого являются цифры числа N
	public ArrayList numberEnter( double A ){
		
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
	
}
