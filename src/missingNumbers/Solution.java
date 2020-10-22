package missingNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sizeA, sizeB;
		sizeA = Integer.parseInt(br.readLine());
		String tempA[] = br.readLine().split(" ");
		sizeB = Integer.parseInt(br.readLine());
		String tempB[] = br.readLine().split(" ");
		LinkedList<Integer> maxList = new LinkedList<Integer>();
		for (int i = 0; i < sizeB; i++) {
			maxList.add(Integer.parseInt(tempB[i]));
		}
		int minList[] = new int[sizeA];
		for (int i = 0; i < sizeA; i++) {
			minList[i] = Integer.parseInt(tempA[i]);
		}

		for (int i : minList) {
			if (maxList.contains(i)) {
				maxList.removeFirstOccurrence(i);
			}
		}
		maxList.sort(null);
		for (int i = 0; i < maxList.size(); i++) {
			if (maxList.indexOf(Integer.valueOf(maxList.get(i))) != maxList
					.lastIndexOf(Integer.valueOf(maxList.get(i)))) {
				maxList.removeLastOccurrence(Integer.valueOf(maxList.get(i)));
			}
		}
		for (int i : maxList) {
			System.out.print(i + " ");
		}
	}

}
