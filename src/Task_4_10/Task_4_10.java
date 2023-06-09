	
/*
	10. Дано натуральное число N.
	Написать метод(методы) для формирования массива,
	элементами которого являются цифры числа N.
*/
	
package Task_4_10;
	
import java.util.ArrayList;
	
public class Task_4_10 {
	
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("ПРОГРАММА : ФОРМИРОВАНИЕ МАССИВА, ЭЛЕМЕНТАМИ КОТОРОГО ЯВЛЯЮТСЯ ЦИФРЫ НАТУРАЛЬНОЕ ЧИСЛА N");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------");
		
		// Ввод натурального числа
		System.out.println("Введите натуральное число : N");
		System.out.println("-----------------------------");
		
		double N = 0;
		
		do {
			N = Task_4_10_res.InputDouble();
			
			if ( N <= 0 )
				{
				System.out.println("--------------------------------------------------");
				System.out.println("Введенные данные меньше или равно 0. Введите снова");
				System.out.println("--------------------------------------------------");
				}
				
			} while ( N <= 0 );
			
		// Объявление массива, элементами которого являются цифры числа N
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		// Заполнение массива, элементами которого являются цифры числа N
		array = Task_4_10_res.numberEnter(N);
		
		// Вывод на печать массива, элементами которого являются цифры числа N
		System.out.println("---------------------------------------------------------------------");
		System.out.println("ВЫВОД НА ПЕЧАТЬ МАССИВА, ЭЛЕМЕНТАМИ КОТОРОГО ЯВЛЯЮТСЯ ЦИФРЫ ЧИСЛА N :");
		System.out.println("---------------------------------------------------------------------");
		
		System.out.println("--------------------------------------------------");
		System.out.println(array);
		System.out.println("--------------------------------------------------");
		
	}
	
}
