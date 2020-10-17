package closestNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class Solution {
	public static void quickSort(int arr[]) {
		recQuickSort(0, arr.length - 1, arr);
	}

	public static void recQuickSort(int left, int right, int arr[]) {
		if (right - left <= 0) {
			return;
		} else {
			int pivot = arr[right];
			int partition = partitionIt(left, right, pivot, arr);
			recQuickSort(left, partition - 1, arr);
			recQuickSort(partition + 1, right, arr);
		}
	}

	public static int partitionIt(int left, int right, int pivot, int arr[]) {
		int leftPtr = left - 1;
		int rightPtr = right;
		while (true) {
			while (arr[++leftPtr] < pivot) {
				;
			}
			while (rightPtr > 0 && arr[--rightPtr] > pivot) {
				;
			}
			if (leftPtr >= rightPtr)
				break;
			else {
				swap(leftPtr, rightPtr, arr);
			}
		} // end while(true)
		swap(leftPtr, right, arr);
		return leftPtr;
	}

	public static void swap(int a, int b, int arr[]) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String strInput = br.readLine();
		String tempArr[] = strInput.split(" ");
		// LinkedList<Integer> list = new LinkedList<Integer>();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(tempArr[i]);
		}
		/*
		 * for (int i = 0; i < size; i++) { list.add(Integer.parseInt(tempArr[i])); }
		 */
		// Collections.sort(list);
		// list.sort(null);
		quickSort(arr);
		int minDiff = Integer.MAX_VALUE;
		for (int i = 0; i < size - 1; i++) {
			if (minDiff == 1)
				break;
			// int temp = Math.abs(list.get(i) - list.get(i + 1));
			int temp = Math.abs(arr[i] - arr[i + 1]);
			minDiff = Math.min(minDiff, temp);
		}
		for (int i = 0; i < size - 1; i++) {

			/*
			 * if (Math.abs(list.get(i) - list.get(i + 1)) == minDiff) {
			 * System.out.print(Math.min(list.get(i), list.get(i + 1)) + " ");
			 * System.out.print(Math.max(list.get(i), list.get(i + 1)) + " "); }
			 */
			if (Math.abs(arr[i] - arr[i+1]) == minDiff) {
				System.out.print(Math.min(arr[i],arr[i+1]) + " ");
				System.out.print(Math.max(arr[i],arr[i+1]) + " ");
			}
		}

	}

}
