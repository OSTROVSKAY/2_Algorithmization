
package Task_2_12;

import java.util.Scanner;

public class Task_2_12_res {
	
	
	// Ввод данных
	public int InputInt() {
			  
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
			            
			      System.out.println("----------------------------------");

			    } while ( check == 0 );
					     return x; 
			 }
	
	
	    // Заполнение двумерного массива
		public void FillMass( int[][] array, int X, int Y) {
			
			 for (int i = 0; i < X; i++) {
			        for (int j = 0; j < Y; j++) {
			             array[i][j] = -100 + (int) ( Math.random()*(100-(-100)) );
			        }
			    } 
		}
		
		
	    // Вывод двумерного массива на печать
		public void PrintMass( int[][] array ) {
		
			for (int i = 0; i < array.length; i++) {  // X - Число строк
				  
					for (int j = 0; j < array[i].length; j++) {  // Y - Число столбцов
						
						System.out.printf( "%4d  (%2d %2d)  ",array[i][j],i,j );
					  // System.out.print(array[i][j] + "\t");
					  // System.out.print(array[i][j] + "  ( " + i + " " + j + " )  " + "\t" );
					}
					System.out.println();
			   	} 
		}
		
		
		// Cортировка строк матрицы по возрастанию значений элементов
		public void SortPlus( int[][] array, int X, int Y ) {
			
			 int jj = 0;
			 int j = 0;
			    
			 int i = 0;
			    
			 int min = 0; // Минимальный элемент в строке массива
			 int minn = 0; // Минимальный элемент в строке массива ( Сохранение )
			 int min1 = 0; // Номер минимального элемента в строке
			 
			 for (i = 0; i < X; i++) {
				    
                 for ( jj = 0; jj < Y; jj++ ) {
   	
   	               min = array[i][jj];
   	               minn = array[i][jj];
   	               min1 = jj;
   			
   	               for (j = jj; j < Y; j++) {
   		 
   		               if ( array[i][j] <  min ) {  min = array[i][j]; min1 = j;  }
   		
   	                      }
   	
   	                       array[i][jj] =  min;
	                       array[i][min1] = minn;
   	
	                       min = 0; // Минимальный элемент в строке массива
		                   minn = 0; // Минимальный элемент в строке массива ( Сохранение )
		                   min1 = 0; // Номер минимального элемента в строке
                      }
             }
		}
		
		
		// Cортировка строк матрицы по убыванию значений элементов
		public void SortMinus( int[][] array, int X, int Y ) {
			
			 int jj = 0;
			 int j = 0;
			    
			 int i = 0;
			    
			 int max = 0;  // Максимальный элемент в строке массива
			 int maxx = 0; // Максимальный элемент в строке массива ( Сохранение )
			 int max1 = 0; // Номер максимального элемента в строке
			 
			 for (i = 0; i < X; i++) {
				    
                for ( jj = 0; jj < Y; jj++ ) {
  	
  	               max = array[i][jj];
  	               maxx = array[i][jj];
  	               max1 = jj;
  			
  	               for (j = jj; j < Y; j++) {
  		 
  		               if ( array[i][j] >  max ) {  max = array[i][j]; max1 = j;  }
  		
  	                      }
  	
  	                       array[i][jj] =  max;
	                       array[i][max1] = maxx;
  	
	                       max = 0; // Минимальный элемент в строке массива
		                   maxx = 0; // Минимальный элемент в строке массива ( Сохранение )
		                   max1 = 0; // Номер минимального элемента в строке
                     }
            }
		}
		
}
