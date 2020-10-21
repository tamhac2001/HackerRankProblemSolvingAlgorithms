package beautifulPairs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String strArrA[] = br.readLine().split(" ");
		String strArrB[] = br.readLine().split(" ");
		LinkedList<Integer> listA = new LinkedList<Integer>();
		LinkedList<Integer> listB = new LinkedList<Integer>();
		for (int i = 0; i < size; i++) {
//			if(!listA.contains(Integer.parseInt(strArrA[i])))
			listA.add(Integer.parseInt(strArrA[i]));
			listB.add(Integer.parseInt(strArrB[i]));
		}
		int max = 0;
		listA.sort(null);
		listB.sort(null);
		Object objA[] = listA.toArray();
		int arrA[] = new int[size];
		Object objB[] = listB.toArray();
		int arrB[] = new int[size];
		for (int i = 0; i < size; i++) {
			arrA[i] = (int) objA[i];
			arrB[i] = (int) objB[i];
		}
		boolean aMiss = false;
		boolean bMiss = false;
		int i = 0, j = 0;
		masterLoop: while (i < size && j < size) {
			while (arrA[i] == arrB[j]) {
				max++;
				i++;
				j++;
				if (i >= size || j >= size)
					break masterLoop;
			}
			while (arrA[i] > arrB[j]) {
				j++;
				bMiss = true;
				if (i >= size || j >= size)
					break masterLoop;
			}

			while (arrA[i] < arrB[j]) {
				i++;
				aMiss= true;
				if (i >= size || j >= size)
					break masterLoop;
			}

		}
		if (bMiss || aMiss)
			max++;
		else if (!bMiss && !aMiss) max--;
		/*
		 * for(int i=0,j=0;i<size&&j<size;) { System.out.println(arrB[i]); }
		 */

		System.out.println(max);
	}

}
