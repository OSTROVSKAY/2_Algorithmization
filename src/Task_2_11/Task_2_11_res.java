	
package Task_2_11;

import java.util.Scanner;

public class Task_2_11_res {
	
	// Заполнение двумерного массива
	public void FillMass( int[][] array, int X, int Y) {
		
		for (int i = 0; i < X; i++) {
			for (int j = 0; j < Y; j++) {
				array[i][j] = 0 + (int) ( Math.random()*(15-0) );
			}
		} 
	}
	
	
	// Вывод двумерного массива на печать
	public void PrintMass( int[][] array ) {
		
		for (int i = 0; i < array.length; i++) { // X - Число строк
				
				for (int j = 0; j < array[i].length; j++) { // Y - Число столбцов
					
				// System.out.print(array[i][j] + "\t");
					System.out.printf( "%4d  (%2d %2d)  ",array[i][j],i,j );
				// System.out.print(array[i][j] + "  ( " + i + " " + j + " )  " + "\t" );
				}
				System.out.println();
			} 
	}
	
	
	// Вывод на экран номера строк и строк матрицы, в которых число 5 встречается три и более раз.
	public void PrintMass1( int[][] array ) {
		
		int count = 0; // Число повторов числа 5
		int count1 = 0;
		
		for (int i = 0; i < array.length; i++) { // X - Число строк
				
			for (int j = 0; j < array[i].length; j++) { // Y - Число столбцов
					
					if ( array[i][j] == 5) {
						
						count = count + 1;
					}
				}
				
					if ( count >= 3 ) { 
						
						count1 = count1 + 1;
						
						// System.out.print("Номер строки : " + (i + 1) + "  ||  " + "Количество встреч числа 5 в строке : " + count + "  ||  " + "Значение элементов в строке массива : " + "   ");
						System.out.printf("Номер строки : %3d  ||  Количество встреч числа 5 в строке : %3d  ||  Значение элементов в строке массива : ", (i + 1), count );
						
						for (int j = 0; j < array[i].length; j++) { // Y - Число столбцов
							System.out.printf(" %3d   ",array[i][j]);
							
							}
						System.out.println("");
					}
				count = 0;
			}
		
		
			if ( count1 == 0 ) {
				System.out.println("------------------------------------------------------------------");
				System.out.println("Строк матрицы, в которых число 5 встречается ТРИ и более раз - НЕТ");
				System.out.println("------------------------------------------------------------------");
			}
		}
	
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
		
	}
