package sherlockAndArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());
		for (int theCase = 0; theCase < caseNum; theCase++) {
			int size = Integer.parseInt(br.readLine());
			int arr[] = new int[size];
			String temp[] = br.readLine().split(" ");
			for (int i = 0; i < size; i++) {
				arr[i] = Integer.parseInt(temp[i]);
			}
			int i = -1, j = size;
			int totalUp = 0, totalDown = 0;
			while (j - i != 2) {
				while (arr[i + 1] == 0) {
					i++;
				}
				while (arr[j - 1] == 0) {
					j--;
				}
				if (j - i == 2)
					break;
				else {
					if (totalUp > totalDown) {
						totalDown += arr[--j];
					} else {
						totalUp += arr[++i];
					}
				}

			}
			if (totalDown == totalUp)
				System.out.print("YES");
			else
				System.out.print("NO");
			System.out.println();
		} // end for caseNum
	}
}
