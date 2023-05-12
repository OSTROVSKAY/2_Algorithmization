
package Task_2_13;

import java.util.Scanner;

public class Task_2_13_res {
	
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
	
	
	// Cортировка столбцов матрицы по возрастанию значений элементов
	public void SortPlus( int[][] array, int X, int Y ) {
		
		  int j = 0;
		  int i = 0;
		  int ii = 0;
		
		  int min = 0; // Минимальный элемент в столбце массива
		  int minn = 0; // Минимальный элемент в столбце массива ( Сохранение )
		  int min1 = 0; // Номер минимального элемента в столбце
		
		 
		   for (  j = 0; j < Y; j++ )  {
		    	 
		      for ( ii = 0; ii < X; ii++ ) {
		    		 
		              min = array[ii][j];
		              minn = array[ii][j];
		              min1 = ii;
		              
		    		 for ( i = ii; i < X; i++ ) {
		    			 
			    		 if ( array[i][j] <  min ) { min = array[i][j]; min1 = i;}
			    		 
		    		 }
		    		 
		    		  array[ii][j] =  min;
		    		  array[min1][j] = minn;
		    		 
		    		   min = 0; // Минимальный элемент в столбце массива
                       minn = 0; // Минимальный элемент в столбце массива ( Сохранение )
                       min1 = 0; // Номер минимального элемента в столбце
		        } 
		  }                                 
	}
	
	
	// Cортировка столбцов матрицы по убыванию значений элементов
	public void SortMinus( int[][] array, int X, int Y ) {
		
		 int j = 0;
		 int i = 0;
		 int ii = 0;
		 
		 int max = 0; // Минимальный элемент в столбце массива
		 int maxx = 0; // Минимальный элемент в столбце массива ( Сохранение )
		 int max1 = 0; // Номер минимального элемента в столбце
		 
		 
		 for (  j = 0; j < Y; j++ )  {
	    	 
		      for ( ii = 0; ii < X; ii++ ) {
		    		 
		              max = array[ii][j];
		              maxx = array[ii][j];
		              max1 = ii;
		              
		    		 for ( i = ii; i < X; i++ ) {
		    			 
			    		 if ( array[i][j] >  max ) { max = array[i][j]; max1 = i;}
			    		 
		    		 }
		    		 
		    		  array[ii][j] =  max;
		    		  array[max1][j] = maxx;
		    		 
		    		  max = 0; // Минимальный элемент в столбце массива
                      maxx = 0; // Минимальный элемент в столбце массива ( Сохранение )
                      max1 = 0; // Номер минимального элемента в столбце
		        } 
		  }                                 
		
	}
	
	
  }
