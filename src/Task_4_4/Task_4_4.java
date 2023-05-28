	
/*
	4. На плоскости заданы своими координатами n точек.
	   Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
	   Указание. Координаты точек занести в массив.
*/
	
package Task_4_4;
	
import java.util.ArrayList;
	
public class Task_4_4 {
	
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("ПРОГРАММА : ВЫЧИСЛЕНИЕ РАССТОЯНИЯ МЕЖДУ ПАРАМИ ТОЧЕК");
		System.out.println("----------------------------------------------------");
		
		// Ввод количества точек
		System.out.println("-------------------------");
		System.out.println("Ввод количества точек : n");
		System.out.println("-------------------------");
		
		Task_4_4_res Inp = new Task_4_4_res();
		
		// Ввод количества точек
		System.out.println("Введите количество точек : n");
		System.out.println("----------------------------");
		
		int N = 0;
		
		do {
			N = Inp.InputInt();
			
			if ( N <= 0 )
				{
				System.out.println("--------------------------------------------------");
				System.out.println("Введенные данные меньше или равно 0. Введите снова");
				System.out.println("--------------------------------------------------");
				}
				
		} while ( N <= 0 );
		
		System.out.println("-----------------------------------------------------");
		
		/*
		 Заполнение ДВУХ ОДНОМЕРНЫХ массивов :
		 ПЕРВЫЙ массив : Координата X точки.
		 ВТОРОЙ массив : Координата Y точки
		*/
		
		// ПЕРВЫЙ массив : Координата X точки.
		double[] X = new double[N];
		
		// ВТОРОЙ массив : Координата Y точки
		double[] Y = new double[N];
			
			for ( int i = 0; i < N; i++ ) {
				
				System.out.println("Введите координаты точки с номером : " + (i+1));
				System.out.println("-----------------------------------------------------");
				
				System.out.print("Координата X : ");
				X[i] = Inp.InputDouble();
				
				System.out.print("Координата Y : ");
				Y[i] = Inp.InputDouble();
				
				System.out.println("-----------------------------------------------------");
				
			}
			
		double dist = 0;
		
		ArrayList<Integer> first_point = new ArrayList<Integer>();
		
		ArrayList<Integer> second_point = new ArrayList<Integer>();
		
		ArrayList<Double> distance = new ArrayList<Double>();
		
		// Вычисление расстояния между точками
		for ( int i = 0; i < N; i++ ) {
			
			for ( int j = 0; j < N; j++ ) {
				
				if ( i != j & X[i] != X[j] & Y[i] != Y[j] ) {
					
					dist = Inp.distance( X[i], X[j], Y[i], Y[j]);
					
					first_point.add(i);
					
					second_point.add(j);
					
					distance.add(dist);
					
					System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
					
					System.out.printf("Расстояние между : Точкой : %2d  С Координатами : ( %5.3f : %5.3f )  И  Точкой : %2d  С Координатами ( %5.3f : %5.3f )  РАВНО : %5.3f%n", (i + 1), X[i], Y[i], (j + 1), X[j], Y[j], dist);
					
					// System.out.println("Расстояние между : " + " Точкой : " + (i + 1) + "  " + "С Координатами :" + " ( " + X[i] + " : " + Y[i] + " ) " + " И " + " Точкой : " + (j + 1) + "  " + " С Координатами :" +  " ( " + X[j] + " : " + Y[j] + " ) " + " РАВНО " + dist);
					
					System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
				}
				
			}
		}
		
		
		// Поиск наибольшего расстояния между двумя точками
		
		double max_dist = distance.get(0);
		
		for ( int i = 0; i < distance.size(); i++ ) {
			
			if ( distance.get(i) > max_dist ) {
				
				max_dist = distance.get(i);
				
			}
			
		}
		
		System.out.println("------------------------------------------------------");
		System.out.printf("НАИБОЛЬШЕЕ РАССТОЯНИЕ МЕЖДУ ДВУМЯ ТОЧКАМИ : %5.3f%n", max_dist);
		System.out.println("------------------------------------------------------");
		
		// Вывод на печать наибольшего расстояния между двумя точками
		for (int x = 0; x < distance.size(); x++ ) {
			
			if ( max_dist == distance.get(x) ) {
				
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.printf("Расстояние между : Точкой : %2d  С Координатами : ( %5.3f : %5.3f )  И  Точкой : %2d  С Координатами ( %5.3f : %5.3f )  РАВНО : %5.3f%n", (first_point.get(x) + 1), X[first_point.get(x)], Y[first_point.get(x)], (second_point.get(x) + 1), X[second_point.get(x)], Y[second_point.get(x)], distance.get(x));
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
			}
			
		}
		
	}
	
}
