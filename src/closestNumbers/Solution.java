package closestNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String strInput = br.readLine();
		String tempArr[] = strInput.split(" ");
		LinkedList<Integer> list = new LinkedList<Integer>();
		int arr[] = new int[size];
		
		for (int i = 0; i < size; i++) {
			list.add(Integer.parseInt(tempArr[i]));
		}
		Collections.sort(list);
		Object tempOb[] = list.toArray();
		for(int i =0;i<size;i++) {
			arr[i] = (int)tempOb[i];
		}
		
		int minDiff = Integer.MAX_VALUE;
		for (int i = 0; i < size - 1; i++) {
			if (minDiff == 1)
				break;
			int temp = Math.abs(arr[i] - arr[i + 1]);
			minDiff = Math.min(minDiff, temp);
		}
		for (int i = 0; i < size - 1; i++) {
			if (Math.abs(arr[i] - arr[i + 1]) == minDiff) {
				System.out.print(Math.min(arr[i], arr[i + 1]) + " ");
				System.out.print(Math.max(arr[i], arr[i + 1]) + " ");
			}
		}

	}

}
