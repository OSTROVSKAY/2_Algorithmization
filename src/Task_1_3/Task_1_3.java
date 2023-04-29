
/* 
  3. Дан массив действительных чисел, размерность которого N.
     Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
*/

package Task_1_3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task_1_3 {

	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА : ПОДСЧЁТ В МАССИВЕ ДЕЙСТВИТЕЛЬНЫХ ЧИСЕЛ ОТРИЦАТЕЛЬНЫХ, ПОЛОЖИТЕЛЬНЫХ И НУЛЕВЫХ ЭЛЕМЕНТОВ");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		System.out.println("Введите размер массива A[N] : N");
		System.out.println("----------------------------------");
		
		Task_1_3_res Inp = new Task_1_3_res();
		
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
		 
		 
		  // Объявление одномерного массива размерностью N
			double nums[] = new double[N];
			
			// Заполнение массива рандомно
			double value = 0;
			
			for ( int i = 0; i < N; i++ ) {
				
				value = -100 + ( Math.random() * (100 - (-100) ) );
				BigDecimal result = new BigDecimal(value);
				
				result = result.setScale(3, RoundingMode.UP );
				nums[i] = result.doubleValue();
				}
			
			
			// Вывод первоначального массива на печать
		    System.out.println("-----------------------------------------");
			System.out.println("Вывод первоначального массива на печать :");
			System.out.println("-----------------------------------------");
			
			 for ( int i = 0; i < nums.length; i++) {
			    	
		            System.out.println("---------------------------------------------------------------------");
		            System.out.printf( "Номер элемента массива : %2d  ||  Значение элемента массива : %5.3f%n", i, nums[i] );
		          //System.out.println("Номер элемента массива :  " +  i + "  ||  " + "Значение элемента массива :  " + nums[i] );
		            System.out.println("---------------------------------------------------------------------");
					    }
				 
		    System.out.println("---------------------------------------------------------------------");
		    
		    
		    System.out.println("----------------------------------------------------------------------------------");
			System.out.println("Вывод на печать и подсчёт в массиве действительных чисел отрицательных элементов :");
			System.out.println("----------------------------------------------------------------------------------");
			
			int a = 0; // Количество отрицательных элементов в массиве 
			
			for ( int i = 0; i < nums.length; i++) {
			
				 if ( nums[i] < 0 )
				  {
					a++; 
		            System.out.println("---------------------------------------------------------------------");
		            System.out.printf( "Номер элемента массива : %2d  ||  Значение элемента массива : %5.3f%n", i, nums[i] );
		          //System.out.println("Номер элемента массива :  " +  i + "  ||  " + "Значение элемента массива :  " + nums[i] );
		            System.out.println("---------------------------------------------------------------------");
				  }
			    }
				 
		    System.out.println("---------------------------------------------------------------------");
		    System.out.println("Количество отрицательных элементов в массиве :  " + a);
		    System.out.println("---------------------------------------------------------------------");
		    System.out.println("---------------------------------------------------------------------");
		    
		    
			System.out.println("----------------------------------------------------------------------------------");
		    System.out.println("Вывод на печать и подсчёт в массиве действительных чисел положительных элементов :");
			System.out.println("----------------------------------------------------------------------------------");
			
				int c = 0; // Количество положительных  элементов в массиве 
				
				for ( int i = 0; i < nums.length; i++) {
					
					 if ( nums[i] > 0 )
					  {
						c++; 
			            System.out.println("---------------------------------------------------------------------");
			            System.out.printf( "Номер элемента массива : %2d  ||  Значение элемента массива : %5.3f%n", i, nums[i] );
			          //System.out.println("Номер элемента массива :  " +  i + "  ||  " + "Значение элемента массива :  " + nums[i] );
			            System.out.println("---------------------------------------------------------------------");
					  }
				    }
			
				    System.out.println("---------------------------------------------------------------------");
				    System.out.println("Количество положительных элементов в массиве :  " + c);
				    System.out.println("---------------------------------------------------------------------");
				    System.out.println("---------------------------------------------------------------------");

		   System.out.println("----------------------------------------------------------------------------------");
		   System.out.println("Вывод на печать и подсчёт в массиве действительных чисел нулевых элементов :");
		   System.out.println("----------------------------------------------------------------------------------");
			
            int b = 0; // Количество нулевых элементов в массиве 
			
			for ( int i = 0; i < nums.length; i++) {
			
				 if ( nums[i] == 0 )
				  {
					b++; 
		            System.out.println("---------------------------------------------------------------------");
		            System.out.printf( "Номер элемента массива : %2d  ||  Значение элемента массива : %5.3f%n", i, nums[i] );
		          //System.out.println("Номер элемента массива :  " +  i + "  ||  " + "Значение элемента массива :  " + nums[i] );
		            System.out.println("---------------------------------------------------------------------");
				  }
			    }
		    
			    System.out.println("---------------------------------------------------------------------");
			    System.out.println("Количество нулевых элементов в массиве :  " + b);
			    System.out.println("---------------------------------------------------------------------");
			    System.out.println("---------------------------------------------------------------------");
			    System.out.println("---------------------------------------------------------------------");

	}

}
