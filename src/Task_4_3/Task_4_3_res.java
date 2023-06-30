	
package Task_4_3;
	
import java.util.Scanner;
	
public class Task_4_3_res {
	
	// Ввод данных
	public static double Input() {
		
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
					
				System.out.println("--------------------------------------");
				
			} while ( check == 0 );
			
			return x;
		}
	
	
	/*
	Правильный шестиугольник содержит 6 правильных (равносторонних) треугольников.
	Чтобы узнать площадь правильного треугольника, нужно вывести формулу из площади для произвольного треугольника.
	Так как треугольник равносторонний, то углы при основании равны 60 градусов :
	
	S = 1/2 * a * b * sin (a)     Угол a равен 60 градусов, a = b
	
	S = 1/2 * a * a * sqrt(3)/2 = ( a * a * sqrt(3) ) / 4
	
	Количество таких треугольников - 6 :
	
	S = a * a * sqrt(3) / 4 * 6 = 3 * a * a * sqrt(3) / 2
	
	*/
	
	// Площадь правильного треугольника
	public static double Square ( double a ) {
		
		double S1 = ( a * a * Math. sqrt(3) ) / 4;
		
		return S1;
	}
	
}
