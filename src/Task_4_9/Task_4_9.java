	
/*
	9. Даны числа X, Y, Z, Т — длины сторон четырёхугольника.
	 Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
*/
	
package Task_4_9;
	
public class Task_4_9 {
	
	public static void main(String[] args) {
		
		System.out.println("-----------------------------------------------");
		System.out.println("ПРОГРАММА : ВЫЧИСЛЕНИЕ ПЛОЩАДИ ЧЕТЫРЁХУГОЛЬНИКА");
		System.out.println("-----------------------------------------------");
		System.out.println("-----------------------------------------------");
		
		// Ввод длин ЧЕТЫРЁХ сторон четырёхугольника : X, Y, Z, Т
		System.out.println("--------------------------------------------------------");
		System.out.println("Ввод длин ЧЕТЫРЁХ сторон четырёхугольника - X, Y, Z, Т :");
		System.out.println("--------------------------------------------------------");
		System.out.println("Угол между сторонами длиной X и Y — прямой");
		System.out.println("------------------------------------------");
		
		// Ввод длины ПЕРВОЙ стороны четырехугольника : X
		System.out.println("-------------------------------------------------");
		System.out.println("Введите длину ПЕРВОЙ стороны четырёхугольника : X");
		System.out.println("-------------------------------------------------");
		
		double X = 0;
		
		do {
			X = Task_4_9_res.InputDouble();
				
				if ( X <= 0 )
					{
					System.out.println("--------------------------------------------------");
					System.out.println("Введенные данные меньше или равно 0. Введите снова");
					System.out.println("--------------------------------------------------");
					}
					
			} while ( X <= 0 );
		
		
		// Ввод длины ВТОРОЙ стороны четырехугольника : Y
		System.out.println("-------------------------------------------------");
		System.out.println("Введите длину ВТОРОЙ стороны четырёхугольника : Y");
		System.out.println("-------------------------------------------------");
		
		double Y = 0;
		
		do {
			Y = Task_4_9_res.InputDouble();
				
				if ( Y <= 0 )
					{
					System.out.println("--------------------------------------------------");
					System.out.println("Введенные данные меньше или равно 0. Введите снова");
					System.out.println("--------------------------------------------------");
					}
					
			} while ( Y <= 0 );
		
		
		// Ввод длины ТРЕТЬЕЙ стороны четырехугольника : Z
		System.out.println("--------------------------------------------------");
		System.out.println("Введите длину ТРЕТЬЕЙ стороны четырёхугольника : Z");
		System.out.println("--------------------------------------------------");
		
		double Z = 0;
		
		do {
			Z = Task_4_9_res.InputDouble();
				
				if ( Z <= 0 )
					{
					System.out.println("--------------------------------------------------");
					System.out.println("Введенные данные меньше или равно 0. Введите снова");
					System.out.println("--------------------------------------------------");
					}
					
			} while ( Z <= 0 );
		
		
		// Ввод длины ЧЕТВЁРТОЙ стороны четырехугольника : Т
		System.out.println("----------------------------------------------------");
		System.out.println("Введите длину ЧЕТВЁРТОЙ стороны четырёхугольника : Т");
		System.out.println("----------------------------------------------------");
		
		double T = 0;
		
		do {
			T = Task_4_9_res.InputDouble();
				
				if ( T <= 0 )
					{
					System.out.println("--------------------------------------------------");
					System.out.println("Введенные данные меньше или равно 0. Введите снова");
					System.out.println("--------------------------------------------------");
					}
					
			} while ( T <= 0 );
		
		
		// Вывод на печать размера сторон четырёхугольника
		
		System.out.println("-------------------------------------------------");
		System.out.println("ВЫВОД НА ПЕЧАТЬ РАЗМЕРА СТОРОН ЧЕТЫРЁХУГОЛЬНИКА :");
		System.out.println("-------------------------------------------------");
		
		System.out.println("---------------------------------");
		System.out.printf("ПЕРВАЯ сторона - X :      %6.3f%n", X);
		//System.out.println("ПЕРВАЯ сторона - X :       " + X );
		
		System.out.println("---------------------------------");
		System.out.printf("ВТОРАЯ сторона - Y :      %6.3f%n", Y);
		//System.out.println("ВТОРАЯ сторона - Y :       " + Y );
		
		System.out.println("---------------------------------");
		System.out.printf("ТРЕТЬЯ сторона - Z :      %6.3f%n", Z);
		//System.out.println("ТРЕТЬЯ сторона - Z :       " + Z );
		
		System.out.println("---------------------------------");
		System.out.printf("ЧЕТВЁРТАЯ сторона - Т :   %6.3f%n", T);
		//System.out.println("ЧЕТВЁРТАЯ сторона - Т :    " + Т );
		
		System.out.println("---------------------------------");
		
		// Вычисление площади четырёхугольника
		System.out.println("-------------------------------------");
		System.out.println("ВЫЧИСЛЕНИЕ ПЛОЩАДИ ЧЕТЫРЁХУГОЛЬНИКА :");
		System.out.println("-------------------------------------");
		
		// Если четырёхугольник - КВАДРАТ
		if ( X == Y & X == Z & X == T & Y == Z & Y == T & Z == T )
			{
			double S1 = Task_4_9_res.Square_area( X, Y );
			
			System.out.println("-----------------------------------------------------------------");
			System.out.printf("Вид четырёхугольника - КВАДРАТ. Площадь КВАДРАТА равна :  %6.3f%n", S1);
			System.out.println("-----------------------------------------------------------------");
			}
			
		else if ( X == T & Z == Y )
			{
			double S2 = Task_4_9_res.Square_area( X, Y );
			
			System.out.println("------------------------------------------------------------------------------");
			System.out.printf("Вид четырёхугольника - ПРЯМОУГОЛЬНИК. Площадь ПРЯМОУГОЛЬНИКА равна :  %6.3f%n", S2);
			System.out.println("------------------------------------------------------------------------------");
			}
			
		else if ( T > X )
			{
			double TX = T - X;
			
			double Z1 = Task_4_9_res.hypotenuse(Y, TX);
			
			if ( Z == Z1 )
				{
				double S3 = Task_4_9_res.Sq_rec_trap(X, T, Y);
				
				System.out.println("-----------------------------------------------------------------------------------------------");
				System.out.printf("Вид четырёхугольника - ПРЯМОУГОЛЬНАЯ ТРАПЕЦИЯ. Площадь ПРЯМОУГОЛЬНОЙ ТРАПЕЦИИ равна :  %6.3f%n", S3);
				System.out.println("-----------------------------------------------------------------------------------------------");
				}
				
				else
				{
				double S4 = Task_4_9_res.quadrilateral( X, Y, Z, T);
				
				if ( S4 > 0)
					{
					System.out.println("------------------------------------------");
					System.out.printf("Площадь ЧЕТЫРЁХУГОЛЬНИКА равна :  %6.3f%n", S4);
					System.out.println("------------------------------------------");
					}
				else
					{
					System.out.println("---------------------------------------------");
					System.out.println("Площадь ЧЕТЫРЁХУГОЛЬНИКА вычислить невозможно");
					System.out.println("---------------------------------------------");
					}
				}
			}
			
			else if ( X > T )
				{
				double XT = X - T;
				
				double Z2 = Task_4_9_res.hypotenuse(Y, XT);
				
				if ( Z == Z2 )
					{
					double S4 = Task_4_9_res.Sq_rec_trap(T, X, Y);
					
					System.out.println("-----------------------------------------------------------------------------------------------");
					System.out.printf("Вид четырёхугольника - ПРЯМОУГОЛЬНАЯ ТРАПЕЦИЯ. Площадь ПРЯМОУГОЛЬНОЙ ТРАПЕЦИИ равна :  %6.3f%n", S4);
					System.out.println("-----------------------------------------------------------------------------------------------");
					}
					
				else
					{
					double S5 = Task_4_9_res.quadrilateral( X, Y, Z, T);
					
					if ( S5 > 0)
						{
						System.out.println("------------------------------------------");
						System.out.printf("Площадь ЧЕТЫРЁХУГОЛЬНИКА равна :  %6.3f%n", S5);
						System.out.println("------------------------------------------");
						}
						
					else
						{
						System.out.println("---------------------------------------------");
						System.out.println("Площадь ЧЕТЫРЁХУГОЛЬНИКА вычислить невозможно");
						System.out.println("---------------------------------------------");
						}
					}
			}
		
	}
	
}
