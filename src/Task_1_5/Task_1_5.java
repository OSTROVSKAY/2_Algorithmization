
/*
  5. Даны целые числа а1, а2, ..., аn 
     Вывести на печать только те числа, для которых аi > i
*/

package Task_1_5;

public class Task_1_5 {

	public static void main(String[] args) {
		
		System.out.println("ПРОГРАММА : ВЫВОД НА ПЕЧАТЬ ЭЛЕМЕНТОВ МАССИВА, ДЛЯ КОТОРЫХ ai > i");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Введите размер массива A[N] : N");
		System.out.println("----------------------------------");
		
		Task_1_5_res Inp = new Task_1_5_res();
	    
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
			
			
			// Вывод на печать только тех элементов массива, для которых аi > i
			System.out.println("------------------------------------------------------------------");
			System.out.println("Вывод на печать только тех элементов массива, для которых аi > i :");
			System.out.println("------------------------------------------------------------------"); 
			
			  for ( int i = 0; i < nums.length; i++) {
				  
				  if ( nums[i]  > i ) {
			    	
		            System.out.println("-----------------------------------------------------------------");
		            System.out.println("Номер элемента массива :  " +  i + "  ||  " + "Значение элемента массива :  " + nums[i] );
		            System.out.println("-----------------------------------------------------------------");
				              }
					    } 
				 
		         System.out.println("-----------------------------------------------------------------");
			
				
			// Вывод массива целых чисел на печать
		    System.out.println("-------------------------------------");
			System.out.println("Вывод массива целых чисел на печать :");
			System.out.println("-------------------------------------"); 
			
			  for ( int i = 0; i < nums.length; i++) {
			    	
		            System.out.println("-------------------------------------------------------------------");
		            System.out.println("Номер элемента массива :  " +  i + "  ||  " + "Значение элемента массива :  " + nums[i] );
		            System.out.println("-------------------------------------------------------------------");
					    } 
				 
		         System.out.println("-------------------------------------------------------------------");
	}

}