
/* 
  9. Задана матрица неотрицательных чисел. 
     Посчитать сумму элементов в каждом столбце. Определить, какой
     столбец содержит максимальную сумму.
*/

package Task_2_9;

import java.util.ArrayList;

public class Task_2_9 {

	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА : ВЫВОД МАТРИЦЫ НА ЭКРАН");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		System.out.println("Введите размер массива A[X][Y] :");
		System.out.println("------------------------------------");
		System.out.println("X - Число строк. Y - Число столбцов.");
		System.out.println("------------------------------------");
		
		Task_2_9_res Inp = new Task_2_9_res();
		
		
		// Ввод числа строк матрицы
		System.out.println("Введите :  X - Число строк : ");
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
		 
		 
		// Ввод числа столбцов матрицы
		System.out.println("Введите : Y - Число столбцов : ");
		
		 int Y = 0;
		 
		 do {
			 Y = Inp.InputInt();
			 
			 if ( Y <= 0 )
          {
        	  System.out.println("--------------------------------------------------");
        	  System.out.println("Введенные данные меньше или равно 0. Введите снова");
        	  System.out.println("--------------------------------------------------");
          } 
        
		  } while ( Y <= 0 );
		 
		 
		  // Объявление двумерного массива
		  int[][] array = new int[X][Y];
		  
		  
		  // Заполнение двумерного массива рандомно	  
		  for (int i = 0; i < X; i++) {
		        for (int j = 0; j < Y; j++) {
		            array[i][j] = 0 + (int) ( Math.random()*(100-0));
		        }
		    } 
		  
		  
		   // Вывод двумерного массива на печать
		    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		     for (int i = 0; i < array.length; i++) {  // X - Число строк
				for (int j = 0; j < array[i].length; j++) {  // Y - Число столбцов
					System.out.print(array[i][j] + "  ( " + i + " " + j + " )  " + "\t");
				}
				System.out.println();
		   	} 
		
		    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		    
		    
           // Дана матрица. Расчёт суммы элементов в каждом столбце. Определение столба, который содержит максимальную сумму элементов. 
		    
		    int sum = 0; // Сумма элементов в каждом столбце
		    
		   // Объявление нового одномерного массива ArrayList : 1. Номер столбца  2. Максимальная сумма элементов столбца
			     ArrayList<Integer> nums = new ArrayList<Integer>();
		    
		        for ( int z = 0; z < Y; z++) {
		    
		             for (int i = 0; i < X; i++) {    // X - Число строк
		            	 
				          for (int j = 0; j < Y; j ++) {  // Y - Число столбцов
					
					           if ( j == z ) {
						   
					               sum = sum + array[i][j];
					                       }
					        
				                  }
		                   	} 
		    
		    // System.out.println("Номер столбца : " + z + "  ||  " + "Значение суммы элементов столбца : " +  sum);
		       System.out.print (z + "  :  " + sum + "       " );
		       nums.add(sum);
		       sum = 0;
		    
		    }
		        
		    System.out.println(" ");
		   
		    
		  /*  for ( int i = 0; i < nums.size(); i++) {
	            System.out.println("-------------------------------------------------------------------");
	            System.out.println("Номер элемента массива :  " +  i + "  ||  " + "Значение элемента массива :  " + nums.get(i) );
	            System.out.println("-------------------------------------------------------------------");
				    } 
		  */
		    
		    // Определить, какой столбец содержит максимальную сумму элементов.
		    
		    int summax = 0; // Максимальная сумма элементов столбца
		    int z1 = 0;     // Номер столбца, содержащего максимальную сумму элементов
		    
		    summax = nums.get(0);
		    
		    for ( int i = 0; i < nums.size(); i++) {
            
		    	 if ( nums.get(i) > summax ) {
		    		 
		    		 summax = nums.get(i);
		    		 z1 = i;
		    		 
		    	     }
		    	 
			     } 
	   
		    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		    System.out.println("Номер столбца, содержащего максимальную сумму элементов матрицы : " +  z1 + "   ||   " + "Максимальная сумма элементов столбца : " + summax );
		    System.out.println("-----------------------------------------------------------------------------------------------------------------------");

	}

}