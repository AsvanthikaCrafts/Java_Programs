import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Quick sort algorithm (simple)
 * based on pseudo code on Wikipedia "Quick Sort" aricle
 * 
 * @see http://en.wikipedia.org/wiki/Quicksort#Simple_version
 * @author djitz
 *
 */
public class QuickSort {

	/**
	 * Main method.
	 * @param args
	 */
	public static void main(String[] args) {

		QuickSort app = new QuickSort();
		
		 //Generate an integer array of length 7
	    List<Integer> input = app.generateRandomNumbers(7);
		
	    //Before sort
	    System.out.println(input);
		
	    //After sort
	    System.out.println(app.quicksort(input));
	    
	}
	
	/**
	 * This method sort the input ArrayList using quick sort algorithm.
	 * @param input the ArrayList of integers.
	 * @return sorted ArrayList of integers.
	 */
	private List<Integer> quicksort(List<Integer> input){
		
		if(input.size() <= 1){
			return input;
		}
		
		int middle = (int) Math.ceil((double)input.size() / 2);
		int pivot = input.get(middle);

		List<Integer> less = new ArrayList<Integer>();
		List<Integer> greater = new ArrayList<Integer>();
		
		for (int i = 0; i < input.size(); i++) {
			if(input.get(i) <= pivot){
				if(i == middle){
					continue;
				}
				less.add(input.get(i));
			}
			else{
				greater.add(input.get(i));
			}
		}
		
		return concatenate(quicksort(less), pivot, quicksort(greater));
	}
	
	/**
	 * Join the less array, pivot integer, and greater array
	 * to single array.
	 * @param less integer ArrayList with values less than pivot.
	 * @param pivot the pivot integer.
	 * @param greater integer ArrayList with values greater than pivot.
	 * @return the integer ArrayList after join.
	 */
private List<Integer> concatenate(List<Integer> less, int pivot, List<Integer> greater){
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < less.size(); i++) {
			list.add(less.get(i));
		}
		
		list.add(pivot);
		
		for (int i = 0; i < greater.size(); i++) {
			list.add(greater.get(i));
		}
		
		return list;
	}
	
	/**
	 * This method generate a ArrayList with length n containing random integers . 
	 * @param n the length of the ArrayList to generate.
	 * @return ArrayList of random integers with length n. 
	 */
	private List<Integer> generateRandomNumbers(int n){
		
	    List<Integer> list = new ArrayList<Integer>(n);
	    Random random = new Random();
		
	    for (int i = 0; i < n; i++) {
		    list.add(random.nextInt(n * 10));
	    }
	
	    return list;
	}

}