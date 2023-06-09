	
package Task_4_1;
	
import java.util.Map;
	
import java.util.Scanner;
	
import java.util.Set;
	
import java.util.HashMap;
	
import java.util.HashSet;
	
public class Task_4_1_res {
	
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
					
					System.out.println("-----------------------------------");
					
			} while ( check == 0 );
			
			return x;
		}
	
	
	/*
	 НОД ( Наибольший общий делитель) двух целых чисел, не равных нулю, -
	 это наибольшее положительное целое число, на которое каждое из целых чисел делится без остатка.
	*/
	
	// Вычисление наибольшего общего делителя : НОД. 1 Вариант
	
	/* Алгоритм Евклида :
	 1. Из большего числа вычитаем меньшее.
	 2. Если получается 0, значит, числа равны друг другу и являются НОД (следует выйти из цикла).
	 3. Если результат вычитания не равен 0, то большее число заменяем на результат вычитания.
	 4. Переход к пункту 1.
	    Сложность алгоритма Евклида равна : O(Log min(n1, n2))
	*/
	
	public static int Nod1 ( int a, int b ) {
		
		int Nod = 0;
		
		while ( a != b ) {
			
			if ( a > b ) { a = a - b; }
			
			else { b = b - a; }
		}
		
		Nod = a;
		
		return Nod;
	}
	
	
	// Вычисление наибольшего общего делителя : НОД. 2 Вариант
	
	/*
	 Перебираются числа от 1 до наименьшего заданного числа и проверяется,
	 делятся ли заданные целые числа на индекс. Наибольший индекс, который делит заданные числа,
	 является НОД данных чисел.
	 Сложность приведенной выше реализации составляет O(min(n1, n2)),
	 потому что нужно повторить цикл в течение n раз
	 (эквивалентно меньшему числу), чтобы найти НОД.
	*/
	public static int Nod2 (int a, int b) {
		
		int Nod = 1;
		
		for (int i = 1; i <= a && i <= b; i++) {
			
			if (a % i == 0 && b % i == 0) {
				
				Nod = i;
			}
		}
		
		return Nod;
	}
	
	
	// Вычисление наибольшего общего делителя : НОД. 3 Вариант
	
	/*
	 Алгоритм Штейна или Двоичный алгоритм НОД.
	 Алгоритм Штейна, также известный как двоичный алгоритм GCD ( НОД ),
	 чтобы найти GCD двух неотрицательных целых чисел. Этот алгоритм использует простые арифметические операции,
	 такие как арифметические сдвиги, сравнение и вычитание.
	 Алгоритм Штейна неоднократно применяет следующие основные тождества, связанные с GCD, чтобы найти GCD
	 из двух неотрицательных целых чисел:
	 1. НОД(0, 0) = 0, НОД(n1, 0) = n1, НОД(0, n2) = n2
	 2. Когда n1 и n2 являются четными целыми числами, то gcd(n1, * gcd(n1/2, n2/2) , так как 2 является общим делителем.
	 3. Если n1 четное целое число и n2 нечетное целое число, то gcd(n 1,(n1/2, n2) , так как 2 не является общим делителем и наоборот.
	 4. Если n1 и n2 являются нечетными целыми числами, и n1 , то gcd(n1, ((n1-n2)/2, n2) и наоборот.
	 Шаги 2-4 повторяются до тех пор, пока n1 не станет равным n2 или n1 = 0.
	 GCD ( НОД ) - это (2 n ) * n2 . Здесь n – это число раз, когда 2 встречается в n1 и n2 при выполнении шага 2.
	 В Алгоритме Штейна используются арифметические операции сдвига, чтобы разделить или умножить на 2.
	 Далее используется вычитание, чтобы уменьшить заданные числа.
	 Сложность алгоритма Штейна :
	 Когда n1 > n2 является O((log 2 n1) 2 ).
	 Когда n1 < n2, является O((log 2 n2) 2 ).
	*/
	
	public static int Nod3 (int a, int b) {
		
		if (a == 0) { return b; }
		
		if (b == 0) { return a; }
		
		int n;
		
		for (n = 0; ((a | b) & 1) == 0; n++)
			{
			a >>= 1;
			b >>= 1;
			}
			
		while ((a & 1) == 0) { a >>= 1; }
		
		
		do {
			while ((b & 1) == 0)
				{
				b >>= 1;
				}
				
			if (a > b) {
				
				int temp = a;
				a = b;
				b = temp;
				}
				
			b = (b - a);
			
		} while (b != 0);
		
		return a << n;
	}
	
	
	// Вычисление наибольшего общего делителя : НОД. 4 Вариант
	
	/*
	 Алгоритм нахождения НОД делением :
	 1. Большее число делится на меньшее.
	 2. Если делится без остатка, то меньшее число и есть НОД (следует выйти из цикла).
	 3. Если есть остаток, то большее число замененяется на остаток от деления.
	 4. Переход к пункту 1.
	
	 В цикле в переменную a или b записывается остаток от деления.
	 Цикл завершается, когда хотя бы одна из переменных равна нулю.
	 Это значит, что другая содержит НОД.
	 Однако какая именно, неизвестно.
	 Поэтому для определения НОД находится сумма этих переменных.
	 Поскольку в одной из переменных ноль, он не оказывает влияние на результат.
	*/
	
	public static int Nod4 (int a, int b) {
		
		while ( a != 0 & b != 0 ) {
			
			if ( a > b ) { a = a % b; }
			
			else { b = b % a; }
			
		}
		
		return a + b;
	}
	
	
	/*
	 Наименьшее общее кратное ( НОК ) ( LCM ) двух ненулевых целых чисел (a, b) —
	 это наименьшее положительное целое число, которое делится без остатка как на a, так и на b.
	*/
	
	// Вычисление наименьшего общего кратного, с использованием Алгоритма Евклида : НОК. 1 Вариант
	public static int Nok1 ( int x, int y ) {
		
		int Nok = 0;
		
		Nok = ( x / Nod1(x, y) ) * y;
		
		return Nok;
	}
	
	
	// Вычисление наименьшего общего кратного : НОК. 2 Вариант
	
	/*
	 Алгоритм включает в себя выполнение нескольких математических операций над числами :
	 нахождение абсолютных, минимальных и максимальных значений.
	 Для этой цели используются соответствующие статические методы класса Math :
	 abs(), min() и max().
	*/
	
	public static int lcm1(int number1, int number2) {
		
		if (number1 == 0 || number2 == 0) {
			
			return 0;
		}
		
		int absNumber1 = Math.abs(number1);
		
		int absNumber2 = Math.abs(number2);
		
		int absHigherNumber = Math.max(absNumber1, absNumber2);
		
		int absLowerNumber = Math.min(absNumber1, absNumber2);
		
		int lcm = absHigherNumber;
		
		while (lcm % absLowerNumber != 0) {
			
			lcm += absHigherNumber;
		}
		return lcm;
	}
	
	
	// Вычисление наименьшего общего кратного : НОК. 3 Вариант
	
	/*
	 Использование подхода первичной факторизации :
	 Mожно выразить каждое целое число больше единицы как произведение степеней простых чисел.
	*/
	
	/*
	 Реализация на Java использует представление двух чисел в виде простой факторизации для нахождения LCM.
	 Для этого метод getPrimeFactors() должен принимать целочисленный аргумент
	 и давать его представление простой факторизации.
	 В Java можно представить простую факторизацию числа с помощью HashMap,
	 где каждый ключ обозначает простой множитель, а значение, связанное с ключом,
	 означает показатель степени соответствующего множителя.
	*/
	/*
	Итеративная реализация метода getPrimeFactors() :
	*/
	
	public static Map<Integer, Integer> getPrimeFactors(int number) {
		
		int absNumber = Math.abs(number);
		
		Map<Integer, Integer> primeFactorsMap = new HashMap<Integer, Integer>();
		
		for (int factor = 2; factor <= absNumber; factor++) {
			
			while (absNumber % factor == 0) {
				
				Integer power = primeFactorsMap.get(factor);
				
				if (power == null) {
					
					power = 0;
					
				}
				primeFactorsMap.put(factor, power + 1);
				
				absNumber /= factor;
			}
		}
		
		return primeFactorsMap;
	}
	
	
	/*
	 Метод lcm() сначала использует метод getPrimeFactors(), чтобы найти карту простой факторизации для каждого числа.
	 Затем он использует карту простой факторизации обоих чисел, чтобы найти их LCM.
	 Метод имеет итеративную реализацию :
	*/
	
	public static int lcm2(int number1, int number2) {
		
		if(number1 == 0 || number2 == 0) {
			
			return 0;
		}
		
		Map<Integer, Integer> primeFactorsForNum1 = getPrimeFactors(number1);
		
		Map<Integer, Integer> primeFactorsForNum2 = getPrimeFactors(number2);
		
		Set<Integer> primeFactorsUnionSet = new HashSet<>(primeFactorsForNum1.keySet());
		
		primeFactorsUnionSet.addAll(primeFactorsForNum2.keySet());
		
		int lcm = 1;
		
		for (Integer primeFactor : primeFactorsUnionSet) {
			
			lcm *= Math.pow(primeFactor,
			Math.max(primeFactorsForNum1.getOrDefault(primeFactor, 0),
			primeFactorsForNum2.getOrDefault(primeFactor, 0)));
			
		}
		
		return lcm;
	}
	
}
