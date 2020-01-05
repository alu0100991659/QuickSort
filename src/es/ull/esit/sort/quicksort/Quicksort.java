package es.ull.esit.sort.quicksort;

import java.util.Arrays;

/// Clase para ordenar mediante el método Quicksory
public class Quicksort  {
	
	private int[] numbers; /*!< Array a ordenar */
	private int number; /*!< Numero pivote de la ordenacion */
	
	/// Método principal de la ordenación
	public void sort(int[] values) {
		
		// Check for empty or null array
		if (values ==null || values.length==0){
			return;
		}

		this.numbers = values;
		number = values.length;
		quicksort(0, number - 1);

	}

	/// Parte recursiva del algoritmo
	private void quicksort(int low, int high) {

		int i = low, j = high;
		
		// Get the pivot element from the middle of the list
		int pivot = numbers[low + (high-low) / 2];

		// Divide into two lists
		while (i <= j) {

			// If the current value from the left list is smaller then the pivot
			// element then get the next element from the left list
			while (numbers[i] < pivot) {
				i++;
			}
			
			// If the current value from the right list is larger then the pivot
			// element then get the next element from the right list
			while (numbers[j] > pivot) {
				j--;
			}

			// If we have found a values in the left list which is larger then
			// the pivot element and if we have found a value in the right list
			// which is smaller then the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j

			if (i <= j) {

				exchange(i, j);
				i++;
				j--;
			}
		}

		// Recursion
		if (low < j)
			
			quicksort(low, j);

		if (i < high)

			quicksort(i, high);
	}

	/// Método para intercambiar la posición de dos elementos
	private void exchange(int i, int j) {

		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
	
	/// Método para imprimir el array ordenado
	public void write() {
		System.out.println(Arrays.toString(numbers));
	}
}
