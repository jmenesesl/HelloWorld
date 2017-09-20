/**
 * 
 */
package org.escoladeltreball.helloworld;

import java.util.Arrays;

/**
 * @author iaw26068632
 *
 */
public final class Main implements Utils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello World");
		int[] valores = { 9, 3, 8, 1, 2, 1};
		Main main = new Main();
		
		System.out.println("El valor mínimo es: " + main.findSmallest(valores));
		System.out.println("La suma de valores es: " + main.sum(valores));
		System.out.println("tiene: " + main.frequency(valores, 1) + " veces el numero 1");

	}
/*
 * para obtener el esqueleto del metodo de la interficie ctrl + 1
 * 
 * 
 * (non-Javadoc)
 * Stub
 * this methods returns the smallest value from values
 * @see org.escoladeltreball.helloworld.Utils#findSmallest(int[])
 */
	@Override
	public int findSmallest(int[] values) {
		// TODO Auto-generated method stub
		/*
		 * OPCION B
		 * int temp = values[0];
		 * for (int value : values) {
		 * if ( value < temp) {
		 * temp = value;
		 * 	}
		 * }
		 * return temp;
		 */
		int smallest;
		if (values.length > 0) {
			Arrays.sort(values);
			smallest = values[0];
		} else {
			smallest = 0;
		}
		return smallest;
	}
	/*
	 * (non-Javadoc)
	 * this method returns the sum of values
	 * @see org.escoladeltreball.helloworld.Utils#sum(int[])
	 */
	@Override
	public int sum(int[] values) {
		// TODO Auto-generated method stub
		int sum = 0;
		if (values.length > 0) {
			for (int value: values) {
				sum += value;
			}
		}
		return sum;
	}
	/*
	 * (non-Javadoc)
	 * this method returns the frequenct of n values
	 * @see org.escoladeltreball.helloworld.Utils#frequency(int[], int)
	 */
	@Override
	public int frequency(int[] values, int n) {
		// TODO Auto-generated method stub
		int count = 0;
		if (values.length > 0) {
			for (int value: values) {
				if (value == n) {
					count++;
				}
			}
		}
		return count;
	}

}
