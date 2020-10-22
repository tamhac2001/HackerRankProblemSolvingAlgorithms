package sherlockAndTheBeast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < testCase; tc++) {
			int temp = Integer.parseInt(br.readLine());
			if (temp < 3) {
				System.out.println(-1);
			} else if (temp % 3 == 0) {
				for (int i = 0; i < temp / 3; i++) {
					System.out.print(555);
				}
				System.out.println();
			} else {
				int counter = 0;
				while (temp % 3 != 0) {
					counter++;
					temp -= 5;
				}
				if (temp < 0)
					System.out.println(-1);
				else {
					for (int i = 0; i < temp / 3; i++) {
						System.out.print(555);
					}
					for (int i = 0; i < counter; i++) {
						System.out.print(33333);
					}
					System.out.println();
				}

			}
		}
	}

}
