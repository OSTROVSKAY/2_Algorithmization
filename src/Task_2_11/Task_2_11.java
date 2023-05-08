
/*
  11. Матрицу 10x20 заполнить случайными числами от 0 до 15. 
      Вывести на экран саму матрицу и номера строк, в
      которых число 5 встречается три и более раз.
*/

package Task_2_11;

public class Task_2_11 {

	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА : ФОРМИРОВАНИЕ МАТРИЦЫ : ЧИСЛО СТРОК - 10, ЧИСЛО СТОЛБЦОВ - 20");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");
		
		int X = 10; // Число строк матрицы
		int Y = 20; // Число столбцов матрицы
		
		// Объявление двумерного массива
		int[][] array = new int[X][Y];
		
		// Заполнение двумерного массива 
		  
		  for (int i = 0; i < X; i++) {
		        for (int j = 0; j < Y; j++) {
		             array[i][j] = 0 + (int) ( Math.random()*(15-0) );
		        }
		    } 
		  
        // Вывод двумерного массива на печать
		  
		  System.out.println("------------------------------------");
		  System.out.println("Вывод двумерного массива на печать :");
		  System.out.println("------------------------------------");
		  
          System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		  
		  for (int i = 0; i < array.length; i++) {  // X - Число строк
			  
				for (int j = 0; j < array[i].length; j++) {  // Y - Число столбцов
					
					//System.out.print(array[i][j] + "\t");
					
					System.out.print(array[i][j] + "  ( " + i + " " + j + " )  " + "\t" );
				}
				System.out.println();
		   	} 
		  System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		  
		 // Вывод на экран номера строк и строк матрицы, в которых число 5 встречается три и более раз.
		  
		 System.out.println("--------------------------------------------------------------------------------------------");
		 System.out.println("Вывод на экран номера строк и строк матрицы, в которых число 5 встречается три и более раз :");
		 System.out.println("--------------------------------------------------------------------------------------------");
		  
         System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		  
         int count = 0; // Число повторов числа 5
         int count1 = 0;
         
		  for (int i = 0; i < array.length; i++) {  // X - Число строк
			  
			  for (int j = 0; j < array[i].length; j++) {  // Y - Число столбцов
					
					if ( array[i][j] == 5) {
						
						count = count + 1;
					}
				}
			  
			         if ( count >= 3 ) { 
			        	 
			        	 count1 = count1 + 1;
			        	 
			        	  System.out.print("Номер строки : " + (i + 1) + "  ||  " + "Количество встреч числа 5 в строке : " + count + "  ||  " + "Значение элеметов в строке массива : " + "   ");
			        	
				       for (int j = 0; j < array[i].length; j++) {  // Y - Число столбцов
					        System.out.print(array[i][j] + "\t");
				            }
				       System.out.println();
			          }
				count = 0;
		   	}
		  
		    if ( count1 == 0 ) {     
		    	 System.out.println("------------------------------------------------------------------");
		    	 System.out.println("Строк матрицы, в которых число 5 встречается ТРИ и более раз - НЕТ");
		    	 System.out.println("------------------------------------------------------------------");
		    }
		  
		  
		  System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"); 
	}
}
