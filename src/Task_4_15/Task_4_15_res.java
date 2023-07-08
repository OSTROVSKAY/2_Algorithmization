	
package Task_4_15;
	
import java.util.ArrayList;
	
import java.util.Scanner;
	
public class Task_4_15_res {
	
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
					
					System.out.println("--------------------------------------");
					
				} while ( check == 0 );
				
			return x;
		}
	
	
	// Получение n-значного числа
	public static double Number ( int N ) {
		
		double Num = 0;
		
		for (int i = 1; i <= N; i++ ) {
			
			Num = Num * 10 + 9;
			
		}
		
		return Num;
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
		
		
		// Поиск всех натуральных n-значных чисел, цифры в которых образуют строго возрастающую последовательность
		public static int Asc_Seq( ArrayList<Integer> array) {
			
			int check = 0;
			
			for ( int i = 0; i < array.size()-1; i++ ) {
				
				int diff = (int)array.get(i+1) - (int)array.get(i);
				
				if ( diff != 1 ) {
					
					check++;
				}
			}
			
			return check;
		}
		
		
		// Поиск всех натуральных n-значных чисел, цифры в которых образуют строго возрастающую последовательность
		public static void Num_search( double Num_min, double Num_max) {
			
			System.out.println("----------------------------------------------------------------------------------------------------------");
			System.out.print("Числа, цифры в которых образуют строго возрастающую последовательность : ");
			
			for ( double i = Num_min; i <= Num_max; i++) {
				
				ArrayList<Integer> array = numberEnter(i);
				
				int check = Asc_Seq(array);
				
				if ( check == 0 ) {
					
					System.out.print( (int)i + "  ");
					
				}
				
			}
			
			System.out.println("");
			System.out.println("----------------------------------------------------------------------------------------------------------");
		}
	
}
