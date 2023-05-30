	
package Task_4_9;
	
import java.util.Scanner;
	
public class Task_4_9_res {
	
	// Ввод данных
	public double InputDouble() {
		
		int check = 1;
		double x = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Введите Данные :.............: " + "  ");
			String xx = scanner.nextLine();
			
			check = 1;
			
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
				
			} while ( check == 0 );
			
			return x;
		}
	
	
	// Вычисление площади четырёхугольника : если четырёхугольник - КВАДРАТ или ПРЯМОУГОЛЬНИК
	public double Square_area( double X, double Y ) {
		
		double S = X * Y;
		
		return S;
	}
	
	
	// Вычисление длины гипотенузы прямоугольного треугольника. Теорема Пифагора
	public double hypotenuse ( double Y, double TX ) {
		
		double hyp = Math.sqrt( ( Y * Y ) + ( TX * TX ) );
		
		return hyp;
	}
	
	
	// Площадь трапеции ( S ) равна произведению полусуммы оснований ( A, B ) на высоту ( H )
	public double Sq_rec_trap( double A, double B, double H) {
		
		double S = 0.5 * ( A + B ) * H;
		
		return S;
	}
	
	
}
