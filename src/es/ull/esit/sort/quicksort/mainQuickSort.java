package es.ull.esit.sort.quicksort;

import java.util.InputMismatchException;
import java.util.Scanner;
import es.ull.esit.sort.quicksort.Quicksort;

public class mainQuickSort {
	
	public static void main(String[] args) {
		
		try {
	        int arraySize;
	
	        Scanner s = new Scanner(System.in);
	        
	        System.out.println( "Introduzca el tamaño del array a ordenar: " );
	        
	        arraySize = s.nextInt();
	
	        int myArray[] = new int[arraySize];
	
	        System.out.println("Introduzca los elementos del array: ");
	
	        for(int i = 0; i < arraySize; i++) {
	        	myArray[i] = s.nextInt();
	        }
	        
	        s.close();
	        
	        Quicksort q = new Quicksort();
	        
	        q.sort(myArray);
	        q.write();
		}
		catch(InputMismatchException e) {
			System.err.println("ERROR. Debes introducir solamente numeros enteros");
		}
	}
}
