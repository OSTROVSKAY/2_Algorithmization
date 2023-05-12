
package Task_2_16;

import java.util.Scanner;

public class Task_2_16_res {
	
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
			
			
		// Вычисление Магической константы нормального волшебного квадрата M
			public int MagConst( int N ) {
				int M;
				M = ( N * ( N*N + 1 ) ) / 2;
				return M;
			}
			
			
		// Cоставление магического квадрата нечётного порядка
			
			public void OddSquare (  int[][] array) {
				
				
				
				
				
			}
			
			// Вывод двумерного массива на печать
			public void PrintMass( int[][] array ) { 
						
				 for (int i = 0; i < array.length; i++) {  // X - Число строк
								  
					 for (int j = 0; j < array[i].length; j++) {  // Y - Число столбцов
										
						    //System.out.print(array[i][j] + "\t");
										
							System.out.print(array[i][j] + "  ( " + i + " " + j + " )  " + "\t" );
							
						 }
							System.out.println();
					 } 
			     }
			
			
			
		    // Проверка : Является ли квадрат магическим
			public int TestMass( int[][] array, int  M, int N ) {
				
				int check = 1;
				
			    // 1. Проверка суммы элементов в каждой строке матрицы
				
					int line = 0;
					
					 for (int i = 0; i < array.length; i++) {  // X - Число строк
						 
						 line = 0;
						 for (int j = 0; j < array[i].length; j++) {  // Y - Число столбцов
											
							 line = line + array[i][j];
										
							 }
						      
						        if ( line != M ) {check = 0;}
					 } 
					 
					 
					 // 2. Проверка суммы элементов в каждом столбце матрицы
					 
					 int column = 0;
					 
					 for (int j = 0; j < N; j++) {
						 
						 column = 0;
						 for (int i = 0; i < N; i++) {
							 
							 column = column + array[i][j];
						 }
						 
						 if ( column != M ) {check = 0;}
						
					 }
					 
					 // 3. Проверка суммы элементов в главной диагонали матрицы
					 int firstDiag = 0;
							 
					 for (int i = 0; i < N; i++) {  // X - Число строк
						  
							for (int j = 0; j < N; j++) {  // Y - Число столбцов
								
								if ( i == j ) {
									
									firstDiag = firstDiag + array[i][j];
								}
							}
							
					   	} 
					 
					 if (firstDiag != M ) {check = 0;}
					 
					 
					// Проверка суммы элементов во второй диагонали матрицы
					 int secDiag = 0;
					 
					  int Z = N - 1;
					  
					  for (int i = 0; i < N; i++) {  // X - Число строк
						  
							for (int j = 0; j < N; j++) {  // Y - Число столбцов
								
								if ( j == Z ) {
								System.out.print(array[i][j] + "  ( " + i + " " + j + " )  " + "\t");
								}
							}
							Z = Z - 1;
					   	} 
					 
					  if (firstDiag != M ) {check = 0;}
					  
					  return check;
			 }
					
					
					
					
					
					
					
					
					
					
			

}
