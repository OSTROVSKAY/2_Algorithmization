	
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
	
	
	// Площадь трапеции ( S ) равна произведению полусуммы оснований ( A, B ) на высоту ( H ). Трапеция - прямоугольная
	public double Sq_rec_trap( double A, double B, double H) {
		
		double S = 0.5 * ( A + B ) * H;
		
		return S;
	}
	
	
	// Площадь четырёхугольника : В четырёхугольнике один угол прямой
	public double quadrilateral (double X, double Y, double Z, double T) {
		
		double hyp = Math.sqrt ( ( X * X ) + ( Y * Y ) );
		
		double aa = Math.toDegrees ( Math.acos ( ( Z*Z + hyp*hyp - T*T ) / ( 2 * Z * hyp ) ) );
		
		double bb = Math.toDegrees ( Math.acos ( ( T*T + hyp*hyp - Z*Z ) / ( 2 * T * hyp ) ) );
		
		double yy = Math.toDegrees ( Math.acos ( ( T*T + Z*Z - hyp*hyp ) / ( 2 * T * Z ) ) );
		
		double S_com = 0;
		
		if ( (! Double.isNaN(aa)) & (! Double.isNaN(bb)) & (! Double.isNaN(yy)) ) {
			double S1 = 0.5 * X * Y;
			
			System.out.println("--------------------------------------");
			
			System.out.printf("Площадь ПЕРВОГО треугольника : %6.3f%n", S1 );
			//System.out.println("Площадь ПЕРВОГО треугольника : " + S1);
			System.out.println("--------------------------------------");
			
			double Sum_angl = aa + bb + yy;
			
			System.out.println("------------------------------------------------------------------------");
			
			System.out.printf("Сумма углов во ВТОРОМ треугольнике : %6.3f = %6.3f + %6.3f + %6.3f%n", Sum_angl, aa, bb, yy );
			// System.out.println("Сумма углов во ВТОРОМ треугольнике : " + Sum_angl + "  " + aa + "  " + bb + "  " + yy);
			System.out.println("------------------------------------------------------------------------");
			
			double S2_1 = 0.5 * Z * T * Math.sin ( Math.toRadians ( yy ) );
			
			double S2_2 = 0.5 * Z * hyp * Math.sin ( Math.toRadians( aa) );
			
			double S2_3 = 0.5 * hyp * T * Math.sin ( Math.toRadians( bb ) );
			
			System.out.println("-------------------------------------------------------");
			
			System.out.printf("Площадь ВТОРОГО треугольника : %6.3f  %6.3f  %6.3f%n", S2_1, S2_2, S2_3 );
			//System.out.println("Площадь ВТОРОГО треугольника : " + S2_1 + "  " + S2_2 + "  " + S2_3);
			System.out.println("-------------------------------------------------------");
			
			double S2 = ( S2_1 + S2_2 + S2_3 ) / 3;
			
			System.out.println("---------------------------------------");
			
			System.out.printf("Площадь ВТОРОГО треугольника : %6.3f%n", S2 );
			//System.out.println("Площадь ВТОРОГО треугольника : " + S2 );
			System.out.println("---------------------------------------");
			
			S_com = S1 + S2_1;
			
		}
		return S_com;
		
	}
	
}
