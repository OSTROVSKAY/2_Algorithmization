	
/*
	6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
		Делается это следующим образом : сравниваются два соседних элемента : ai и ai+1. Если : ai <= ai+1, то продвигаются
		на один элемент вперед. Если : ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
		Составить алгоритм этой сортировки.
*/
	
	
package Task_3_6;
	
public class Task_3_6 {
	
	public static void main(String[] args) {
	
	System.out.println("----------------------------------------------------");
	System.out.println("ПРОГРАММА : СОРТИРОВКА ПО ВОЗРАСТАНИЮ СПОСОБОМ ШЕЛЛА");
	System.out.println("----------------------------------------------------");
	System.out.println("----------------------------------------------------");
	
	Task_3_6_res Inp = new Task_3_6_res();
	
	// Ввод одномерного массива
	System.out.println("Ввод одномерного массива A[X] :");
	System.out.println("-------------------------------");
	
	// Ввод одномерного массива
	System.out.println("Введите размер одномерного массива : X");
	System.out.println("--------------------------------------");
	
	int X = 0;
	
	do {
		X = Inp.InputInt();
		
	if ( X <= 0 )
		{
		System.out.println("--------------------------------------------------");
		System.out.println("Введенные данные меньше или равно 0. Введите снова");
		System.out.println("--------------------------------------------------");
		}
		
	} while ( X <= 0 );
	
	
	// Объявление первого одномерного массива A[X]
	double array1[] = new double[X];
	
	// Объявление второго одномерного массива A[X]
	double array2[] = new double[X];
	
	//Заполнение первого одномерного массива
	array1 = Inp.WriteMass(array1, X);
	
	//Заполнение второго одномерного массива
	array2 = array1;
	
	// Вывод на печать ПЕРВОГО НЕСОРТИРОВАННОГО массива
	System.out.println("-----------------------------------------------------------------------");
	System.out.println("Вывод на печать ПЕРВОГО НЕСОРТИРОВАННОГО массива. Размер массива : " + array1.length);
	System.out.println("-----------------------------------------------------------------------");
	Inp.PrintMass(array1);
	
	// Вывод на печать ВТОРОГО НЕСОРТИРОВАННОГО массива
	System.out.println("-----------------------------------------------------------------------");
	System.out.println("Вывод на печать ВТОРОГО НЕСОРТИРОВАННОГО массива. Размер массива : " + array2.length);
	System.out.println("-----------------------------------------------------------------------");
	Inp.PrintMass(array2);
	
	// СОРТИРОВКА МАССИВА ПО ВОЗРАСТАНИЮ СПОСОБОМ ШЕЛЛА: 1 Вариант
	Inp.SortMass1(array1);
	
	// СОРТИРОВКА МАССИВА ПО ВОЗРАСТАНИЮ СПОСОБОМ ШЕЛЛА: 2 Вариант
	Inp.SortMass2(array2);
	
	
	System.out.println("--------------------------------------------------------------------------------------");
	System.out.println("Вывод на печать СОРТИРОВАННОГО МАССИВА МЕТОДОМ ШЕЛЛА : 1 Вариант. Размер массива : " + array1.length);
	System.out.println("--------------------------------------------------------------------------------------");
	Inp.PrintMass(array1);
	
	
	System.out.println("--------------------------------------------------------------------------------------");
	System.out.println("Вывод на печать СОРТИРОВАННОГО МАССИВА МЕТОДОМ ШЕЛЛА : 2 Вариант. Размер массива : " + array2.length);
	System.out.println("--------------------------------------------------------------------------------------");
	Inp.PrintMass(array2);
	
	}
	
}
