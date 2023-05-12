
package Task_2_14;

import java.util.Scanner;

public class Task_2_14_res {
	
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
	
	
	// Заполнение двумерного массива. Массив заполняется НУЛЯМИ и ЕДИНИЦАМИ
	// В каждом столбце число единиц равно номеру столбца
	
	public void FillMass( int[][] array, int X, int Y) {
		
	    int j = 0;
		int i = 0;
		
		// Вначале массив заполняется нулями
		for ( j = 0; j < Y; j++) {
			
			 for ( i = 0; i < X; i++ ) {
				 
				 array [i][j] = 0;
			 }
		}
		
		// Затем столбцы массива заполняются единицами, причём 
		// в каждом столбце число единиц равно номеру столбца
		
		int one = 0; // Число единиц в столбце массива, должно быть
		int one1 = 0; // Число единиц в столбце массива, должно быть ( Сохранение )
		int oneis = 0; // Число единиц в столбце массива уже есть
		double arr = 0; // Значение, полученное рандомно, для заполнение отдельного элемента массива
		int mustone = 0; // Дополнительное количество единиц
		int mustone1 = 0; // Дополнительное количество единиц ( Сохрание )
		
		
		for ( j = 0; j < Y; j++) {
			
			 one = 0;
		     one1 = 0;
			
			 if (j < Y ) {
			 one = j + 1;
			 one1 = j + 1;}
		
		        for ( i = 0; i < X; i++ ) {
			
			          if ( one > 0 ) {
				   
		              arr = Math.random();
		
		                  if ( arr < 0.5 )  { array [i][j] = 0; } 
		       
		                      else { array [i][j] = 1; } 
	                 } 
	                     else { array [i][j] = 0; }
	      
	              if ( array [i][j] == 1 ) { one = one - 1; }
		       }
		
		        
		             do {
			              oneis = 0;
			              mustone = 0;
			              mustone1 = 0;
			
		                  for ( i = 0; i < X; i++ ) {
			
			                 if (  array [i][j] == 1 ) {  oneis =  oneis + 1;}
			
		                  }
		
		                 mustone = one1 - oneis;
		
		                 mustone1 = one1 - oneis;
		
		                       if ( mustone > 0 ) {
			
			                       for ( i = 0; i < X; i++ ) {
				
				                       if ( mustone1 > 0 & array [i][j] == 0) {
					   
			                               arr = Math.random();
			
			                                  if ( arr < 0.5 )  { array [i][j] = 0; } 
			       
			                                    else { array [i][j] = 1; } 
		                                } 
		       
		                         if ( array [i][j] == 1 ) { mustone1 = mustone1 - 1; }
				
			                         }
			
		                       }
		
		                       System.out.println("Программа работает. Количество единиц, которые нужно записать в столбец массива :  " + mustone);
		                       
		              } while ( mustone > 0);
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
	
}
