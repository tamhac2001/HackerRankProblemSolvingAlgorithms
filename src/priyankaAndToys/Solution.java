package priyankaAndToys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numOfOrder = Integer.parseInt(br.readLine());
		LinkedList<Integer> list = new LinkedList<Integer>();
		String temp[] = br.readLine().trim().split(" ");
		for (int i = 0; i < numOfOrder; i++) {
			list.add(Integer.parseInt(temp[i]));
		}
		list.sort(null);
		Object objArr[] = list.toArray();
		int arr[] = new int[numOfOrder];
		for (int i = 0; i < numOfOrder; i++) {
			arr[i] = (int) objArr[i];
		}
		int counter = 1;
		int head = list.get(0);
		for (int i = 0; i < numOfOrder-1;) {
			if (arr[++i] - head > 4) {
				counter++;
				head = arr[i];
			}
		}
		/*
		 * if (head != arr[numOfOrder - 1]) counter++;
		 */
		System.out.println(counter);
	}

}
