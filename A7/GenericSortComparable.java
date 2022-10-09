
import java.util.*;
	public class GenericSortComparable<T extends Comparable<? super T>> {

		private T data;

		public GenericSortComparable(T data) {
			this.data = data;
		}

		public GenericSortComparable() {
		}

		// generic method printArray
		public static <E> void printArray(E[] inputArray) {
			// Display array elements
			for (E element : inputArray) {
				System.out.printf("%s ", element);
			}
			System.out.println();
		}

		public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
			T max = x; // assume x is initially the largest

			if (y.compareTo(max) > 0) {
				max = y; // y is the largest so far
			}

			if (z.compareTo(max) > 0) {
				max = z; // z is the largest now
			}
			return max; // returns the largest object
		}
		
		public static <T extends Comparable<T>> T minimum(T x, T y, T z) {
			T min = x; // assume x is initially the smallest 

			if (y.compareTo(min) < 0) {
				min = y; // y is the smallest so far
			}

			if (z.compareTo(min) < 0) {
				min = z; // z is the smallest now
			}
			return min; // returns the smallest object
		}
		
		public void sort(T[] theArray, int size) { // Using Selection Sort Algorithm

			for (int last = size - 1; last > 0; last--) {
				int largest = 0;
				for (int scan = 1; scan <= last; scan++)
					if (theArray[scan].compareTo(theArray[largest]) > 0)
						largest = scan;

				/** Swap the values */
				T temp = theArray[largest];
				theArray[largest] = theArray[last];
				theArray[last] = temp;
			}
		} // method selectionSort
	}
