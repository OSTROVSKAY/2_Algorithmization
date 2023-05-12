
/*
   8. Дана последовательность целых чисел :  a1, a2, ..., an.
      Образовать новую последовательность, выбросив из
      исходной те члены, которые равны  min(a1, a2, ..., an).
*/

package Task_1_8;

import java.util.ArrayList;

public class Task_1_8 {

	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА : ОБРАЗОВАНИЕ НОВОЙ ПОСЛЕДОВАТЕЛЬНОСТИ ЦЕЛЫХ ЧИСЕЛ");
		System.out.println("------------------------------------------------------------");
		System.out.println("------------------------------------------------------------");
		
		System.out.println("Введите размер массива A[N] : N - Размер массива");
		System.out.println("------------------------------------------------");
		
		Task_1_8_res Inp = new Task_1_8_res();
		
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
	     int nums[] = new int[N];
	     
	     // Заполнение массива рандомно
	  	 for ( int i = 0; i < N; i++ ) {
	  		    nums[i] = -100 + (int) ( Math.random()*(100-(-100)) );
	  			}
	  	 
	      // Вывод массива целых чисел на печать
		    System.out.println("-------------------------------------");
			System.out.println("Вывод массива целых чисел на печать :");
			System.out.println("-------------------------------------"); 
			
			for ( int i = 0; i < nums.length; i++) {
	            System.out.println("-------------------------------------------------------------------");
	            
	            System.out.printf( "Номер элемента массива : %2d  ||  Значение элемента массива : %3d%n", i, nums[i] );
	         // System.out.println("Номер элемента массива :  " +  i + "  ||  " + "Значение элемента массива :  " + nums[i] );
	            System.out.println("-------------------------------------------------------------------");
				} 
			
			 System.out.println("-------------------------------------------------------------------");

			 
     // Поиск элементов массива с минимальным значением
			 int min = nums [0];
			 int j = 0;
			 int index = 0;
			 
			 for ( j = 0; j < nums.length; j++ ) {
				 
				 if ( min > nums [j] ) {
					 
					 index = j;
					 min = nums [j];
				 }
			 }
			 
			 System.out.println("ПОИСК ЭЛЕМЕНТА МАССИВА С МИНИМАЛЬНЫМ ЗНАЧЕНИЕМ :");
			 System.out.println("-------------------------------------------------------------------------");
			 System.out.println("Поиск : Есть ли в массиве несколько элементов с минимальным значением ? :");
			 System.out.println("-------------------------------------------------------------------------");
			 
			 
			 int check = 0; // Проверка: В массиве есть несколько элементов с минимальным значением
			 int x = 0;
			 
             for ( x = 0; x < nums.length; x++ ) {
				 
				 if ( (min == nums [x]) & (x != index) ) {
					 check = check + 1;
				 }                                 
			 }
             
             if ( check > 0 ) {
            	 System.out.println("-------------------------------------------------------------");
				 System.out.println("В массиве есть несколько элементов с минимальным значением : ");
				 System.out.println("-------------------------------------------------------------");
				 
				 System.out.printf( "Номер элемента с минимальным значением : %2d  ||  Элемент массива с минимальным значением : %3d%n", index, min );
				 System.out.println("--------------------------------------------------------------------------------------------------");
			  // System.out.println("Номер элемента с минимальным значением : " + index + "  ||  " + "Элемент массива с минимальным значением : " + min);
				 System.out.println("--------------------------------------------------------------------------------------------------");
				 
             }
			 
                check = 0; // Проверка: В массиве есть несколько элементов с минимальным значением
			    x = 0;
             
			 
			 for ( x = 0; x < nums.length; x++ ) {
				 
				 if ( (min == nums [x]) & (x != index) ) {
					 check = check + 1;
					 
					 System.out.printf( "Номер элемента с минимальным значением : %2d  ||  Элемент массива с минимальным значением : %3d%n", x, nums[x] );
				  // System.out.println("Номер элемента с минимальным значением : " + x + "  ||  " + "Элемент массива с минимальным значением : " + nums[x]);
					 System.out.println("--------------------------------------------------------------------------------------------------");
				 }                                 
			 }
			 
			 
			 if ( check > 0 ) {
			     System.out.println("----------------------------------------------");
			     System.out.println("Число элементов с минимальным значением : " + (check + 1) );
			     System.out.println("----------------------------------------------");
			    }
			 
			 
			 if ( check == 0 ) {
				 System.out.println("------------------------------------------------");
				 System.out.println("В массиве один элемент с минимальным значением :"); 
				 System.out.println("------------------------------------------------");
				 }
			 
			 
			 if ( check == 0 ) {
			 System.out.println("-----------------------------------------------------------------------------------------------");
			 
			 System.out.printf( "Номер элемента с минимальным значением : %2d  ||  Элемент массива с минимальным значением : %3d%n", index, min );
		  // System.out.println("Номер элемента с минимальным значением : " + index + "  ||  " + "Элемент массива с минимальным значением : " + min);
			 System.out.println("-----------------------------------------------------------------------------------------------");
			 }
			 
			 
		  // Объявление нового одномерного массива размерностью ArrayList
			 ArrayList<Integer> nums2 = new ArrayList<Integer>();
			 
		  // Заполнение нового массива ArrayList
			 for ( x = 0;  x < nums.length; x++ ) {
				 if ( nums[x] !=  min ) {
			         nums2.add(nums[x]);
				 }
			 }
			 
	     // Вывод массива целых чисел на печать
			System.out.println("--------------------------------------------");
			System.out.println("Вывод нового массива целых чисел на печать :");
			System.out.println("--------------------------------------------"); 
			 
			for ( int i = 0; i < nums2.size(); i++) {
	            System.out.println("-------------------------------------------------------------------");
	            
	            System.out.printf( "Номер элемента массива : %2d  ||  Значение элемента массива : %3d%n", i, nums2.get(i) );
	            
	         // System.out.println("Номер элемента массива :  " +  i + "  ||  " + "Значение элемента массива :  " + nums2.get(i) );
	            System.out.println("-------------------------------------------------------------------");
				    } 
			
			 System.out.println("-------------------------------------------------------------------");
			 System.out.println("-------------------------------------------------------------------");
			 
			 System.out.printf( "Размер первого массива : %2d  ||  Размер второго массива : %3d%n", nums.length, nums2.size() );
			 
		  // System.out.println("Размер первого массива :  " + nums.length + "  ||  " + "Размер второго массива :  " + nums2.size());
			 System.out.println("-------------------------------------------------------------------");
			 System.out.println("-------------------------------------------------------------------");
	}

}
