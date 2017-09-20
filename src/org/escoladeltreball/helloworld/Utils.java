/**
 * 
 */
package org.escoladeltreball.helloworld;

/**
 * @author iaw26068632
 * 20.09.2017
 */
public interface Utils {

	/*
	 * this method returns the frequency of n values
	 * no es necesario escribir public abstract ya que en interficies siempre lo son.
	 */
	public abstract int frequency(int[]values, int n);
	/*
	 * this method returns the smalllest value in a integer array
	 */
	public abstract int findSmallest(int[] values);
	
	/*
	 * this method returns the sum of values
	 */
	public abstract int sum(int[] values);
	
	/*
	 * this method returns the frequency of n values in a percentage
	 */
	public abstract double frequencyPercentage(int[]values, int n);
	
}
