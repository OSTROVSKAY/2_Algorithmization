	
package Task_2_7;
	
import java.util.Scanner;
	
public class Task_2_7_res {
	
	// Ввод данных
	
	public int InputInt() {
		
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
					
					System.out.println("----------------------------------");
					
					} while ( check == 0 );
					return x;
		}
		
		
/*
	В Java Math.cos() возвращает косинус указанного в радианах double значения.
	В Java Math.sin() возвращает синус указанного в радианах double значения.
	В Java Math.tan() возвращает тангенс указанного в радианах double значения.
*/
	
	public double Input( int I, int J, int N) {
			
			double x;
			x = Math.sin( Math.toRadians( ( I*I - J*J ) / N ) );
			return x;
		}
	}
